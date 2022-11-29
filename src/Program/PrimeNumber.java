package Program;    //okk                               

import java.util.Scanner;           // find prime = ????  .....

                                                    
public class PrimeNumber {
	                                                                              
	public static void main(String[] args)           
	{     
//		Scanner sc =new Scanner (System.in);
//		 	     
//		System.out.println("enter the number");   // divide by itself and  one --- prime number
//		int numb= sc. nextInt() ;
		
		int numb=156; //-----this line erres at time of  using scanner .
	    int count =0 ;
	
	    for(int i = 1 ; i<=numb ; i++)   //condition greater than 2 and number5-1 .
	    {
	    	if(numb%i==0)  //-------2 ,4 ,8 ,10 in this number reminder is zero
	    	{
	    	count++ ;  //  .....
	    	}
	    }
	    if(count==2)
	    {
	    	System.out.println(numb +" is not prime number");
	    }
	    else
	        System.out.println( numb +"  is prime number ");	
	}
}
//	----------------OR------------------------------------------------------------------------------------------------------------

//	public static void main(String[] args)
//	{   int numb = 300;
//		int temp= 0;	
//		for( int i = 2 ; i<=numb-1; i++)
//		{
//		     if(numb%i ==0)	
//		     {
//		    	temp = temp +1;
//		     }
//		}
//		if(temp>0)
//		  {
//			System.out.println(numb+ " is prime number");
//	      }
//		else
//			System.out.println(numb+" is not prime number");		
//	}		
//	}