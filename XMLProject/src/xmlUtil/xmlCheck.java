package xmlUtil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import jaxB.akt.Akt;
import jaxB.amandman.Amandman;

public class xmlCheck {
	
	private static xmlCheck instance = null;
	
	public static xmlCheck getInstance(){
		if(instance == null)
			instance = new xmlCheck();
		return instance;
	}
	
	public xmlCheck(){}
	
	public Response CheckAct(Akt akt, String path) throws SAXException, JAXBException, FileNotFoundException{
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

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
	
	public Response CheckAmendment(Amandman amandman, String path){
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try{
			InputStream is = getClass().getResourceAsStream("/resources/amandman.xsd");
			if(is == null){
				System.out.println("Schema does not exist");
				return Response.status(404).build();
			}
			StreamSource schemaTypes = new StreamSource(getClass().getResourceAsStream("/resources/generic_types.xsd"));
			StreamSource schemaAmandman = new StreamSource(getClass().getResourceAsStream("/resources/amandman.xsd"));
			
			Source[] schemas = {schemaTypes,schemaAmandman};
			
			Schema schema = sf.newSchema(schemas);
			
			JAXBContext context = JAXBContext.newInstance(Amandman.class);
			
			Marshaller marsh = context.createMarshaller();
			marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        marsh.setSchema(schema);
	        try {
				marsh.marshal(amandman, new FileOutputStream(path));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}catch(JAXBException | SAXException e){
			e.printStackTrace();
			return Response.status(404).build();
		}
		return Response.status(200).entity("OK").build();
	}
}

