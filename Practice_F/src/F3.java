/*input : enter 1 Integer(n) */
/*output : Print n is a prime number or not */
/*Example : 17 --> is a prime number */
/*          15 --> is not a prime number */
/*          19 --> is a prime number */

import java.util.Scanner;

public class F3
{

	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		int count=0;
		
		for(int i = 1 ; i<=num ; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		
		if(count == 2)
		{ System.out.println("is a prime number"); }
		else 
		{ System.out.println("is not a prime number"); }
		n.close();
	}
}
