package Method;

public class Fractal
{
	// class เศษส่วน
	public int numerator; // เศษ
	public int denominator; // ส่วน

	public Fractal add(Fractal f)
	{
		Fractal result = new Fractal();
		result.denominator = denominator * f.denominator;
		result.numerator = numerator * f.denominator + f.numerator * denominator;
		int gcd = GCD(result.denominator, result.numerator);
		result.denominator /= gcd;
		result.numerator /= gcd;
		return result;
	}

    // public Fractal mul(Fractal f)
	public Fractal mul(Fractal f)
	{
		Fractal result = new Fractal();
		result.denominator = denominator * f.denominator;
		result.numerator = numerator * f.numerator;
		int gcd = GCD(result.denominator, result.numerator);
		result.denominator /= gcd;
		result.numerator /= gcd;
		return result;
	}
	
	// public Fractal sub(Fractal f)
	public Fractal sub(Fractal f)
	{
		Fractal result = new Fractal();
		result.denominator = denominator * f.denominator;
		result.numerator = numerator * f.denominator - f.numerator * denominator;
		int gcd = GCD(result.denominator, result.numerator);
		result.denominator /= gcd;
		result.numerator /= gcd;
		return result;
	}
	// public Fractal div(Fractal f)
	
	public static int GCD(int a, int b)
	{
		if (a > b)
		{

		} else
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
		}
		return a;
	}
}
