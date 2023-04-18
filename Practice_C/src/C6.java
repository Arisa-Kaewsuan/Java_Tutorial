/*input : no input*/
/*output : Print triangle with x&- characters size-10*19*/
/*         (C6.1) use Loop */
/*         (C6.2) use Recursive */
/*Example : ---------x */
/*          --------xxx */
/*          -------xxxxx */
/*          ------xxxxxxx */
/*          -----xxxxxxxxx */
/*          ----xxxxxxxxxxx */
/*          ---xxxxxxxxxxxxx */
/*          --xxxxxxxxxxxxxxx */
/*          -xxxxxxxxxxxxxxxxx */
/*          xxxxxxxxxxxxxxxxxxx */

public class C6
{

	public static void main(String[] args)
	{
		/*for(int i = 1 ; i <= 10 ; i++)
		{
			for(int j = 1 ; j <= 10-i ; j++)
			{
				System.out.print("-");
			}
			
			for(int j = 1 ; j <= (2*i)-1 ; j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}*/
		
		for(int i = 1 ; i <= 10 ; i++)
		{
			for(int j = 1 ; j <= 10-i ; j++)
			{
				System.out.print("-");
			}
			
			for(int j = 1 ; j <= (2*i)-1 ; j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
	
	

	}

}
