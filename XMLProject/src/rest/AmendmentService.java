package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import jaxB.amandman.Amandman;

@Path("/amendments")
public class AmendmentService {

	@GET
	@Path("/actAmendments/{id}")
	public String getAmendments(@PathParam("id") String id) {
		return id;
	}

	@DELETE
	@Path("/deleteAmendment/id")
	public void removeAmendment(@PathParam("amId") String amId) {

	}

	@POST
	@Path("/suggestAmendment")
	@Consumes(MediaType.APPLICATION_XML)
	public Response add(Amandman amandman) {
		System.out.println("Usao u predlozi amandman");
		return null;
	}

	@POST
	@Path("/update/{status}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Amandman changeStatus(Amandman amandman, @PathParam("status") String status) {

		return null;
	}

}
