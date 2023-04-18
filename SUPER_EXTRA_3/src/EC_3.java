import java.util.Scanner;

public class EC_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int[] a = new int[10];
		int max = Integer.MIN_VALUE;
		int index = 0 ;
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
			if(a[i] > max)
			{ 
				max = a[i]; 
				index = i;
			}
		}
		System.out.print(max + "\n" + index);
	}


	/*public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int [] x = new int [10];
	
		
		
		for(int i = 0 ; i < x.length ; i++)
		{
			x[i] = p.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int index_max=0;
		for(int i = 0 ; i < x.length ;i++)
		{
			if(x[i] > max)
			{
				max = x[i];
				index_max = i;
			}
		}
		System.out.println(max);
		System.out.println(index_max);
        p.close();
	}*/

}
