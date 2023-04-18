
public class L2
{

	public static void main(String[] args)
	{
		System.out.println(fac(4));

	}
	
	public static int fac(int x)
	{
		int mul = 1 ;
		for(int i = x ; i >= 1 ; i--)
		{
			mul *= i ;
		}
		return mul;
	}

}
