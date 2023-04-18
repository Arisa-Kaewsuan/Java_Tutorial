/*input : enter 10 Integer put it in Array*/
/*output : Print 'have' or 'don't have' even numbers*/
/*Example : 1 2 3 4 5 6 7 8 9 10 --> have */
/*          3 5 9 7 11 1 15 17 19 21 --> don't have */

import java.util.Scanner;

public class H1
{
	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);
		int count = 0;
		
		for(int i = 0 ; i < x.length ; i++)
		{
			x[i]= p.nextInt();
			if(x[i]%2==0) {count++;}
		}
		if(count > 0) {System.out.println("have");}
		else {System.out.println("don't have");}
	}

	/*public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);
		int i, j, count = 0;
		for (i = 0; i < x.length; i++)
		{
			x[i] = p.nextInt();
		}

		for (j = 0; j < x.length; j++)
		{
			if (x[j] % 2 == 0)
			{
				count++;
			}

		}
		if (count > 0)
		{
			System.out.println("have");
		}
		else
		{
		System.out.println("don't have");
		}

		p.close();
	}*/

}
