package Pack_2;

public class My_Array<T1,T2,T3> 
{
	T1 n1;
	T2 n2;
	T3 n3;
	
	public void assign(T1 n1, T2 n2, T3 n3)
	{
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
	}
	
	public T1 read1()
	{
		return n1;
	}
	public T2 read2()
	{
		return n2;
	}
	public T3 read3()
	{
		return n3;
	}
}
