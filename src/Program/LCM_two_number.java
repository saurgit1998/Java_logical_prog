package Program;

public class LCM_two_number {       

	public static void main(String[] args) 
	{	
		int GCD =0; 
		int LCM =0; 
		int a = 12;  // 4*3 ....//    2*3*4===> 24 . // list common multiple 
		int b = 8 ;   // 4*2 ...//                    
		 
		 for ( int i = 1 ; i<= a && i <= b ; i++)
		   {
			    if(a%i ==0 && b% i ==00 )
			   {
				 GCD=i ; 
				 LCM = (a*b)/GCD ; 
			   }
		  }
		System.out.println(LCM);		
	}

}
