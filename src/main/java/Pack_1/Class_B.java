package Pack_1;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/Class_B")

public class Class_B 
{
	@GET
	@Path("/position/{number}")
	@Produces(MediaType.TEXT_HTML)
	public String elementposition(@PathParam("number")String n)
	{
		String ar[]=n.split(",");
		Sum_of_Elements aobj=new Sum_of_Elements();
		return aobj.sumofelements(ar);
	}
	@GET
	@Path("/firsthtml")
	@Produces(MediaType.TEXT_HTML)
	public String getInput(@Context HttpServletRequest rq)
	{
		String s=rq.getParameter("user_name");
		return "Hello "+s;
	}
	@GET
	 
	@Path("/comparision/{string1},{string2}")
	@Produces(MediaType.TEXT_HTML)
	public String compare_string(@PathParam("string1")String str1, @PathParam("string2") String str2)
	{
		String s1=str1;
		String s2=new String(str2);
		return s1.equals(s2)+" ";
	}
	@GET
	@Path("/annualsallary/{empid},{empname},{empanualsal}")
	@Produces(MediaType.TEXT_HTML)
	public String calculate_anual_sal(@PathParam("empid") int id, @PathParam("empname") String name, @PathParam("empanualsal") long anualsal)
	{
		Annual_Salary aobj=new Annual_Salary();
		aobj.Id=id;
		aobj.Name=name;
		aobj.Anualsal=anualsal;
		String result=aobj.calculate_anual_sal();
		return result;
	}
	@GET
	@Path("/alphabetically/{string}")
	@Produces(MediaType.TEXT_HTML)
	public String alphabtical_order(@PathParam("string") String str)
	{
		Alphabetical_Order_String aobj=new Alphabetical_Order_String ();
		aobj.s1=str;
		String result=aobj.alphabtical_order();
		return result;
	}
	@GET
	@Path("/evenodd/{number}")
	@Produces(MediaType.TEXT_HTML)
	public String even_odd(@PathParam("number") String number)
	{
		String ar[]=number.split(",");
		Even_Odd_Sum aobj=new Even_Odd_Sum();
		return aobj.even_odd(ar);
	}
	@GET
	@Path("/exception/{string}")
	@Produces(MediaType.TEXT_HTML)
	public String handle(@PathParam("string") String str)
	{
		Exception_Handling_Task1 aobj=new Exception_Handling_Task1();
		aobj.s1=str;
		String result=aobj.handle();
		return result;
	}
	@GET
	@Path("/pract/{x}")
	@Produces(MediaType.TEXT_HTML)
	public int practice(@PathParam("x") int num)
	{
		Practice aobj=new Practice();
		aobj.x=num;
		int result=aobj.practice(num);
		return result;
	}
	@GET
	@Path("/lambda/{x}")
	public String lambda_expression(@PathParam("x") int n1)
	{
		Functional_Interface posneg=(m1)->
		{
			if(n1>0)
			{
				return n1+" is positive number";
			}
			if(n1<0)
			{
				return n1+" is negative number";
			}
			else 
			{
				return n1+" is zero";
			}
		};
		Functional_Interface evenodd=(m1)->
		{
			if(n1%2==0)
			{
				return n1+" is even number.";
			}
			else 
			{
				return n1+" is odd number";
			}
		};
		String result=posneg.lambda_expression(n1);
		String result2=evenodd.lambda_expression(n1);
		return result+"<br>"+result2;
	}
}