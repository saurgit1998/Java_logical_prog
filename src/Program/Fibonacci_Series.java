package Program;      ///okk

public class Fibonacci_Series {    // 0 ,1 ,1 ,2 , 3 , 5 , 8 , 13 , 21 , 34 -- addition of last 2 digits.

	public static void main(String[] args) {         //  Fibonacci_Series 
				
		int a = 0;
		int b = 1; 
		int c;
		
		for(int i = 1 ; i<=15 ; i++)
		{
			c= a+b;
			
			System.out.print(c+ " ");// for loop repitation c+ ,next value + previous ans
			
			a=b; 
			b=c; 
		}		 			
	}
}
