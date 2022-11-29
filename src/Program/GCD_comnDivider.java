package Program;  // ok

public class GCD_comnDivider 
{
	public static void main(String[] args)    // greatest common divider by two number
{		
        int n1 = 50;                         // printing statment not manditory [[ "gcd of "+ n1 + " and "+n2+"  is = "   +]]
        int n2 = 150;  
        int gcd= 1;
       
        for(int i = 1; i<=50 && i<=150; ++i )       
		if(n1%i==0  && n2%i== 0 )	 
		gcd= i;
		  {
			System.out.println("gcd of "+ n1 + " and "+n2+"  is = "   +gcd);
          }	
}		
}	

/*  ===================== // all examples are correct //***************========================
		{
			int n1 =966; int n2= 664; int gcd= 1;
			
			for(int i = 1 ; i<=100 && i<=600 ; ++i)
			if( n1%i==00 && n2%i==00)
			gcd= i;
			{
			System.out.println(+gcd);
			}	
	}}}
		
		
		
{   int a = 100; int b= 220 ; int cdm= 1;

	for(int i = 1  ; a>=i&& b>=i ; i++)
		if( a%i==00 && b%i ==00)
			cdm= i;
	{
		System.out.println(cdm);
	}
}	
	}}	
		
*/	
	

		
		
		
		
		
		
		
		
		
		
		
		