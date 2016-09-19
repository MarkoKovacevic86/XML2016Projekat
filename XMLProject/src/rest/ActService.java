package rest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.Consumes;
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
import sparql.MyXQuery;
import transform.ActToPdf;
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

	@DELETE
	@Path("/deleteAct/{id}")
	public void removeAct(@PathParam("id") String id) throws IOException {
		System.out.println("Usao u brisanje akt");
		System.out.println(id);

		String DocQuery1 = "declare namespace sem=\"http://marklogic.com/semantics\";"
				+ "for $doc in fn:collection(\"/propisi/akti/u_porceduri/metadata\")"
				+ "where $doc/sem:triples/sem:triple[1]/sem:object = \"" + id + "\"" + "return base-uri($doc)";

		String r1 = MyXQuery.invoke(DBConnection.loadProperties(), DocQuery1);
		r1 = r1.replace("\n", "");
		String remover1 = "xdmp:document-delete(\"" + r1 + "\")";
		MyXQuery.invoke(DBConnection.loadProperties(), remover1);

		String DocQuery2 = "declare namespace p=\"http://www.parlament.gov.rs/propisi\";"
				+ "for $doc in fn:collection(\"/propisi/akti/u_proceduri\")"
				+ "where $doc/p:Akt/p:Sporedni_deo/p:Akt_u_proceduri/p:Meta_podaci/p:Oznaka = \"" + id + "\""
				+ "return base-uri($doc)";

		String r2 = MyXQuery.invoke(DBConnection.loadProperties(), DocQuery2);
		r2 = r2.replace("\n", "");
		String remover2 = "xdmp:document-delete(\"" + r2 + "\")";
		MyXQuery.invoke(DBConnection.loadProperties(), remover2);

	}

	@POST
	@Path("/addAct")
	@Produces(MediaType.APPLICATION_XML)
	public Response add(Akt akt) {
		System.out.println("Usao u add act");

		ResponseBuilder response = Response.ok();
		String about = akt.getSporedniDeo().getAbout().toString();
		if (about.contains("doneti")) {
			return response.status(400).build();
		}
		// create temp file
		String path = xmlCheck.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		path = path.substring(1, path.length());
		String xmlPath = "C:\\Users\\Strefa\\git\\XML2016Projekat\\XMLProject\\src\\xml\\akti\\temp.xml";

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
				String grddlPath = "C:\\Users\\Strefa\\git\\XML2016Projekat\\XMLProject\\src\\grddl.xsl";
				String sparqlNamedGraph = "/propisi/akti/u_porceduri/metadata";
				String rdfFilePath = "C:\\Users\\Strefa\\git\\XML2016Projekat\\XMLProject\\rdf\\temp.rdf";
				RDFtoTriples.convert(DBConnection.loadProperties(), xmlPath, rdfFilePath, sparqlNamedGraph, grddlPath);

			} catch (IOException | SAXException | TransformerException e) {
				e.printStackTrace();
			}
		}

		return r;
	}

	@POST
	@Path("/actPDF/{id}")
	@Produces("application/pdf")
	public Response getPDF(@PathParam("id") String id) throws SAXException, Exception {

		System.out.println(id);
		String kveri = "declare namespace p=\"http://www.parlament.gov.rs/propisi\";"
				+ "for $doc in fn:collection(\"/propisi/akti/doneti\")"
				+ "where $doc/p:Akt/p:Sporedni_deo/p:Donet_akt/p:Meta_podaci/p:Oznaka = \"" + id + "\" "
				+ "return ($doc)//p:Akt;";

		String result = MyXQuery.invoke(DBConnection.loadProperties(), kveri);

		if (result != "") {

			System.out.println(result);
			InputStream is = new ByteArrayInputStream(result.getBytes(StandardCharsets.UTF_8));
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			new ActToPdf("C:\\Users\\Strefa\\git\\XML2016Projekat\\XMLProject\\src\\" + "fop.xconf").transform(is, os);
			ResponseBuilder builder = Response.ok(os.toByteArray());
			builder.header("Content-Disposition", "attachment; filename=" + id + ".pdf");
			return builder.build();
		} else {

			System.out.println(id);
			String kveri1 = "declare namespace p=\"http://www.parlament.gov.rs/propisi\";"
					+ "for $doc in fn:collection(\"/propisi/akti/doneti/\")"
					+ "where $doc/p:Akt/p:Sporedni_deo/p:Akt_u_proceduri/p:Meta_podaci/p:Oznaka = \"" + id + "\" "
					+ "return ($doc)//p:Akt;";

			String result1 = MyXQuery.invoke(DBConnection.loadProperties(), kveri1);

			System.out.println(result1);
			InputStream is1 = new ByteArrayInputStream(result1.getBytes(StandardCharsets.UTF_8));
			ByteArrayOutputStream os1 = new ByteArrayOutputStream();
			new ActToPdf("C:\\Users\\Strefa\\git\\XML2016Projekat\\XMLProject\\src\\" + "fop.xconf").transform(is1,
					os1);
			ResponseBuilder builder1 = Response.ok(os1.toByteArray());
			builder1.header("Content-Disposition", "attachment; filename=" + id + ".pdf");
			return builder1.build();
		}

	}

	@POST
	@Path("/actInProcedurePDF/{id}")
	@Produces("application/pdf")
	public Response getActInProcedurePDF(@PathParam("id") String id) throws SAXException, Exception {

		System.out.println(id);
		String kveri = "declare namespace p=\"http://www.parlament.gov.rs/propisi\";"
				+ "for $doc in fn:collection(\"/propisi/akti/u_proceduri\")"
				+ "where $doc/p:Akt/p:Sporedni_deo/p:Akt_u_proceduri/p:Meta_podaci/p:Oznaka = \"" + id + "\" "
				+ "return ($doc)//p:Akt;";

		String result = MyXQuery.invoke(DBConnection.loadProperties(), kveri);
		System.out.println(result);
		InputStream is = new ByteArrayInputStream(result.getBytes(StandardCharsets.UTF_8));
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		new ActToPdf("C:\\Users\\Strefa\\git\\XML2016Projekat\\XMLProject\\src\\" + "fop.xconf").transform(is, os);
		ResponseBuilder builder = Response.ok(os.toByteArray());
		builder.header("Content-Disposition", "attachment; filename=" + id + ".pdf");
		return builder.build();

	}

}
