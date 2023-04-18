/*input : no input*/
/*output : Print 1 - 100 only for number can be divided evenly by 3.*/
/*Example : 3 6 9 12 ...96 99 */

public class B5
{

	public static void main(String[] args)
	{
		int i = 1 ;
		while(i <= 100)
		{
			if(i%3 == 0)
			{
				System.out.println(i);
			}
			i++ ;
		}

	}

}
