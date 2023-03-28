package Pack_1;

public class Vovels_Consonants 
{
	public String s1;
	public String vovelsandconsonants()
	{	
		int vCount = 0; 
		int cCount = 0;          
	    s1 = s1.toUpperCase();    
	    char ar[]=s1.toCharArray();
	    for(int i = 0; i < s1.length(); i++) 
	    {    
	    	if(ar[i]=='A'||ar[i]=='E'||ar[i]=='I'||ar[i]=='O'||ar[i]=='U')
	    	{
	    		vCount+=ar[i]-64;
	    	}
	    	else
	    	{
	    		cCount+=ar[i]-64;
	    	}
	    } 
	    return "Sum of Vowels are : "+vCount+" ,Sum of Consonants are : "+cCount;
	 }    
}
