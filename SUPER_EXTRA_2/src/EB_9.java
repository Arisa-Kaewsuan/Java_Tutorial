
public class EB_9
{
	public static void main(String[] args)
	{
		double n = 50000.0 ;
		double hm = 1.0;
		for(int i = 2 ; i <= n ; i++)
		{
			hm += 1.0/i;
		}
        System.out.printf("%.3f",hm);
	}


	/*public static void main(String[] args)
	{
		int n = 50000 ;
		double sum = 0 ;
		for(int i = 1 ; i <= n ; i++)
		{
			sum += 1.0/i ;
		}
		System.out.println(sum);

	}*/

}
