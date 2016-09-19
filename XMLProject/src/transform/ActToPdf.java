package transform;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.transform.TransformerFactory;

import org.apache.fop.apps.FopFactory;
import org.xml.sax.SAXException;

import net.sf.saxon.TransformerFactoryImpl;

public class ActToPdf extends TransformersXMLtoPdf {

	public static final String ACT_RESOURCE = "C:\\Users\\Strefa\\git\\XML2016Projekat\\XMLProject\\src\\xml\\akti\\aktPdf.xsl";

	public ActToPdf(String pathToConf) throws SAXException, IOException {
		// Initialize FOP factory object
		fopFactory = FopFactory.newInstance(new File(pathToConf));

		// Setup the XSLT transformer factory
		transformerFactory = new TransformerFactoryImpl();
	}

	@Override
	public void transform(InputStream input, OutputStream output) throws Exception {

		super.transform(input, output);

	}

	@Override
	public InputStream loadXSL() throws Exception {

		InputStream in = new FileInputStream(ACT_RESOURCE);

		if (in == null)
			throw new Exception("Nije pronadjen XSL fajl");

		return in;

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

}
