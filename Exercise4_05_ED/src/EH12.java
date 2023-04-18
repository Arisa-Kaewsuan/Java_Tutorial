import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EH12
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
        int [] n = new int [10];
		ArrayList<Integer> odd = new ArrayList();
		ArrayList<Integer> even = new ArrayList(); 
		for(int i = 0 ; i < 10 ; i++)
		{
			n[i] = p.nextInt();
		}
		
		for(int i = 0 ; i < 10 ; i++)
		{
			if(n[i] % 2 == 0) 
			    even.add(n[i]);
			else
				odd.add(n[i]);
		}
		
	    Collections.sort(odd);
	    Collections.sort(even);
	    
	    System.out.println(odd.get(odd.size()-1));
	    System.out.println(odd.get(0));
	    System.out.println(even.get(even.size()-1));
	    System.out.println(even.get(0));
	}

	

}
