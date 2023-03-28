package Pack_1;

public class Sub_Abstract extends Super_Abstract
{
	public String s1;
	@Override
	public String abstraction()
	{
		String s2="";
		String ar[]=s1.split("");
		for(int i=ar.length-1;i>=0;i--)
		{
			s2=s2+ar[i];
		}
		if(s1.equalsIgnoreCase(s2))
		{
			return "Given String is PALINDROME";
		}
		else
		{
			return "Given String is NOT PALINDROME";
		}
	}
}
