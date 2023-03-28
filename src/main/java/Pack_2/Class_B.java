package Pack_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.apache.catalina.tribes.util.Arrays;

@Path("/Class_B2")

public class Class_B 
{
	@GET
	@Path("/compare/{string1}/{String2}")
	public String compare_strings(@PathParam("string1") String str1, @PathParam("String2") String str2)
	{
		Class_1 aobj=new Class_1();
		aobj.s1=str1;
		aobj.s2=str2;
		String result=aobj.compare_strings();
		return result;
	}
	@GET
	@Path("/evenoddsum/{string1}")
	public String even_odd(@PathParam("string1") String str1)
	{
		Even_Odd_Sum aobj=new Even_Odd_Sum();
		aobj.s1=str1;
		String result=aobj.even_odd();
		return result;
	}
	@GET
	@Path("/sum/{int1}/{int2}")
	public String even_odd(@PathParam("int1") int int1, @PathParam("int2") int int2)
	{
		Exception_Handling aobj=new Exception_Handling();
		aobj.n1=int1;
		aobj.n2=int2;
		String result=aobj.addition();
		return result;
	}
	@GET
	@Path("/sum/{int1},{int2}")
	public String meth1(@PathParam("int1") int num1, @PathParam("int2") int num2)
	{
		Array_Practice aobj=new Array_Practice();
		aobj.n1=num1;
		aobj.n2=num2;
		String result=aobj.meth1();
		return result;
	}
	@GET
	@Path("/data")
	public String studetails()
	{
		int ids[]= {101,102,103,104};
		String names[]= {"Ram","Sai","Durga","Rutwik"};
		int salaries[]= {14000,12000,15000,10000};
		int bonuses[]= {15,15,15,15};
		double bonusis[]= {(14000/15),(12000/15),(15000/15),(10000/15)};
		int totsals[]= {((14000/15)+15000),((12000/15)+12000),((15000/15)+15000),((10000/15)+10000)};
		Student_Array details[]=new Student_Array[4];
		for(int i=0;i<details.length;i++)
		{
			details[i]=new Student_Array(ids[i], names[i], salaries[i], bonuses[i],bonusis[i], totsals[i]);
		}
		String result="";
		for(Student_Array s:details)
		{
			result+=s.toString();
		}
		return result;
	}
	@GET
	@Path("/skills")
	public String stuskills()
	{
		int ids[]= {101,102,103,104};
		String names[]= {"Ram","Teja","Durga","Rutwik"};
		String skills[]= {"Java,Python,html","Java,Python","Java,Python,html,css,javascript","Java"};
		double exps[]= {3.0,2.2,5.4,1.7};
		double totsals[]= {((3.0*10000)+(skills.length*1000)),((2.2*10000)+(skills.length*1000)),((5.4*10000)+(skills.length*1000)),((1.7*10000)+(skills.length*1000))};
		Student_Skills details[]=new Student_Skills[4];
		for(int i=0;i<details.length;i++)
		{
			details[i]=new Student_Skills(ids[i], names[i], skills[i], exps[i], totsals[i]);
		}
		String result="";
		for(Student_Skills s:details)
		{
			result+=s.toString();
		}
		return result;
	}
	@GET
	@Path("/office/{str1}")
	public String getoffice(@PathParam("str1") String s1)
	{
		try
		{
			Office office=Office.valueOf(s1.toUpperCase());
			String msg="";
			switch(office)
			{
			case TRAINING:
				msg="Do the work";
				break;
			case CONFERENCE:
				msg="Dont distrub meeting is going on";
				break;
			case HALL:
				msg="Maintain silence";
				break;
			case KITCHEN:
				msg="Dont waste food";
				break;
			case STORE_ROOM:
				msg="All objects are here";
				break;
			}
			return msg;
		}
		catch(Exception e)
		{
			return "No such room.....";
		}
	}
	@GET
	@Path("/operations/{double1},{double2},{str1}")
	public String arith_ope(@PathParam("double1")double n1,@PathParam("double2") double n2,@PathParam("str1") String s1)
	{
		try
		{
			Arithmatic_Operations oprn=Arithmatic_Operations.valueOf(s1.toUpperCase());
			String result="";
			switch(oprn)
			{
			case ADDITION:
				result="Addition is : "+(n1+n2);
				break;
			case SUBSTRACTION:
				result="Substraction is : "+(n1-n2);
				break;
			case MULTIPLICATION:
				result="Multiplication is : "+(n1*n2);
				break;
			case DIVISION:
				result="Division is : "+(n1/n2);
				break;
			}
			return result;
		}
		catch(Exception e)
		{
			return"No Such Operation....";
		}
	}
	@GET
	@Path("/array")
	public String readdata()
	{
		My_Array<Integer,String, Double> aobj=new My_Array<>();
		aobj.assign(101, "Rutwik", 10.000);
		return "id : "+aobj.read1()+"<br>"+"Name : "+aobj.read2()+"<br>"+"Salary : "+aobj.read3();
	}
	@GET
	@Path("/iostream/{int1},{int2}")
	public String addition(@PathParam("int1") int a, @PathParam("int2") int b)throws Exception
	{
		File_Handeling aobj=new File_Handeling();
		aobj.n1=a;
		aobj.n2=b;
		String result=aobj.addition();
		return result;
	}
	@GET
	@Path("/stream")
	public String copy()throws Exception
	{
		File_Handeling2 aobj=new File_Handeling2();
		String result=aobj.copy();
		return result;
	}
	@GET
	@Path("/compression")
	public String compressed()throws Exception
	{
		Compressed aobj=new Compressed();
		String result=aobj.compress();
		return result;
	}
	@GET
	@Path("/decompression")
	public String decompressed()throws Exception
	{
		Compressed aobj=new Compressed();
		String result=aobj.decompress();
		return result;
	}
	@GET
	@Path("/ser")
	public String sereal()throws Exception
	{
		Serealization aobj=new Serealization();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Public\\Serealization.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(aobj);
		return "data saved";
	}
	@GET
	@Path("de_ser")
	public String fileToObj(@PathParam("file_name")String fileName) throws Exception 
	{
		Serealization aobj=new Serealization();
		FileInputStream fis=new FileInputStream("C:\\Users\\Public\\Serealization.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Serealization s=(Serealization)ois.readObject();
		return s.sereal();
	}
	@GET
	@Path("linenumber/{int1}")
	public String linenumbers(@PathParam("int1") int a)throws Exception
	{
		Line_Numbers aobj=new Line_Numbers();
		aobj.n1=a;
		String result=aobj.linenumbers();
		return result;
	}
	@GET
	@Path("emp/{str1}")
	public String empdetails(@PathParam("str1") String s)throws Exception
	{
		Emp_Details aobj=new Emp_Details();
		aobj.s1=s;
		String result=aobj.empdetails();
		return result;
	}
	@GET
	@Path("index/{int1}")
	public String array_index(@PathParam("int1") int a)throws Exception
	{
		Array_Index aobj=new Array_Index();
		aobj.n1=a;
		String result=aobj.array_index();
		return result;
	}
	@GET
	@Path("delete")
	public String rename(@PathParam("int1") int a)throws Exception
	{
		Rename_Filename aobj=new Rename_Filename();
		String result=aobj.Copying();
		return result;
	}
}
