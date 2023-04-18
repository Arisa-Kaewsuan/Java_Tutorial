/*input : no input*/
/*output : Print triangle with number&- characters */
/*         (C8.1) use Loop */
/*         (C8.2) use Recursive */
/*Example : ---------1 */
/*          --------123 */
/*          -------54321 */
/*          ------1234567 */
/*          -----987654321 */
/*          ----1234567891011 */
/*          ---13121110987654321 */
/*          --123456789101112131415 */
/*          -1716151413121110987654321 */
/*          12345678910111213141516171819 */

public class C8
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10 - i; j++)
			{
				System.out.print("-");
			}

			if (i % 2 == 0)
			{
				for (int j = 1; j <= (2*i)-1 ; j++)
				{
					System.out.print(j);
				}
			} else
			{
				for (int k = (2*i)-1; k >= 1; k--)
				{
					if (k != 0)
					{
						System.out.print(k);
					}
				}
			}
			System.out.println();
		}

	}

}
