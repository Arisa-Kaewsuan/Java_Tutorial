/*input : enter 10 Integer put it in Array*/
/*output : Print numbers in array (Sort by invert enter) */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> 10 9 8 7 6 5 4 3 2 1 */
/*          3 5 9 7 11 1 15 17 19 21 --> 21 19 17 15 1 11 7 9 5 3 */

import java.util.Scanner;

public class H3
{
	public static void main(String[] args)
	{
	int [] x = new int [10];
    Scanner p = new Scanner(System.in);
    for(int i = 0 ; i<x.length ; i++)
    {
    	x[i] = p.nextInt();
    }
    for(int j = x.length-1 ;j >= 0 ; j--)
    {
    	System.out.println(x[j]); 
    }
	}
}

	/*public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			//System.out.print("Please Input Number : ");
			x[i] = p.nextInt();
		}
		
		for(int i = x.length-1 ; i>= 0 ; i--)
		{
			System.out.println(x[i]);
		}
		p.close();
	}*/


