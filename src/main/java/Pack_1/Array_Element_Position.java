package Pack_1;

public class Array_Element_Position 
{
	public int x;
	public String elementposition()
	{
		int ar[]= {345,34,456,4754,654,874,6,454,67,6767};
		if(x<ar.length)
		{
			return "On "+x+" position "+ar[x]+" is present";
		}
		else
		{
			return "Invalid index Number";
		}
	}
}
