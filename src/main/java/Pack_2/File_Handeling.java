package Pack_2;

import java.io.FileOutputStream;

public class File_Handeling 
{
	public int n1;
	public int n2;
	public String addition() throws Exception
	{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\user\\Desktop.txt",true);
		String data="Addition of "+n1+" and "+n2+" is : "+(n1+n2);
		fos.write(data.getBytes());
		fos.write(System.lineSeparator().getBytes());
		return "Data Saved";
	}
}
