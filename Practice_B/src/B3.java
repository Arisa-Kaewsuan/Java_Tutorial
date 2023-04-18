/*input : no input*/
/*output : Print 1 - 100 only for even numbers.*/
/*Example : 2 4 6 8 ... 100 */

public class B3
{

	public static void main(String[] args)
	{
		int i = 1 ;
		while(i <= 100)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
