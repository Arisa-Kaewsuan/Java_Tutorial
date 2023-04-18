/*input : enter 10 Integer put it in Array*/
/*output : Print numbers in array (Sort by enter) */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> 1 2 3 4 5 6 7 8 9 10 */
/*          3 5 9 7 11 1 15 17 19 21 --> 3 5 9 7 11 1 15 17 19 21 */

import java.util.Arrays;
import java.util.Scanner;

public class H2
{
	/*public static void main(String[] args)
	{
	    int [] x = new int [10];
	    Scanner p = new Scanner(System.in);
	    for(int i = 0 ; i<x.length ; i++)
	    {
	    	x[i] = p.nextInt();
	    }
	    System.out.println(Arrays.toString(x));

	}*/

	public static void main(String[] args)
	{
	    int [] x = new int [10];
	    Scanner p = new Scanner(System.in);
	    for(int i = 0 ; i<x.length ; i++)
	    {
	    	x[i] = p.nextInt();
	    }
	    for(int j = 0 ;j < x.length ; j++)
	    {
	    	System.out.println(x[j]); 
	    }
		p.close();

	}

}
