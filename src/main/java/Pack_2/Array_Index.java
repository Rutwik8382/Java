package Pack_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Array_Index 
{
	public int n1;
	public String array_index()throws Exception
	{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\user\\Desktop\\Array_Index.txt");
		int ar[]= {10,20,30,40,50,60,70,80,90};
		fos.write(Arrays.toString(ar).getBytes());
		if(n1<ar.length)
		{
			return ar[n1]+"";
		}
		else return "No data.....";
	}
}