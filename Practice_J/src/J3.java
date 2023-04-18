/*input : enter 10 Integer put in array */
/*output : Print Median of numbers in array */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> 5.5 */
/*          5 4 6 7 11 10 15 14 13 17 --> 10.5 */
/*          12 20 5 7 6 3 15 11 30 9 --> 10.0 */

import java.util.Arrays;
import java.util.Scanner;

public class J3
{
	public static void main(String[] args)
	{
		int []n = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < n.length ; i++)
		{
			n[i] = sc.nextInt();
		}
		//System.out.println(Arrays.toString(n));
		
		for(int i = 0 ; i < n.length ; i++)
		{
			//System.out.printf("i = %d"+"\n"+"\n",i);
			for(int j = 0 ; j < n.length-1; j++)
			{
				//System.out.printf("j = %d"+"\n",j);
				if(n[j] > n[j+1])
				{
					int t = n[j+1];
					n[j+1] = n[j];
					n[j] = t;
					
				}
			}
		}
		//System.out.println(Arrays.toString(n));
		System.out.println((n[(n.length/2)-1] + n[n.length/2]) / 2.0);
		
	}
}
