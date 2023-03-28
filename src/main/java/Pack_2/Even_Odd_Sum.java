package Pack_2;

public class Even_Odd_Sum 
{
	public String s1;
	public String even_odd()
	{
		String ar[]=s1.split(" ");
		String s2="";
		for(int i=0;i<=ar.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i].length()%2==0)
				{
					count++;
				}
			}
			if(ar[i].length()%2==0)
			{
				s2+=ar[i].substring(((ar[i].length()/2)-1),(ar[i].length()/2)+1)+" ";
			}
			else 
			{
				s2+=ar[i].substring((ar[i].length()/2),(ar[i].length()/2)+1)+" ";
			}
		}
		return s2;
	}
}
