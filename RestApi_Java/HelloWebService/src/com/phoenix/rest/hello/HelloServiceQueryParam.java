package com.phoenix.rest.hello;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/helloquery")
public class HelloServiceQueryParam {
	
	@GET
	@Path("/greet")
	@Produces("text/html")
	public String greetUser(@QueryParam("nm")String name)
	{
		return "Hello:" +name;
	}
	
	@GET
	@Path("/user")
	@Produces("text/html")
	public Response greetUserWithResponse(@QueryParam("nm")String name)
	{
		return Response.status(200).entity("<body><h2> Hello User:"+ name +"</h2></body>").build();
	}
	
	@GET
	@Path("/date")
	@Produces("text/html")
	public Response greetUserWithResponse(@QueryParam("dd")int day,@QueryParam("dd")int month,@QueryParam("dd")int year)
	{
		return Response.status(200).entity("<body><h2> Hello User:"+ LocalDate.of(year, month, day) +"</h2></body>").build();
	}
}
