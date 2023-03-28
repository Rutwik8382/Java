package Pack_1;

import java.util.Arrays;

public class Alphabetical_Order_String 
{
	public String s1;
	public String alphabtical_order()
	{
		s1.toLowerCase();
		char ar[]=s1.toCharArray();
		Arrays.sort(ar);
		return new String(ar);
	}
}
