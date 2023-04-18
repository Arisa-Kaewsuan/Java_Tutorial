/*input : enter 10 Integer put it in Array*/
/*output : Print how many even numbers in array?  */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> 5 */
/*          11 12 13 14 15 16 17 18 19 20 --> 5 */

import java.util.Scanner;

public class H5
{
	public static void main(String[] args)
	{
		int[] a = new int[10];
		int count=0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
			if(a[i]%2 == 0){count++;}
		}
		System.out.println(count);
	}

	/*public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			//System.out.print("Please Input a Number : ");
			x[i] = p.nextInt();
		}
		
		int count = 0 ;
		for(int i = 0 ; i < x.length ; i++)
		{
			if(x[i]%2 ==0)
			{
				count++;
			}
		}
		System.out.println(count);
		p.close();

	}*/

}
