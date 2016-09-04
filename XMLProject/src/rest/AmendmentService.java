package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import jaxB.amandman.Amandman;

@Path("/amendments")
public class AmendmentService {

	
	

	
	@POST
	@Path("/suggestAmendment")
	@Consumes(MediaType.APPLICATION_XML)
	public Response add(Amandman amandman) {
		System.out.println("Usao u predlozi amandman");
		return null;
	}

}
