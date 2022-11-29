package Program;



public class Palindrom_String {
	  public static void main(String[] args) {        // if (s.toLowerCase().equals(rev.toLowerCase())) 

	    String s = "aabbaa", rev = "";
	    
	    int Length = s.length();

	    for (int i = Length - 1; i >=0; --i) 
	    {
	      rev = rev + s.charAt(i);
	    }	 
	    if(s.equals(rev))
	    {
	      System.out.println(s + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(s + " is not a Palindrome String.");
	    }
	  }
	}
