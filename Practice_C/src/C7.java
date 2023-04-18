/*input : no input*/
/*output : Print triangle with number&- characters */
/*         (C7.1) use Loop */
/*         (C7.2) use Recursive */
/*Example : ---------1 */
/*          --------121 */
/*          -------12321 */
/*          ------1234321 */
/*          -----123454321 */
/*          ----12345654321 */
/*          ---1234567654321 */
/*          --123456787654321 */
/*          -12345678987654321 */
/*          12345678910987654321 */

public class C7
{

	public static void main(String[] args)
	{
		/*for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10 - i; j++)
			{
				System.out.print("-");
			}

			for (int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--)
			{
				if (k != 0)
				{
					System.out.print(k);
				}
			}

			System.out.println();
		}*/
		
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10 - i; j++)
			{
				System.out.print("-");
			}

			for (int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--)
			{
				
					System.out.print(k);
			}

			System.out.println();
		}

	}

}
