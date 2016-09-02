package rest;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import sparql.MySparqlQuery;
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
		return null;
	}

	@POST
	@Path("/addAct")
	public Response add() {
		System.out.println("Usao u add act");
		return null;
	}

}
