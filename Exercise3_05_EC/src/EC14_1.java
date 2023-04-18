import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class EC14_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextBigDecimal().intValue();
		/*System.out.println(Math.pow(1+(1/n), n));*/
		try
        {
			System.out.println(Math.pow(1+(1/n), n));
        }
        catch(ArithmeticException ex)
        {
            ex.printStackTrace();
        }
		/*System.out.println(((Object)sc.nextDouble()).getClass().getSimpleName());*/ //hide line 9 before run test
		
		
	}
}
