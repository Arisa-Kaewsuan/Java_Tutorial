/*input : enter 10 Integer put it in Array*/
/*output : Print average of number in array  */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> 5.5 */

import java.util.Scanner;

public class H8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [] a = new int[10];
		double avg=0.0;
		
		for(int i = 0 ; i<a.length ;i++)
		{
			a[i] = sc.nextInt();
			avg += a[i];
		}
		System.out.println(avg/a.length);
	}

	/*public static void main(String[] args)
	{
		int sum = 0 ;
		double  avg = 0 ;
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			//System.out.println("Please Input a Numbers : ");
			x[i] = p.nextInt();
			sum += x[i];
		}
		avg = sum/10.0;
        System.out.println(avg);
		p.close();
	}*/
}
