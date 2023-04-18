/*input : enter 1 Integer(n) */
/*output : Print how many numbers are there in 1-n that divide n evenly */
/*Example : 20 --> 6 */
/*          17 --> 2 */
/*          21 --> 4 */

import java.util.Scanner;

public class F2
{
	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		int count=0;
		
		for(int i = 1 ; i<= n ; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println(count);

	}

	/*public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		//System.out.print("Please Input 2 Numbers : ");
		int a = p.nextInt();
		
		int k=1 , count=0 ;
		while(k <= a)
		{
			if(a%k == 0)
			{
			count += 1 ; 
			}
			k++;
		}
		System.out.println(count);
        p.close();
	}*/

}
