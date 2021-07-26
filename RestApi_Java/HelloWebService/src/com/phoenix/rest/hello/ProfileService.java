package com.phoenix.rest.hello;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/profile")
public class ProfileService {
	
	@POST
	@Path("/add")
	@Produces("text/HTML")
	public Response addProfile(@FormParam("p_name") String name
			,@FormParam("p_age")String age,@FormParam("city") String city)
	{
		String output ="<h1>Profile Created Successfully</h1><br></br>"+
				"<h2>Name:" +name + "</h2><br><h2>Age:"+ age+ "</h2><br><h2>City: "+city+ "</h2>";
		return  Response.status(200).entity(output).build();
	}
	
}
