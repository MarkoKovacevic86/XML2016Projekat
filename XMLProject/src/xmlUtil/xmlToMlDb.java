package xmlUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;
import com.marklogic.client.document.XMLDocumentManager;
import com.marklogic.client.io.DocumentMetadataHandle;
import com.marklogic.client.io.InputStreamHandle;

import xmldb.DBConnection;
import xmldb.DBConnection.ConnectionProperties;



public class xmlToMlDb {
	
	private static DatabaseClient dbc;
	
	public static void xmlToMlDb(ConnectionProperties props, String input, String id, String collection) throws FileNotFoundException{
		
		dbc = DatabaseClientFactory.newClient(props.host, props.port, props.database, props.user, props.pass, props.authType);
		
		InputStreamHandle handle = new InputStreamHandle(new FileInputStream(input));
		
		DocumentMetadataHandle metadata = new DocumentMetadataHandle();
		metadata.getCollections().add(collection);
		
		XMLDocumentManager xdc = dbc.newXMLDocumentManager();
		
		xdc.write(id, metadata, handle);
		
		dbc.release();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Define a URI value for a document.
		String inputFile = "./src/xml/akti/Akt1_test.xml";
		//String inputFile = "data/rdfa/RS26-16-lat_primer_donetog_akta1.xml";
		String docId = "Akt1_test.xml";	//document id
		String collId = "/propisi/akti/doneti";			//collection
		xmlToMlDb(DBConnection.loadProperties(), inputFile, docId, collId);
	}
	

}
