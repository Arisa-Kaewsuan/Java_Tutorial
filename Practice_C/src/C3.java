/*input : no input*/
/*output : Print triangle with x characters size-10*10 */
/*         (C3.1) use Loop */
/*         (C3.2) use Recursive */
/*Example : x */
/*          xx */
/*          xxx */
/*          xxxx */
/*          xxxxx */
/*          xxxxxx */
/*          xxxxxxx */
/*          xxxxxxxx */
/*          xxxxxxxxx */
/*          xxxxxxxxxx */

public class C3
{

	public static void main(String[] args)
	{
		for(int i = 1 ; i <= 10 ; i++)
		{
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}

	}

}
