package Program;

public class Reverse_String
{
	public static void main(String[] args) 
	{
		String s = "this is string";
		String rev=" ";	
		int a = s.length();
		System.out.println(a);
		
		for(int i=a-1 ; i>=0; i--)
		{
			char ch  =s.charAt(i);
			rev= rev+ ch ;
		}
		 System.out.println(rev);
	}
}
