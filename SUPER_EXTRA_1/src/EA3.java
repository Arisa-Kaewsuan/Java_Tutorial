import java.util.Scanner;

public class EA3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		double T = sc.nextDouble();
		double L = sc.nextDouble();
		System.out.printf("%.3f",(4*Math.pow(Math.PI, 2))*L / Math.pow(T, 2));
	}

	/*public static void main(String[] args)
	{
		double T, l, g;
		Scanner p = new Scanner(System.in);
		T = p.nextDouble();
		l = p.nextDouble();

		g = l / Math.pow(T / (2 * Math.PI), 2);
		System.out.println(g);
		p.close();
	}*/

}
