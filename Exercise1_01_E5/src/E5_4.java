/*input : enter Integer (inch) */
/*output : Print result of ... */
/*         E4.1) convert inch to ft. */
/*         E4.2) convert inch to cm. */
/*         E4.3) convert inch to yd  */

/*Example : 1736 --> 144.667  4409.440  48.222 */
/*          1983 --> 165.250  5036.82   55.083 */
/*          2504 --> 208.667  6360.16   69.555 */

import java.util.Scanner;

public class E5_4
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int num = p.nextInt();
		double toFoot , toCen , toLha ;
		
		System.out.println(toFoot = (1.0/12.0)*num);
		System.out.println(toCen = 2.54*num);
		System.out.println(toLha = (1.0/36.0) * num);
	}

}
