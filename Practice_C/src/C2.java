/*input : no input*/
/*output : Print x 10*10 characters*/
/*         (C2.1) use Loop */
/*         (C2.2) use Recursive */
/*Example : xxxxxxxxxx */
/*          xxxxxxxxxx */
/*          xxxxxxxxxx */
/*          xxxxxxxxxx */
/*          xxxxxxxxxx */
/*          xxxxxxxxxx */
/*          xxxxxxxxxx */
/*          xxxxxxxxxx */
/*          xxxxxxxxxx */
/*          xxxxxxxxxx */

public class C2
{

	public static void main(String[] args)
	{
		for(int i = 1 ; i<= 10 ; i++)
		{
			for(int j = 1 ; j <= 10 ; j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}

	}

}
