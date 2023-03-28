package Pack_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_Handeling2 
{
	public String copy()throws Exception
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop.txt");
		int ch=fis.read();
		String data2="";
		while(ch!=-1)
		{ 
			data2+=(char)ch;
			ch=fis.read();
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Public\\Desktop.txt",true);
		String data=data2;
		fos.write(data.getBytes());
		return "Data Saved";
	}
}
