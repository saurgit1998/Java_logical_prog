package Program;

public class Factor_of_number
{
	public static void main(String[] args) //20 = is divided by  10 ,5 , 2 ,1 .
	{
		int num =10 ;
		
		for(int i =1 ; i<=10 ; i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}			
		}  			
	}
}
