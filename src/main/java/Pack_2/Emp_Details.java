package Pack_2;

import java.io.FileInputStream;

public class Emp_Details 
{
	public String s1;
	public String empdetails()throws Exception
	{
		String s2="";
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop\\Emp_Details.txt");
		int ch=fis.read();
		String data="";
		while(ch!=-1)
		{
			data+=(char)ch;
			ch=fis.read();
		}
		String val="";
		String ar[]=data.split("\n");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i].substring(0,ar[i].indexOf('=')).equals(s1.toLowerCase()))
			{
				val=ar[i].substring(ar[i].indexOf('=')+1);
			}
		}
		if(val.length()==0)
		{
			return "No data.....";
		}
		else return val;
	}
}
