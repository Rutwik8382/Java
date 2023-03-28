package Pack_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class Compressed 
{
	public String compress() throws Exception
	{
		FileInputStream fin=new FileInputStream("C:/Users/Public/Durga.png");
		DeflaterInputStream din=new DeflaterInputStream(fin);
		FileOutputStream fout=new FileOutputStream("C:/Users/Public/compressed.txt");
		int ch=din.read();
		while(ch!=-1) 
		{
			fout.write(ch);
			ch=din.read();
		}
		return "compressed";
	}
	
	public String decompress() throws Exception 
	{
		FileInputStream fin=new FileInputStream("C:/Users/Public/compressed.txt");
		InflaterInputStream iin=new InflaterInputStream(fin);
		FileOutputStream fout=new FileOutputStream("C:/Users/Public/decompressed.png");
		int ch=iin.read();
		while(ch!=-1) 
		{
			fout.write(ch);
			ch=iin.read();
		}
		return "decompressed";
	}
}
