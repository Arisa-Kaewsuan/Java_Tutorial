package Method;

public class FractalTest
{

	public static void main(String[] args)
	{
		Fractal a = new Fractal ();
		a.numerator = 1;
		a.denominator = 2;
		
		Fractal b = new Fractal();
		b.numerator = 1;
		b.denominator = 2;
		Fractal c = a.add(b);
		System.out.println(c.numerator + " / " + c.denominator);
		
		System.out.println(Fractal.GCD(5, 16));

	}

}
