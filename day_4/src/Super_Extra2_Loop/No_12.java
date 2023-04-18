package Super_Extra2_Loop;

import java.util.Scanner;

public class No_12
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int m, n;
		m = b - a - 1 ;
		n = c - b - 1 ;
		m = m > n ? m : n ;
		System.out.println(m);
		}
	}

}
