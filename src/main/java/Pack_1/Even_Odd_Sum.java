package Pack_1;

public class Even_Odd_Sum 
{
	public String even_odd(String... ar)
	{
		int sum=0;
		for(int i=0;i<=ar.length-1;i++)
		{
			if((Integer.parseInt(ar[i]))%2==0)
			{
				sum+=Integer.parseInt(ar[i]);
			}
			else
			{
				sum-=Integer.parseInt(ar[i]);
			}
		}
		return " "+sum;
	}
}
