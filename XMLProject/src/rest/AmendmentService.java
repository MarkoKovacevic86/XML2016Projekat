package rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/amendments")
public class AmendmentService {

	@POST
	@Path("/suggestAmendment")
	public Response add() {
		System.out.println("Usao u predlozi amandman");
		return null;
	}

}
