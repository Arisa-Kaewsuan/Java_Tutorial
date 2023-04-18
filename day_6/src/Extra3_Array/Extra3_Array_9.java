package Extra3_Array;

import java.util.Scanner;

public class Extra3_Array_9
{
	// Integrate polinomial
	public static void main(String[] args)
	{
		// ประ�?าศตัว�?ปร Array
		int[] x = new int[100]; // สปส.
		double[] y = new double[100]; // ผลลัพธ์�?าร Integrate
		int max_power = 0; // รับเลขชี้�?ำลังสูงสุด
		int i = 0, k;
		Scanner p = new Scanner(System.in);

		System.out.print("Input Max_power : "); // รับ input เป็นเลขชี้�?ำลัง
		max_power = p.nextInt();

		while (true) // รับ input จน�?ว่าผู้ใช้จะใส่ -999
		{
			System.out.print("Input Coefficient : ");
			k = p.nextInt();
			if (k == -999)
			{
				break;
			}
			x[i] = k;
			i++;
		}

		double a, b; // รับค่าขอบเขต Integrate จา�? a-b
		System.out.print("Input Border a,b : ");
		a = p.nextDouble();
		b = p.nextDouble();

		// Integrate
		for (int j = 0; j < i; j++)
		{
			if (max_power - j != -1)
			{
				y[j] = (double) x[j] / (max_power + i - j);
			} else
			{
				y[j] = (double) x[j];
			}
		}

		// �?ทน bounder
		double sum_a = 0, sum_b = 0;
		for (int j = 0; j < i; j++)
		{
			if(max_power - j != -1)
			{
			sum_a += y[j] * Math.pow(a, max_power+i-j);
			sum_b += y[j] * Math.pow(b, max_power+i-j);
			}
			else
			{
				sum_a += y[j] * Math.log(a);
				sum_b += y[j] * Math.log(b);	
			}
		}
		System.out.println(sum_b-sum_a);
		p.close();
	}
}
