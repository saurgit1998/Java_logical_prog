package Program;  //okk
public class Palindrom_number 
{
		public static void main(String[] args)  //----Palindrom_number 
		{	
			int num = 151 ; 
			int temp = num ;  // - mirror images Ex - 121 , 151  ,1221.
			int rev =0;
			int rem=0;
			
			while ( temp != 0)
			   {
			 	  rem  =temp% 10 ;
				  rev =rev * 10+ rem ;
  				  temp = temp /10 ;	    
			   }
			if(num==rev)     
			 {
				System.out.println(num+" is palindrom number");
			 }
			else
			System.out.println(num+" is not palindrom number");
		}    
} 