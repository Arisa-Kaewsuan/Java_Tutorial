/*input : no input*/
/*output : Print inverted triangle with x characters size-10*10 */
/*         (C4.1) use Loop */
/*         (C4.2) use Recursive */
/*Example : xxxxxxxxxx */
/*          xxxxxxxxx */
/*          xxxxxxxx */
/*          xxxxxxx */
/*          xxxxxx */
/*          xxxxx */
/*          xxxx */
/*          xxx */
/*          xx */
/*          x */

public class C4
{

	public static void main(String[] args)
	{
		/*for(int i = 1 ; i <= 10 ; i++)
		{
			for(int j = 1 ; j <= 11-i ; j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}*/
		
		for(int i = 10 ; i >= 1 ; i--)
		{
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}

	}

}
