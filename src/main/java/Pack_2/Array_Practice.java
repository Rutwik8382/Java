package Pack_2;

import java.util.Arrays;

public class Array_Practice 
{
	public int n1;
	public int n2;
	public String meth1()
	{
		int ar[]=new int[n2];
		for(int i=0;i<=ar.length-1;i++)
		{
			ar[i]=n1*(i+1);
		}
		return Arrays.toString(ar);
	}
}