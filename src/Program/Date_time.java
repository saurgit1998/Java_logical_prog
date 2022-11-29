package Program;

import java.time.LocalDate;      //  date and time //..............
import java.time.LocalTime;
 
public class Date_time {

	public static void main(String[] args) 
	{	
        LocalDate d = LocalDate.now();		
        LocalTime t = LocalTime.now();	
        
        System.out.println(d);
        System.out.println(t);
	}
}
