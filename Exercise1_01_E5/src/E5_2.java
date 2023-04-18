/*input : enter Integer (radius of circle) */
/*output : Print result of circle area (pi*r^2)*/
/*Example : 5 --> 78.540 */
/*          10 --> 314.159265 */
/*          100 --> 31415.92653589 */

import java.util.Scanner;

public class E5_2
{

	public static void main(String[] args)
	{
		float a , r;
		final float PI = 3.14f;
		Scanner p = new Scanner(System.in);
		//System.out.print("Enter value r : ");
		r = p.nextFloat();
		a = PI*(r*r);
		System.out.println(a);
		p.close();
	}

}
