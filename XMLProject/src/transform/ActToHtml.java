package transform;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ActToHtml {
	public static final String ACT_RESOURCE = "./src/schema/akt_html.xsl";
	public static final String TEST_ACT = "./src/xml/akti/Prcmilojka.xml";
	public static final String HTML_FILE_TEST = "./src/html/Temp.html";
	
	public ActToHtml() {
		// TODO Auto-generated constructor stub
	}

	public void test() throws FileNotFoundException {
		InputStream is = new FileInputStream(new File(TEST_ACT)); 

		if (is == null) {
			System.out.println("NULLCINA");
			return;
		}
		
		TransformersXMLToHTML txthtml = new TransformersXMLToHTML() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public InputStream loadXSL() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		} ;
		
		OutputStream os = new ByteArrayOutputStream();
		
		try {
			txthtml.transform(is, os);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		File htmlFile = new File(HTML_FILE_TEST);

		try {
			FileOutputStream fos = new FileOutputStream(htmlFile);
			fos.write(((ByteArrayOutputStream) os).toByteArray());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	
	public InputStream loadXSL() throws Exception {
		InputStream is = new FileInputStream(new File(ACT_RESOURCE));

		if (is == null)
			throw new Exception("Nije pronadjen XSL fajl");

		return is;
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		new ActToHtml().test();
	}
}
