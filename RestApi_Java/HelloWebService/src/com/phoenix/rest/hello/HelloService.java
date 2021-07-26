package com.phoenix.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello()
	{
		return "Plain Hello";
	}
	
	@GET
	@Path("/html")
	@Produces("text/html")
	public String sayHTMLHello()
	{
		return "<html><title>HTML Hello </title><body>"
				+"<h2> HTML HELLO with path /html </h2>" 
				+"</body>"
				+ "</html>";
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public String sayXMLHello()
	{
		return "<?xml version=\"1.0\"?>" + "<myHello> Hello World XML </myHello>";

	}
	
}
