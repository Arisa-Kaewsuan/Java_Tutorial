
public class test3
{

	public static void main(String[] args)
	{
		int a2 = 1010111;
		String a2Str = a2 + "";
		int sum = 0;
		for(int i = 0 ; i < a2Str.length();i++)
		{
			int base = a2 % 10;
			a2 = a2 /10;
			int pow = (int)Math.pow(2, i);
			sum += base*pow;
		}
		System.out.println(sum);
		short a;
		int b;
		double c;
		a = 10;
		b = 20;
		c = a+b;
		//System.out.println(x>3||x<4);
		System.out.println(c);
		System.out.println(10/10+2*14);
		int f=-7%3;
		System.out.println(f);
	}

}
