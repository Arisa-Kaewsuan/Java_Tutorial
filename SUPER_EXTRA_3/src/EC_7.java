import java.util.Arrays;
import java.util.Scanner;

public class EC_7
{

	public static void main(String[] args)
	{
	  for(int i=0 ; i<10 ; i++)
	  {
		  if(i == 0) { System.out.print("*|"); }
		  else { System.out.print("\t"+i); }
	  }
	  System.out.println();
	  
	  for(int i = 0 ; i<77 ; i++)
	  { System.out.print("-"); }
	  System.out.println();
	  
	  for(int i = 1 ; i<=9 ; i++)
	  {
		  for(int j = 1 ; j<10 ; j++)
		  {
			  if(j == 1) {System.out.print(i+"|"+"\t"+(i*j)); }
			  else {System.out.print("\t"+(i*j)); }
		  }
		  System.out.println();
	  }
	  
	}
}
