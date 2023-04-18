package Test_OOP1;

import java.util.Scanner;

public class No_4_String {

	public static void main(String[] args) 
	{
		Scanner p = new Scanner (System.in);
	    String x = p.nextLine();
        String [] n = new String [x.length()];
        
	    for(int i = 0 ; i < n.length ; i++)
	    {
	    	n[i] = "" + x.charAt(i);
	    }
	    
	    if(n[x.length()-1].equals("b") && n[0].equals("f"))
	    {
	    	System.out.println("FizzBuzz");
	    }
	    else if(n[x.length()-1].equals("b") || !(n[0].equals("f")))
	    {
	    	System.out.println("Buzz");
	    }
	    else if(n[0].equals("f") || !(n[x.length()-1].equals("b")))
	    {
	    	System.out.println("Fizz");

	    }

	}

}
