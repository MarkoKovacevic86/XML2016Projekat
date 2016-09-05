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
	public void removeAmendment(@PathParam("id") String amId) {
		System.out.println("Usao u brisanje amandmana");
		System.out.println(amId);

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
	@Path("/update/{status}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Amandman changeStatus(Amandman amandman, @PathParam("status") String status) {
		return null;
	}

}
