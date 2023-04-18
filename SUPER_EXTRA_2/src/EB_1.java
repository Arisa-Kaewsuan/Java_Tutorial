import java.util.Scanner;

public class EB_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
			sum += a[i];
			if(max < a[i]) { max = a[i]; }
			if(min > a[i]) { min = a[i]; }
		}
		System.out.print(sum/10.0 + "\n" + min +"\n" + max);
	}


	/*public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int[] x = new int[10];
		int sum = 0 ;

		for (int i = 0; i < x.length; i++)
		{
			x[i] = p.nextInt();
			sum += x[i];
		}

		// Find Max
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] > max)
			{
				max = x[i];
			}
		}

		// Find Min
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] < min)
			{
				min = x[i];
			}
		}

		// Find Avg
		double avg = 0 ;
		avg = sum / 10.0 ;
		
		System.out.println(avg);
		System.out.println(min);
		System.out.println(max);
		
		p.close();
	}*/

}
