import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EC_10
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		int[] x = new int[n];
		int [] r = new int [n/2];
		int [] r2 = new int [(n+1)/2];

		for (int i = 0; i < x.length; i++)
		{
			x[i] = p.nextInt();
		}

		if (n % 2 == 0)
		{
			for (int i = 0; i < r.length; i++)
			{
				r[i] = (x[i] + x[n - (i + 1)]);
			}
			System.out.println(Arrays.toString(r));

		} else if (n % 2 != 0)
		{
			for (int i = 0; i < r2.length ; i++)
			{
				if(i == r2.length-1)
					r2[i] = x[i]*2;
				else
					r2[i] = (x[i] + x[n - (i + 1)]);
			}
			System.out.println(Arrays.toString(r2));
		}
		
	}

}
