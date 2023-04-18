/*input : enter 10 Integer put it in Array*/
/*output : Print multiplication of number in array  */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> 3628800 */

import java.util.Scanner;

public class H7
{

	public static void main(String[] args)
	{
		int multiply = 1;
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			//System.out.println("Please Input a Numbers : ");
			x[i] = p.nextInt();
			multiply *= x[i];
		}
        System.out.println(multiply);
		p.close();

	}

}
