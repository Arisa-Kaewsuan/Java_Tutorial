import java.util.Scanner;

public class EA4219
{

	public static void main(String[] args)
	{
		double a, b, c, d, e, f, y, x;
		Scanner p = new Scanner(System.in);

		//System.out.print("Enter Value in a : ");
		a = p.nextDouble();
		//System.out.print("Enter Value in b : ");
		b = p.nextDouble();
		//System.out.print("Enter Value in c : ");
		c = p.nextDouble();
		//System.out.print("Enter Value in d : ");
		d = p.nextDouble();
		//System.out.print("Enter Value in e : ");
		e = p.nextDouble();
		//System.out.print("Enter Value in f : ");
		f = p.nextDouble();

		x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		System.out.println(x);
		System.out.println(y);
        p.close();

	}

}
