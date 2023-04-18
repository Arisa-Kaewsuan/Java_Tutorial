/*input : enter Integer (area of circle) */
/*output : Print result of circle radius*/
/*Example : 78.539 --> 4.999974015 */
/*          314.159 --> 9.9999577667 */


import java.util.Scanner;

public class E5_3
{

	public static void main(String[] args)
	{
		double a,r;
		Scanner p = new Scanner (System.in);
		
		//System.out.print("Enter value area : ");
		a = p.nextDouble();
		
		r = Math.sqrt(a/Math.PI);
		System.out.println(r);
		p.close();
	}

}
