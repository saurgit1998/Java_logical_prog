package Program;

//  length of char in name is = 7,(S,A,U,R,A,B,H  ==>> 1,2,3,4,5,6,7)
		 
//  charAt is 6 ==> (S,A,U,R,A,B,H  ==> 0,1,2,3,4,5,6) Means length-1 = charAt.


public class Reverse_sentence {

	public static void main(String[] args)    
	{
       String n = "saurabh 657" ;
       String rev = " " ; 
       
	   for(int i = n.length()-1;i>=0; i--)
	   {
		   rev = rev + n.charAt(i); //-------------------------- reverse the given string .
	   }
		System.out.println(rev);
		System.out.print(rev.length()); //-----------------------calculate the number of string  /12
		
	}

}
