package Program;

public class String_Reverse
{
	public static void main(String[] args) 
	{
	String s = "Saurabh" ;
	
	int length = s.length();

	for(int i= 0 ; i< length-1 ; i++) // one by one character 
	{
		char a = s.charAt(i);
		System.out.print(a);
	}
	for(int i= length-1 ;i>=0 ; i--)  // reverse character
	{
		char d = s.charAt(i);
		System.out.println(d+" ");
	}
	}
	
 }


