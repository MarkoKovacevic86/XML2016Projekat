package rest;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import jaxB.amandman.Amandman;
import sparql.MySparqlQuery;
import sparql.MyXQuery;
import xmlUtil.xmlCheck;
import xmlUtil.xmlToMlDb;
import xmldb.DBConnection;

@Path("/amendments")
public class AmendmentService {

	@GET
	@Path("/actAmendments/{id}")
	public String getAmendments(@PathParam("id") String id) throws IOException {
		System.out.println("Usao u amandman");
		System.out.println(id);
		
		
		String upit = "SELECT * FROM </propisi/amandmani/u_porceduri/metadata> {"+
				   " ?amandman <http://www.parlament.gov.rs/propisi/predicate/belongsTo> ?akt ."+
				    "{"+
				     "   SELECT * {"+
				      "      ?amandman <http://www.parlament.gov.rs/propisi/predicate/oznaka> ?oznaka ."+
				       "     ?amandman <http://www.parlament.gov.rs/propisi/predicate/naziv> ?naziv ."+
				        "}"+
				     "}"+
				    "FILTER ( str(?akt) = \"http://www.parlament.gov.rs/propisi/akti/u_proceduri/" + id + "\")"+
				"}";
				String r = MySparqlQuery.executeFromString(DBConnection.loadProperties(), upit);
		
				System.out.println(id);
				return r;
	}
	
	@GET
	@Path("/getAcceptedAmendments/{id}")
	public String getAcceptedAmendments(@PathParam("id") String id) throws IOException {
		System.out.println("Usao u amandman doneti");
		System.out.println(id);
		
		String upit = "SELECT * FROM </propisi/amandmani/doneti/metadata> {"+
				   " ?amandman <http://www.parlament.gov.rs/propisi/predicate/belongsTo> ?akt ."+
				    "{"+
				     "   SELECT * {"+
				      "      ?amandman <http://www.parlament.gov.rs/propisi/predicate/oznaka> ?oznaka ."+
				       "     ?amandman <http://www.parlament.gov.rs/propisi/predicate/naziv> ?naziv ."+
				        "}"+
				     "}"+
				    "FILTER ( str(?akt) = \"http://www.parlament.gov.rs/propisi/akti/doneti/" + id + "\")"+
				"}";
				String r = MySparqlQuery.executeFromString(DBConnection.loadProperties(), upit);
		
				System.out.println(id);
				return r;
	}
	

	@DELETE
	@Path("/deleteAmendment/{id}")
	public void removeAmendment(Amandman amandman,@PathParam("id") String amId) throws IOException {
		System.out.println("Usao u brisanje amandmana");
		System.out.println(amId);
		
		String DocQuery1 = "declare namespace sem=\"http://marklogic.com/semantics\";"+
							"for $doc in fn:collection(\"/propisi/amandmani/u_porceduri/metadata\")"+
							"where $doc/sem:triples/sem:triple[8]/sem:object = \""+ amId +"\""+
							"return base-uri($doc)";
		
		String r1 = MyXQuery.invoke(DBConnection.loadProperties(), DocQuery1);
		r1 = r1.replace("\n", "");
		String remover1 = "xdmp:document-delete(\""+ r1 + "\")";
		 MyXQuery.invoke(DBConnection.loadProperties(), remover1);
		 
		 String DocQuery2 = "declare namespace ns6=\"http://www.parlament.gov.rs/propisi/\";"+
							"for $doc in fn:collection(\"/propisi/amandmani/u_proceduri\")"+
							"where $doc/ns6:Amandman/ns6:Sporedni_deo/ns6:Meta_podaci/ns6:OznakaAmandmana = \""+ amId +"\""+
							"return base-uri($doc)";
		 System.out.println(DocQuery2);

		 String r2 = MyXQuery.invoke(DBConnection.loadProperties(), DocQuery2);
		 r2 = r2.replace("\n", "");
		 String remover2 = "xdmp:document-delete(\""+ r2 + "\")";
		 MyXQuery.invoke(DBConnection.loadProperties(), remover2);
		
		

	}

	@POST
	@Path("/suggestAmendment/{aktId}")
	@Consumes(MediaType.APPLICATION_XML)

	public Response add(Amandman amandman,@PathParam("actId") String actId) throws FileNotFoundException, SAXException, JAXBException {



	
		System.out.println("Usao u predlozi amandman");
		System.out.println(actId);

		System.out.println(actId);
		
		//create temp file
		String path = xmlCheck.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		path = path.substring(1, path.length());
		String xmlPath = "/home/student/git/XML2016Projekat3/XMLProject/src/xml/akti/Atemp.xml";
				
				//check validity
		System.out.println("Dosa do ovde");
		// check validity
		Response r = null;
		r = xmlCheck.getInstance().CheckAmendment(amandman, xmlPath);

		System.out.println("Dosa do ovde");
		System.out.println(xmlPath);
				
				//write if valid		
		if (r.getStatus() == 200) {
			try {
				xmlToMlDb.xmlToMlDb(DBConnection.loadProperties(), xmlPath, "", "/propisi/amandmani/u_proceduri", true);
				

				// create metadata
				String grddlPath = "/home/student/git/XML2016Projekat3/XMLProject/src/grddl.xsl";
				String sparqlNamedGraph = "/propisi/amandmani/u_porceduri/metadata";
				String rdfFilePath = "/home/student/git/XML2016Projekat3/XMLProject/rdf/Atemp.rdf";
				xmlUtil.RDFtoTriples.convert(DBConnection.loadProperties(), xmlPath, rdfFilePath, sparqlNamedGraph, grddlPath);

			} catch (IOException | SAXException | TransformerException e) {
				e.printStackTrace();
			}
		}

		return r;

	}

	@POST
	@Path("/update")
	public void changeStatus(String id) {
		System.out.println("Amandman za prihvatanje : " + id);

	}

}
