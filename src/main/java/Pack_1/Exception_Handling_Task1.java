package Pack_1;

public class Exception_Handling_Task1 
{
	public String s1;
	public String handle()
	{
		try
		{
			Integer.parseInt(s1);
			return "Integer";
		}
		catch(Exception e)
		{
			try
			{
				Double.parseDouble(s1);
				return "Double";
			}
			catch(Exception e2)
			{
				if(s1.equals("true")||s1.equals("false")||s1.equals("True")||s1.equals("False")||
						s1.equals("TRUE")||s1.equals("FALSE"))
				{
					return "Boolean";
				}
				else if(s1.length()==1)
				{
					return "Character";
				}
				else
				{
					return "String";
				}
			}
		}
	}
}
