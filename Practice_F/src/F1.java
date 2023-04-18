/*input : enter 1 Integer(n) */
/*output : Print all numbers are there in 1-n that divide n evenly */
/*Example : 20 --> 1 2 4 5 10 20 */
/*          17 --> 1 17 */
/*          21 --> 1 3 7 21 */

import java.util.Scanner;

public class F1
{
	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		
		for(int i = 1 ; i<= n ; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}

	}

	/*public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		//System.out.print("Please Input 2 Numbers : ");
		int a = p.nextInt();
		
		int k=1 ;
		while(k <= a)
		{
			if(a%k == 0)
			{
			System.out.println(k);
			}
			k++;
		}
        p.close();

	}*/

}
