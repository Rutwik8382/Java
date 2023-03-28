package Pack_2;

public class Student_Array 
{
	int id;
	String name;
	int salary;
	int bonus;
	double bonusi;
	int totsal;
	
	public Student_Array(int id, String name, int salary, int bonus,double bonusi, int totsal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
		this.bonusi=bonusi;
		this.totsal = totsal;
	}

	public Student_Array() 
	{
		super();
	}

	@Override
	public String toString() 
	{
		return id+", "+name+", "+salary+", "+bonus+", "+bonusi+", "+totsal+"<br>";
	}
}
