package Program;

public class A
{
	public static void main(String[] args)
	{
		String s ="saurabh";
		int a = s.length();
		
		for(int i =0 ; i<a-1 ; i++)
		{
			char d = s.charAt(i);
			System.out.print(d);
		}
         for(int i = a-1 ;  i>=0 ; i--)
         {
        	 char f = s.charAt(i);
        	 System.out.println(f);
         }
	}

}
