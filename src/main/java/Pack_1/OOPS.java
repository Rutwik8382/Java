package Pack_1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/oops")
public class OOPS 
{
	@GET
	@Path("/inherit")
	@Produces(MediaType.TEXT_HTML)
	public String meth1()
	{
		Sub_Inherit aobj=new Sub_Inherit();
		return aobj.x+"";
	}
	@GET
	@Path("/abstract/{string}")
	@Produces(MediaType.TEXT_HTML)
	public String abstraction(@PathParam("string") String str)
	{
		Sub_Abstract aobj=new Sub_Abstract();
		aobj.s1=str;
		String result=aobj.abstraction();
		return result;
	}
}
