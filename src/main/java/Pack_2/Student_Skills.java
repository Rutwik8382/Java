package Pack_2;

public class Student_Skills 
{
	int id;
	String name;
	String skill;
	double exp;
	double totsal;
	public Student_Skills(int id, String name, String skill, double exp, double totsal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.skill = skill;
		this.exp = exp;
		this.totsal = totsal;
	}
	public Student_Skills() 
	{
		super();	
	}
	@Override
	public String toString() 
	{
		String ar[]=skill.split(",");
		String s3="";
		for(int i=0;i<ar.length;i++)
		{
			s3+= "Id : "+id+", "+"Name : "+name+", "+"Skills : "+ar.length+", "+"Experience : "+exp+", "+"Total Sarary : "+totsal+"<br>";
			break;
		}
		return s3;
	}	
}
