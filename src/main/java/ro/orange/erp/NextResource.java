package ro.orange.erp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("next")
public class NextResource {
	
	String greeting="HI";
	
	
	@GET
	@Produces("text/plain")
	public String getGreeting() {
		return greeting; 
	}
}
