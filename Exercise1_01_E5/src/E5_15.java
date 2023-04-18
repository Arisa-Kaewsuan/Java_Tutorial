/*input : enter 2 Integer (weight,height) */
/*output : Print body surface area value  from .. */
/*         Mosteller rule : s = sqrt(w*h/3600) */
/*         Dubois rule : (71.84*(w^0.425)*(h^0.725)) / 10000 */
/*         Boyd rule : s = 0.0003207*(h^0.3)* [(1000*w)^(0.7285-0.0188(3+log10w)) ]

/*Example : 80  180 --> 2.0  1.996  2.007 */
/*          64  155 --> 1.6  1.629  1.699 */
/*          50  160 --> 1.4  1.501  1.497 */

import java.util.Scanner;

public class E5_15
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int year = (int)(n*(3.170979*Math.pow(10, -8)));
		int month = (int)(n*(3.805175*Math.pow(10, -7)));
		int day = (int)(n*(1.157407*Math.pow(10, -5)));
		int hours = (int)(n*0.000277);
		int sec = (int)(n*0.016666);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hours);
		System.out.println(sec);
	}
}
