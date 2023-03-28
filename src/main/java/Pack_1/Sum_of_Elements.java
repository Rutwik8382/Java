package Pack_1;

public class Sum_of_Elements 
{
	public String sumofelements(String... ar)
	{
		int sum=0;
		for(int i=0;i<=ar.length-1;i++)
		{
			sum+=Integer.parseInt(ar[i]);
		}
		return "Sum of all elements is : "+sum;
	}
}
