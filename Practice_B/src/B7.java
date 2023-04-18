/*input : no input*/
/*output : Print 1 - 100 only for number can be divided evenly by 3 and 5.*/
/*Example : 15 30 45 60 75 90 */

public class B7
{

	public static void main(String[] args)
	{
		for(int i = 1 ; i <= 100 ; i++)
		{
			if(i%3 == 0 && i%5 == 0)
			{
			System.out.println(i);
			}
		}

	}

}
