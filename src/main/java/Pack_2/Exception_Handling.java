package Pack_2;

public class Exception_Handling 
{
	public int n1;
	public int n2;
	public String addition()
	{
		try
		{
			if(n1<0 || n2<0)
			{
				 throw new Exception();    
			}
			else
			{
				return "Addition of given two numbers is : "+(n1+n2);
			}
		}
		catch(Exception e)
		{
			return "Don't Enter Negative Number....";
		}
	}
}
