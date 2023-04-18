/*input : no input*/
/*output : Print 1 - 100 only for number can be divided evenly by 5.*/
/*Example : 5 10 15 20 25 ...95 100 */

public class B6
{

	public static void main(String[] args)
	{
		for(int i = 1 ; i <= 100 ; i++)
		{
			if(i%5 == 0)
			{
			System.out.println(i);
			}
		}

	}

}
