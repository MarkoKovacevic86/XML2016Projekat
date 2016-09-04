package rest;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import jaxB.akt.Akt;
import sparql.MySparqlQuery;
import xmlUtil.RDFtoTriples;
import xmlUtil.xmlCheck;
import xmlUtil.xmlToMlDb;
import xmldb.DBConnection;

@Path("/acts")
public class ActService {

	@GET
	@Path("/getActs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getActiveActs() {
		System.out.println("Usao u aktove");
		MySparqlQuery q = new MySparqlQuery(MySparqlQuery.AKT_DONET);
		String metadataCollection = "/propisi/akti/doneti/metadata";
		ResponseBuilder response = Response.ok();
		try {
			System.out.println(response);
			return response.status(200).entity(q.execute(DBConnection.loadProperties(), metadataCollection, false))
					.build();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return response.status(400).build();
		}
	}

	@GET
	@Path("/getActsInProcedure")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getActsInProcedure() {
		System.out.println("Usao u aktove u procjeduri");
		MySparqlQuery q = new MySparqlQuery(MySparqlQuery.AKT_U_PROCEDURI);
		String metadataCollection = "/propisi/akti/u_porceduri/metadata";
		ResponseBuilder response = Response.ok();
		try {
			System.out.println(response);
			return response.status(200).entity(q.execute(DBConnection.loadProperties(), metadataCollection, false))
					.build();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return response.status(400).build();
		}
	}

	@POST
	@Path("/addAct")
	@Produces(MediaType.APPLICATION_XML)
	public Response add(Akt akt) {
		System.out.println("Usao u add act");

		ResponseBuilder response = Response.ok();
		String about = akt.getSporedniDeo().getAbout().toString();
		if(about.contains("doneti")){
			return response.status(400).build();
		}
		//create temp file
				String path = xmlCheck.class.getProtectionDomain().getCodeSource().getLocation().getPath();
				path = path.substring(1, path.length());
				String xmlPath = "/home/student/git/XML2016Projekat/XMLProject/src/xml/akti/temp.xml";



		System.out.println("Dosa do ovde");
		// check validity
		Response r = null;
		try {
			r = xmlCheck.getInstance().CheckAct(akt, xmlPath);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SAXException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Dosa do ovde");
		System.out.println(xmlPath);

		// write if valid
		if (r.getStatus() == 200) {
			try {
				xmlToMlDb.xmlToMlDb(DBConnection.loadProperties(), xmlPath, "", "/propisi/akti/u_proceduri", true);
				// String oznaka =
				// akt.getSporedniDeo().getDonetAkt().getMetaPodaci().getOznaka().toString();

				// create metadata
				String grddlPath = "/home/student/git/XML2016Projekat/XMLProject/src/grddl.xsl";
				String sparqlNamedGraph = "/propisi/akti/u_porceduri/metadata";
				String rdfFilePath = "/home/student/git/XML2016Projekat/XMLProject/rdf/temp.rdf";
				RDFtoTriples.convert(DBConnection.loadProperties(), xmlPath, rdfFilePath, sparqlNamedGraph, grddlPath);

			} catch (IOException | SAXException | TransformerException e) {
				e.printStackTrace();
			}
		}

		return r;
	}

	@DELETE
	@Path("/deleteAct/{id}")
	public void removeAmendment(@PathParam("id") String Actid) {
		System.out.println("Usao u brisanje akt");
		System.out.println(Actid);

	}
}
