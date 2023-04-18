import java.math.BigInteger;
import java.util.Scanner;

public class EB_8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		BigInteger mul = new BigInteger("1");
		for(int i = 1 ; i <= n ; i++)
		{
			if(n <= 14 && n >= 1)
			{  mul = mul.multiply(BigInteger.valueOf(i));}
			
		}
		System.out.println(mul);
		
	}

}
