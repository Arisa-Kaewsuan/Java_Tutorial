/*input : no input*/
/*output : Print 1 - 100 only for 0dd numbers.*/
/*Example : 1 3 5 7 9 ... 99 */

public class B4
{

	public static void main(String[] args)
	{
		int i = 1;
		while(i<=100)
		{
			if(i%2 != 0)
			System.out.println(i);
			i++;
		}

	}

}
