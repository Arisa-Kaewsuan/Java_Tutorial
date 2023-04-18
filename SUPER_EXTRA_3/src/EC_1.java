import java.util.Scanner;

public class EC_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int count = 0 ;
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
			if(a[i] >= 10)
			{ count++; }
		}
		System.out.println(count);
	}
	
	/*public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int[] x = new int[10];

		for (int i = 0; i < x.length; i++)
		{
			x[i] = p.nextInt();
		}
		
		int count=0 ;
		for(int i = 0 ; i < x.length ; i++)
		{
			if(x[i]>= 10)
			{
				int max = x[i];
				count++;
			}
		}
		System.out.println(count);
        p.close();         
	}*/
}
