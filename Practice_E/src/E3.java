/*input : enter 2 integer (a,b) */
/*output : Print the least common multiple of 2 numbers */
/*Example : 12 24 --> 24 */
/*          18 32 --> 288 */
/*          10 15 --> 30 */

import java.util.Scanner;

public class E3
{
	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int a = p.nextInt();
		int b = p.nextInt();
		int i = 2;
		
		while(true)
		{
			if(i%a == 0 && i%b == 0)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
		p.close();		
	}

	/*public static void main(String[] args)
	{
		int LCM = 0;
		Scanner p = new Scanner (System.in);
		int a = p.nextInt();
		int b = p.nextInt();
		
		for(int i = 1 ; i <= Integer.MAX_VALUE ; i++)
		{
			if(i%a == 0 && i%b == 0)
			{
				LCM = i;
				break;
			}
		}
		System.out.println(LCM);
		p.close();		
	}*/

}
