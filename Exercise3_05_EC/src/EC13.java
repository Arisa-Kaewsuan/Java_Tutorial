import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EC13
{

	public static void main(String[] args)
	{
      Scanner p = new Scanner (System.in);
      int num = p.nextInt();
      String n = Integer.toString(num);
      ArrayList<String> N = new  ArrayList<String>();
      
      // String --> Char --> StringChar in Array
      for(int i = 0; i < n.length() ; i++)
      {
    	 N.add( n.charAt(i) + "");
      }
      
      int count = 1;
      for(int i = N.size()-1 ; i > 0 ; i--)
      {
    	  if(count %3 == 0 && count !=0)
    	  {
    		  N.add(i, ",");
    	  }
    	  count++;
      }
      
      for(String j : N)
      {
    	  System.out.print(j);
      }
      
	}
	
	public static String  toString(int n)
	{
		return Integer.toString(n);
	}

}
