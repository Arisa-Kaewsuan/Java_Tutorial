package f;

public class F6
{

	public static void main(String[] args)
	{
		int prime_count = 0;
		int n = 2 ,i,count ;
		while( prime_count<100)
		{
			count = 0;
			i = 2;
			while(i < n)
			{
				if(n%i == 0)
				{
					count++;
					break;
				}
				i++;
			}
			if(count == 0)
			{
				System.out.println(n);
				prime_count++;
			}
			n++;
		}
	}

}
