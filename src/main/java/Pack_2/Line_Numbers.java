package Pack_2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Line_Numbers 
{
	public int n1;
	public String linenumbers()throws Exception
	{
		try
		{
			String line=Files.readAllLines(Paths.get("C:\\Users\\user\\Desktop\\Line_Numbers.txt")).get(n1-1);
			return line;
		}
		catch(Exception e)
		{
			return "Line does not exist.....";
		}
	}
}
