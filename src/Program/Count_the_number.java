package Program;

//After the first iteration, num will be divided by 10 and its value will be 345. Then, the count is incremented to 1.
//After the second iteration, the value of num will be 34 and the count is incremented to 2.
//After the third iteration, the value of num will be 3 and the count is incremented to 3.

public class Count_the_number {

	public static void main(String[] args)       //Count_the_number 
	{
		int count =0 ; 
		int a = 345246;
        
	    while (a!= 0) 
	    {
	      a= a/10;   
	     count ++; //----->  1,2,3,4....
	    }

	    System.out.println("Number of digits: " + count);
	  }		
}
  