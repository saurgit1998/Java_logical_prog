package Program;  //okk

public class Largest_number_among3 {

	public static void main(String[] args) 
	{	
		int a= 1095656 ;
		int b= 2455;
		int c= 30255 ;
		
		int result1 = (a<b)?((a<c)?a:c):((b<c)?b:c);		
	    System.out.println(result1 +" is low number");	
		
		int result  = (a>b)?(a>c?a:c):(b>c?b:c);				
	    System.out.println(result + " is high");
		
	}		
}	












//}----------------------------	//OR-------------------------------------------------------------------------------------------	
//		if(a>b && a >c )
//		{
//			System.out.println("a is grater number");  // find largest number among 3 number 
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println("b is grater number");
//		}
//		else if (c>a && c>b)
//		{
//			System.out.println("c is grater number");
//		}
//		else
//		    System.out.println("all are same or two  number same");
//			
//		
//			
//	}
//
//}
