/*input : no input */
/*output : Print all prime number (first 100 numbers) */
/*Example : 2 3 5 7 11 13 17 ... 541 */

public class F6
{
	public static void main(String[] args)
	{
		int num = 0;
		
		for(int i = 1 ; i > 0 ; i++)
		{
			int count=0;
			for(int j = 1; j <= i ; j++)
			{
				if(i%j == 0)
				{ count++; }
			}
			
			if(count == 2)
			{ System.out.println(i);
			  num++;
			}
			else if(num == 100)
			{
				break;
			}
		}
		//System.out.println(num);
	}
}
