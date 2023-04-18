import java.util.Arrays;
import java.util.Scanner;

public class EC_8_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] num = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			num[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int [] kernel = new int[m];
		for(int i = 0 ; i < m ; i++)
		{
			kernel[i] = sc.nextInt();
		}
		
		int []r = new int[(n-m)+1];
		for(int i = 0 ; i < r.length; i++)
		{
			int sum = 0;
			for(int j = 0 ; j < m ; j++)
			{
				sum += num[i+j]*kernel[j];
			}
			r[i] = sum;
		}
		System.out.println(Arrays.toString(r));
	}
}
