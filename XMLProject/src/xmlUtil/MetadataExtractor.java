package xmlUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.SAXException;

import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;

/**
 * 
 * Primer demonstrira ekstrakciju RDFa metapodataka iz 
 * XML dokumenta primenom GRDDL transformacije.
 * 
 */
public class MetadataExtractor {
	
	private TransformerFactory transformerFactory;

	
	public MetadataExtractor() throws SAXException, IOException {
		
		// Setup the XSLT transformer factory
		transformerFactory = new TransformerFactoryImpl();
	}

	/**
	 * Generates RDF/XML based on RDFa metadata from an XML containing 
	 * input stream by applying GRDDL XSL transformation.
	 *  
	 * @param in XML containing input stream
	 * @param out RDF/XML containing output stream
	 */
	public void extractMetadata(InputStream in, OutputStream out, String grddlPath) throws FileNotFoundException, TransformerException {
		
		// Create transformation source
		StreamSource transformSource = new StreamSource(new File(grddlPath));
		
		// Initialize GRDDL transformer object
		Transformer grddlTransformer = transformerFactory.newTransformer(transformSource);
		
		// Set the indentation properties
		grddlTransformer.setOutputProperty("{http://xml.apache.org/xalan}indent-amount", "2");
		grddlTransformer.setOutputProperty(OutputKeys.INDENT, "yes");
		
		// Initialize transformation subject
		StreamSource source = new StreamSource(in);

		// Initialize result stream
		StreamResult result = new StreamResult(out);
		
		// Trigger the transformation
		grddlTransformer.transform(source, result);
		
	}
	
	
	public void test() throws Exception {

		System.out.println("[INFO] " + MetadataExtractor.class.getSimpleName());
		
		String filePath = "rdf/Prcmilojka.rdf";
		
		InputStream in = new FileInputStream(new File("./src/xml/akti/Prcmilojka.xml")); 

		OutputStream out = new FileOutputStream(filePath);
		String grddlPath = "rdf/grddl.xsl";

		extractMetadata(in, out, grddlPath);
		
		System.out.println("[INFO] File \"" + filePath + "\" generated successfully.");
		
		System.out.println("[INFO] End.");

	}

	public static void main(String[] args) throws Exception {
		new MetadataExtractor().test();
	}

}