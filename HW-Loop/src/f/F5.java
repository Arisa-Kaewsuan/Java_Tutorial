package f;

public class F5
{

	public static void main(String[] args)
	{
		int n = 2 ,i,count ;
		while(n <= 100)
		{
			count = 0;
			i = 1;
			while(i <= n)
			{
				if(n%i == 0)
				{
					count++;
				}
				i++;
			}
			/* int i = 2 , count = 0;
			 * while(i < n)
			 * {  if(n%i == 0)
			 *    {  count++;
			 *       break;
			 *    }
			 *    i++;
			 * }
			 */
			if(count == 2)
			{
				System.out.print(n+"\t");
			}
			n++;
			/* if(count ==0)
			 * {  System.out.print(n);
			 * }
			 * n++;
			 */
		}
		

	}

}
