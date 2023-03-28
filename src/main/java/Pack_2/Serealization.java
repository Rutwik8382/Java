package Pack_2;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Serealization implements Serializable
{
	public String sereal()
	{
		Object std1[]= {101,"Rutwik","Hyderabad",10000};
		Object std2[]= {102,"Ram","Pune",12000};
		Object std3[]= {103,"Durga","Mumbai",15000};
		Object std4[]= {104,"Teja","Delhi",13000};
	
		return Arrays.toString(std1)+"<br>"+Arrays.toString(std2)+"<br>"+Arrays.toString(std3)+"<br>"+Arrays.toString(std4);
	}
}

