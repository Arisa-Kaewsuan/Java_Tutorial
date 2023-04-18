
public class FrectalTest
{

	public static void main(String[] args)
	{
		Fractal a = new Fractal();
		a.denominator = 1;
		a.numerator = 2;
		
		Fractal b = new Fractal();
		b.denominator = 1;
		b.numerator = 2;
		
		Fractal c = new Fractal();
		c = a.add(b);
		System.out.println(c.numerator +"/"+ c.denominator);
		
		Fractal d = new Fractal();
		d = a.sub(b);
		System.out.println(d.numerator +"/"+ d.denominator);
		
		Fractal e = new Fractal();
		e = a.mul(b);
		System.out.println(e.numerator +"/"+ e.denominator);

		System.out.println(3%5);
	}

}
