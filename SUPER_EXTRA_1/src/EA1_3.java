import java.util.Scanner;

public class EA1_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		double[] a = new double[4];
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextDouble();
		}
		System.out.println((a[3]*Math.pow(a[2], 2)) / (a[0]*a[1]));
	}

	/*public static void main(String[] args)
	{
		double m1 , m2  ,R , f ,G;
		Scanner p = new Scanner(System.in) ;
		m1 = p.nextDouble();
		m2 = p.nextDouble();
		R = p.nextDouble();
		f = p.nextDouble();
		
		G = f * Math.pow(R, 2) / (m2*m1) ;
		System.out.printf("%E",G);
		p.close();
	}*/

}
