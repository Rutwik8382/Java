package Pack_1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Class_A")
public class ClassA 
{
	@GET
	@Path("/next_letter/{s1}")
	@Produces(MediaType.TEXT_HTML)
	public String next_letter(@PathParam("s1") String s1)
	{
		char ar[]=s1.toCharArray();
		String s2="";
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			count=ar[i]+1;
			char c=(char)count;
			s2=s2+c;
		}
		return s2;
	}
	@GET
	@Path("/Square/{number}")
	@Produces(MediaType.TEXT_HTML)
	public String square(@PathParam("number")int n)
	{
		Square_Root aobj=new Square_Root();
		aobj.x=n;
		int sq=aobj.square();
		return "Square of "+n+" is : "+sq;
	}
	@GET
	@Path("/longest/{string}")
	@Produces(MediaType.TEXT_HTML)
	public String longestword(@PathParam("string")String str)
	{
		Longest_Word aobj=new Longest_Word();
		aobj.s1=str;
		String result=aobj.longestword();
		return result;
	}
	@GET
	@Path("/vowelconsonant/{string}")
	@Produces(MediaType.TEXT_HTML)
	public String vovelsandconsonants(@PathParam("string")String str)
	{
		Vovels_Consonants aobj=new Vovels_Consonants();
		aobj.s1=str;
		String result=aobj.vovelsandconsonants();
		return result;
	}
	/*@GET
	@Path("/position/{number}")
	@Produces(MediaType.TEXT_HTML)
	public String elementposition(@PathParam("number")String n)
	{
		String ar[]=n.split(",");
		Sum_of_Elements aobj=new Sum_of_Elements();
		return aobj.sumofelements(ar);
	}*/
	
}
