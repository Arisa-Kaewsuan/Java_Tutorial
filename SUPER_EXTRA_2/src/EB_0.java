import java.util.Scanner;

public class EB_0
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int sum =0 ;
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println(sum);
	}

	/*public static void main(String[] args)
	{
		int  sum=0  ;
		int []n = new int[10];
		Scanner p = new Scanner(System.in);
		
		for(int i = 0 ; i < n.length ; i++)
		{
		n[i] = p.nextInt();
		sum += n[i];
		}
		System.out.println(sum);
		p.close();
	}*/
}
