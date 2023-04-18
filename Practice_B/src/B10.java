/*input : no input*/
/*output : Print 1 - 1000 only for number can be divided evenly by 3,5,7 divide into pairs (3,5 /5,7 /7,3) .*/
/*Example : 15 21 30 35 42 45 60 63 ... 990 */

public class B10
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 1000; i++)
		{
			/*if ((i % 3 == 0 && i % 5 == 0 && i%7 != 0)^(i % 5 == 0 && i % 7 == 0 && i%3 != 0))
			{
				System.out.println(i);
			}
			else if (i % 3 == 0 && i % 7 == 0 && i%5 != 0)
			{
				System.out.println(i);
			}*/
			
			if((i%3==0 && i%5==0 && i%7==0) ^ ((i%3==0 && i%5==0) || (i%3==0 && i%7==0) || (i%5==0 && i%7==0)))
			{
				System.out.println(i);
			}
		}

	}
}
