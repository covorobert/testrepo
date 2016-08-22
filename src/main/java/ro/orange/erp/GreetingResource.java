package ro.orange.erp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("greeting")
public class GreetingResource {
	
	Greeting greeting;
	
	public GreetingResource() {
		greeting = new Greeting(1, "Hello World!");
	}
	
	@GET
	@Produces("application/json")
	public Greeting getGreeting() {
		return greeting; 
	}
}
