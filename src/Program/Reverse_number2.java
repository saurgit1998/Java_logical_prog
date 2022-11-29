package Program;
public class Reverse_number2 
{
	public static void main(String[] args)  // reversed same as palindrom number ........................
   {	 	 	
	int num =54565;
//	int num =temp;
    int rev=0 ;
    int rem ;
     
     while(num!=0) // -----number is not equals to 0 .
       {
    	rem =num%10 ;  //     54565%10= 5 , 5456%10 =6 , 545%10 =5 , 54%10 =4 , 5%10 =5
    	rev =(rev*10)+rem ; //  0+ 5 =5  ,   0+6 =6    , 0+5 = 5   ,  0+4 = 4 , 0+ 5 = 5 
    	num =num/10 ;  // loop repetition only -54565/10 =5456 , 5456/10= 545 , 545/10=54 , 54/10=5 	  	 
       }
       System.out.println(rev);
   }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		