package Pack_2;

public class Class_1 
{
	public String s1;
	public String s2;
	public String compare_strings()
	{
		char ar1[]=s1.toCharArray();
		char ar2[]=s2.toCharArray();
		String str=s2;
		for(int i=0;i<=s1.length()-1;i++)
		{
			for(int j=0;j<=s2.length()-1;j++)
			{
				if(ar1[i]==ar2[j])
				{
					str=str.replace(ar2[j], '*');
				}
			}
		}
		return s1+" "+str;
	}
}
