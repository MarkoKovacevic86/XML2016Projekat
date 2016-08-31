package xmlUtil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.ws.rs.core.Response;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import jaxB.akt.Akt;

public class xmlCheck {
	
	private static xmlCheck instance = null;
	
	public static xmlCheck getInstance(){
		if(instance == null)
			instance = new xmlCheck();
		return instance;
	}
	
	public Response CheckAct(Akt akt, String path) throws SAXException, JAXBException, FileNotFoundException{
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
		if(sf == null){
			System.out.println("Schema not valid or non existant");
			return Response.status(404).build();
		}
		
		StreamSource schemaAkt = new StreamSource(getClass().getResourceAsStream("/schema/akt.xsd"));
		
		Schema schema = sf.newSchema(schemaAkt);
		JAXBContext context = JAXBContext.newInstance(Akt.class);
		
		Marshaller marsh = context.createMarshaller();
		marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marsh.setSchema(schema);
		
		marsh.marshal(akt, new FileOutputStream(path));
		
		return Response.status(200).entity("OK").build();
		
	}

}
