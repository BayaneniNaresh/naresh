package Naresh;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
@Path("/h")
public class helloWorld{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{name}")
	public String getHello(@Context HttpHeaders httpHeaders,@PathParam("name") String name) {
		return "Hello World,My Name is "+name;
		
	}
}
