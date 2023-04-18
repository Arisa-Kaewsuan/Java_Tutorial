/*input : enter 10 Integer put in array */
/*output : Print Sorted array (Descending) */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> [10,9,8,7,6,5,4,3,2,1] */

import java.util.Arrays;
import java.util.Scanner;

public class J2
{

	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			//System.out.print("Please Input a Number : ");
			x[i] = p.nextInt();
		}
		
		for(int j = 0 ; j < x.length ; j++)
		{
			for(int i = 0 ; i < x.length-1 ; i++)
			{
				if(x[i] < x[i+1])
				{
					int a = x[i];
					x[i] = x[i+1];
					x[i+1] = a; 
				}
			}
		}
		System.out.println(Arrays.toString(x));
		p.close();


	}

}
