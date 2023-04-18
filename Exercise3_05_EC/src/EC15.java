import java.util.Scanner;

public class EC15
{

	public static void main(String[] args)
	{
		int p = 0, q = 0;
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int c = x.nextInt();
		int d = x.nextInt();
		
		if (b == d)
		{
			p = a + c;
			q = b;
		} 
		else 
		{
			// LCM of b & d
			int LCM = 0 , m , n;
			for (int i = 1; i < Integer.MAX_VALUE; i++)
			{
				if (i % b == 0 && i % d == 0)
				{
					LCM = i;
					m = i / b;
					n = i / d;
					p = (a*m) + (c*n);
					q = LCM;
					break;
				}
			}
		}
		System.out.println((a*d)+(c*b)+ "/"+ (b*d));
		System.out.println(p + "/" + q);
		x.close();
	}

}
