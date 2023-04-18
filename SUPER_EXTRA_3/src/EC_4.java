import java.util.Arrays;
import java.util.Scanner;

public class EC_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int[] a = new int[10];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		int V = sc.nextInt();
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] == V)
			{
				for(int j = i ; j < a.length-1 ; j++)
				{
					a[j] = a[j+1];
				}
				a[a.length-1] = 0;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	/*public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		// input array x
		for (int i = 0; i < x.length; i++)
		{
			//System.out.print("Input : ");
			x[i] = p.nextInt();
		}

		// input v
		int V;
		int index_V = -1;
		//System.out.println("Input a Integer : ");
		V = p.nextInt();

		// check V
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == V)
			{
				index_V = i;
				break; // ออกจาก if ไปทำ if ต่อไป
			}
		}

		// delete
		if (index_V == -1)
		{
			p.close();
			return; // ออกจากโปรแกรมเลย
		}

		// slide
		for (int i = index_V; i < x.length - 1; i++)
		{
			x[i] = x[i + 1];
		}
		
		// add 0
		x[x.length - 1] = 0;
		System.out.println(Arrays.toString(x));
		p.close();
	}*/
}
