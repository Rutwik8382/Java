package com.demo.RestApplication;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Array_List1")
public class Array_List1 
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Super_Class> getstudentdetails()
	{
		Super_Class s1=new Super_Class("101","Rutwik","BCA","a");
		Super_Class s2=new Super_Class("102","Ram","MCA","b");
		Super_Class s3=new Super_Class("103","Sai","MSC","c");
		Super_Class s4=new Super_Class("104","Teja","B.COM","d");
		
		List<Super_Class> al=new LinkedList<Super_Class>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		return al;
	}
	
	@GET
	@Path("/Array_List2/{Z}")
	@Produces(MediaType.TEXT_HTML)
	public String Arithmatic_Operations(@PathParam("Z") int a)
	{
		String result="";
		for(int i=1;i<=10;i++)
		{
			result+=a+" * "+i+" = "+a*i+"<br>";
		}
		return result;
	}
	
	@GET
	@Path("/Array_List3/{z}/{a}")
	@Produces(MediaType.TEXT_HTML)
	public String Arrays(@PathParam("z") int i, @PathParam("a") String j)
	{
		String ar[]=new String[i];
		for(int k=0;k<=i;k++)
		{
			ar[k]="0";
		}
		String str=j;
		String ch[]=str.split(",");
		if(ch.length<=ar.length)
		{
			for(int z=0;z<ch.length;z++)
			{
				ar[z]=ch[z];
			}
		}
		else 
		{
			for(int z=0;z<i;z++)
			{
				ar[z]=ch[z];
			}
		}
		return Arrays.toString(ar);
	}
	
	@GET
	@Path("/Array_List4/{s1}")
	@Produces(MediaType.TEXT_HTML)
	public String vovels(@PathParam("s1") String s1)
	{
		return s1.replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U");
	}
}
