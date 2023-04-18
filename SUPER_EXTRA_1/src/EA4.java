import java.util.Scanner;

public class EA4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		double A = sc.nextDouble();
		double L = sc.nextDouble();
		System.out.println(1.59e-8*(L/A));
	}

	/*public static void main(String[] args)
	{
		double A, l, p = 1.59e-8, R;
		Scanner x = new Scanner(System.in);
		A = x.nextDouble();
		l = x.nextDouble();

		R = p * (l / A);
		System.out.println(R);
		x.close();
	}*/

}
