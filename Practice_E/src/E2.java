/*input : enter 2 integer (a,b) */
/*output : Print the Greatest Common Factor of 2 numbers */
/*Example : 12 32 --> 4 */
/*          25 10 --> 5 */
/*          100 60 --> 20 */

import java.util.Scanner;

public class E2 
{
	public static void main (String args[])
	{
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int max = (n2>n1)? n2:n1;
	
	for(int i = max ; i>= 1 ; i--)
	{
		if((n1%i == 0) && (n2%i==0))
		{
			System.out.println(i);
			return;
		}
	}
	}
}
