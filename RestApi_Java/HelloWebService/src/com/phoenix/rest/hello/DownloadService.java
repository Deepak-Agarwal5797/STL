package com.phoenix.rest.hello;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/downloads")
public class DownloadService {

	@GET  
    @Path("/textfile")  
    @Produces("text/plain")  
    public Response getTextFile() {  
        File file = new File("D:\\files\\hello.txt");  
   
        return Response.ok(file).header("Content-Disposition","attachment; filename='hello_client.txt'")  
        .build();  
   
    }  

	@GET  
    @Path("/pdf")  
    @Produces("application/pdf")  
    public Response getPdfFile() {  
        File file = new File("D:\\files\\hello.pdf");  
   
        return Response.ok(file).header("Content-Disposition","attachment; filename='hello_client.pdf'")  
        .build();  
   
    }  
	@GET  
    @Path("/photo")  
    @Produces("image/jpg")  
    public Response getImage() {  
        File file = new File("D:\\files\\hello.jpg");  
   
        return Response.ok(file).header("Content-Disposition","attachment; filename='hello_client.jpg'")  
        .build();  
   
    }  
}
