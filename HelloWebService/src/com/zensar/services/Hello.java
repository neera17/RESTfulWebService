package com.zensar.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/zenhello")               //URI used in URL
public class Hello {             //Restful WebService accessed from URI
	
	@GET                                      
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello()             //uses Path to be accessed using HTTP method @GET
	{
		return "Hello from Aristotle,Himalaya,Zensar,Kharadi,Pune,Maharashtra,India.";
		
	}
	
	@Path("/welcome")
	@GET                                      
	@Produces("text/html")
	public String sayHTMLHello()
	{
		return "<body bgcolor='pink'>" + "<p> Welcome To Zensar <p>" + "</body>";
	}
	
	@Path("/test")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello()
	{
		return "<?xml version='1.0'?>" +
	    "<messages>" +
	    "<message>Hello World!</message>" +
	    "</messages>";
	}

}
