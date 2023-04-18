/*input : enter 10 Integer put it in Array*/
/*output : Print sum of number in array  */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> 55 */
/*          11 12 13 14 15 16 17 18 19 20 --> 155 */

import java.util.Scanner;

public class H6
{

	public static void main(String[] args)
	{
		int sum = 0;
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			//System.out.println("Please Input a Numbers : ");
			x[i] = p.nextInt();
			sum += x[i];
		}
        System.out.println(sum);
		p.close();


	}

}
