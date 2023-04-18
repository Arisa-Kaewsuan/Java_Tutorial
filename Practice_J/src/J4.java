/*input : enter 10 Integer put in array */
/*output : Print Mode of numbers in array & how many duplicates? */
/*Example : 1 1 2 1 2 4 5 6 7 8 --> 1 3 */
/*          4 4 4 5 5 6 1 2 3 7 --> 4 3 */
/*          7 7 7 4 4 1 1 5 8 7 --> 7 4 */

import java.util.Scanner;

public class J4
{
	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int[] a = new int[10];
		for(int k = 0 ; k < a.length ; k++)
		{
			a[k] = p.nextInt();
		}
		int maxValue = 0, maxCount = 0, i, j;

		for (i = 0; i < a.length; ++i)
		{
			int count = 0;
			for (j = 0; j < a.length; ++j)
			{
				if (a[j] == a[i])
					++count;
			}
			if (count > maxCount)
			{
				maxCount = count;
				maxValue = a[i];
			}
		}
		System.out.println(maxValue+"\n"+maxCount);
		
	}
}
