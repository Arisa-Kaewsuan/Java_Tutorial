package Extra3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Extra3_Array_4
{

	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		// input array x
		for (int i = 0; i < x.length; i++)
		{
			System.out.print("Input : ");
			x[i] = p.nextInt();
		}

		// input v
		int V;
		int index_V = -1;
		System.out.println("Input a Integer : ");
		V = p.nextInt();

		// check V
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == V)
			{
				index_V = i;
				break; // ออ�?จา�? if ไปทำ if ต่อไป
			}
		}

		// delete
		if (index_V == -1)
		{
			p.close();
			return; // ออ�?จา�?โปร�?�?รมเลย
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
	}
}
