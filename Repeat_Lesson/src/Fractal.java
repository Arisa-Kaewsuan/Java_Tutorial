
public class Fractal
{
	public int numerator;
	public int denominator;

	public Fractal add(Fractal f)
	{
		Fractal result = new Fractal();
		result.denominator = denominator * f.denominator;
		result.numerator = (numerator * f.denominator) + (f.numerator * denominator);
		int gcd = GCD(result.numerator, result.denominator);
		result.numerator /= gcd ;
		result.denominator /= gcd;
		return result;
	}

	public Fractal sub(Fractal f)
	{
		Fractal result = new Fractal();
		result.denominator = denominator * f.denominator;
		result.numerator = (numerator * f.denominator) - (f.numerator * denominator);
		int gcd = GCD(result.numerator, result.denominator);
		result.numerator /= gcd ;
		result.denominator /= gcd;
		return result;
	}

	public Fractal mul(Fractal f)
	{
		Fractal result = new Fractal();
		result.denominator = denominator * f.denominator;
		result.numerator = numerator *  f.numerator ;
		int gcd = GCD(result.numerator, result.denominator);
		result.numerator /= gcd ;
		result.denominator /= gcd;
		return result;
	}

	public int GCD(int a, int b)
	{
		int i;
		// buble sort
		if(a > b)
		{
			
		}
		else
		{
			int t = a;
			a = b;
			b = t;
		}
		
		while (b > 0)
		{
			a = a % b;
			int t = a;
			a = b;
			b = t;
			b++;
		}
		return a;

	}

}
