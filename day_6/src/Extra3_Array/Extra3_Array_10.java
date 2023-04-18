package Extra3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Extra3_Array_10
{

	public static void main(String[] args)
	{
		// รับ Integer n
		Scanner p = new Scanner(System.in);
		System.out.print("Input Size of Array : ");
		int n = p.nextInt();

		// รับ Input n ตัว ใส่ Array
		int[] x = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.print("Input : ");
			x[i] = p.nextInt();
		}

		// ประ�?าศ Array เ�?็บผลลัพธ์
		int[] y = new int[n % 2 == 0 ? n / 2 : n / 2 + 1];
		for (int i = 0; i < y.length; i++)
		{
			y[i] = x[i] + x[n - i - 1];
		}
		System.out.println(Arrays.toString(y));
		p.close();

		System.out.println(Arrays.toString(x));
	}
}
