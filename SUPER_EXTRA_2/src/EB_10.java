
public class EB_10
{
	public static void main(String[] args)
	{
		double n = 50000.0;
		double pi = 1.0;
		for(int i = 1 ; i <= n ; i++)
		{
			if(i%2 == 0) { pi += (1/((i*2.0)+1.0)); }
			else if(i%2 != 0) {pi -= (1/((i*2.0)+1.0)); }
		}
		System.out.println(4.0*pi);

	}


	/*public static void main(String[] args)
	{
		double sum = 0 ;
		int n = 50000 ;
		for(int i = 1 ; i <= n ; i++)
		{
			int k = 2*i-1;
			sum += 1.0/k ;
			i++;
			k = 2*i-1 ;
			sum -= 1.0/k;
		}

        System.out.println(sum*4);

	}*/

}
