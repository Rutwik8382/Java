package Pack_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Rename_Filename 
{
	public String rename()throws Exception
	{
		String s3="";
		File rename=new File("C:\\Users\\user\\My_Foulder");
		boolean s2=rename.mkdir();
		if(s2==true)
		{
			s3+="Foulder created Successfully.....";
		}
		else s3+="Failed to create foulder....";
		return s3;
	}
	public String Copying()throws Exception
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop\\Array_Index.txt");
		int ch=fis.read();
		String data2="";
		while(ch!=-1)
		{ 
			data2+=(char)ch;
			ch=fis.read();
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\user\\My_Foulder\\Copied.txt",true);
		String data=data2;
		fos.write(data.getBytes());
		fos.write(System.lineSeparator().getBytes());
		return "Data Copied Successfully";
	}
}
