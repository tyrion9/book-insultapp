package org.openshift;

import java.util.Date;
import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/insult")
public class InsultResource {
	@GET()
	@Produces("application/json")
	public HashMap<String, String> getInsult() {
		System.out.println(new Date() + " running restful service");
		HashMap<String, String> theInsult = new HashMap<String, String>();
		theInsult.put("insult", new InsultGenerator().generateInsult());
		return theInsult;
	}
}