package com.demo.RestApplication;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/class")
public class My_Resourse 
{
	 @GET 
	    @Produces("text/plain")
	 public String s1()
	 {
		 return "Hi Ram";
	 }
}
