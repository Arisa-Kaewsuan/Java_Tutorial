
public class L1
{

	public static void main(String[] args)
	{
        System.out.println(power(2,4));
        System.out.println(power2(2,4));
        int a = 4;
        int b = 3;
        a = a+1; 
        a += a++ + ++a + ++b ;
        System.out.println(a);
	}

	public static double power(double a, int b)
	{
		double result;
		result = Math.pow(a, b);
		return result;
	}
	
	public static double power2(double a , int b)
	{
		int i=b , sum = 1;
		while(i > 0)
		{
			if(b%2 == 1)
			{
				sum *= a;
			}
			else
			{
				sum *= a*a;
				i = i/2;
			}
			i--;
		}
		return sum;
	}
	

}
