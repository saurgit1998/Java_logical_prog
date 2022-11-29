package Program;  //okk

public class Leap_year 
{

	public static void main(String[] args)  // find  given leap year  //
	{
		int year = 1705 ; // ----------%100 bcz senturian year like 1700 is not leap year
		
		if (year%4==00 &&  (year%100!=0)  || year%400==00 )//--%400 is every senturian year .ex -2000 year
		{                                                   //   and year%100 ! used separate  bracket .
		  System.out.println(" is a leap year");
		}
		else
		  System.out.println("not leap year");		
   }
}
