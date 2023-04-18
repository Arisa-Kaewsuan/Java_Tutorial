package e5;
import java.util.Scanner;
public class E5_11
{

	public static void main(String[] args)
	{
		int a1,b1,c1,a2,b2,c2,x,y;
		int LCM,a1n,b1n,c1n,a2n,b2n,c2n;
		Scanner p = new Scanner(System.in);
		
		System.out.print("Enter value a1 : ");
		a1 = p.nextInt();
		System.out.print("Enter value b1 : ");
		b1 = p.nextInt();
		System.out.print("Enter value c1 : ");
		c1 = p.nextInt();
		System.out.print("Enter value a2 : ");
		a2 = p.nextInt();
		System.out.print("Enter value b2 : ");
		b2 = p.nextInt();
		System.out.print("Enter value c2 : ");
		c2 = p.nextInt();
		
		if(a1==a2)
		{
		   	y = ((c1-c2)-(a1-a2))/(b1-b2); // x=0 หาค่า  y
		   	x = (c1-(b1*y))/a1; // เอาค่า  y ที่ได้แทนในสมการที่ 1
		   	System.out.println("x = " +x);
			System.out.println("y = " +y);
		}else if (b1==b2)
		{
			x = ((c1-c2)-(b1-b2))/(a1-a2); // y=0 หาค่า  x
			y = (c1-(a1*x))/b1; // เอาค่า  x ที่ได้แทนใรสมการที่ 1 
			System.out.println("x = " +x);
			System.out.println("y = " +y);
		}else
		{
			if(a1<a2)
			{
				LCM = a2/a1;   // หาตัวมาคูณสมการ c1 เพื่อทำ x=0
				a1n = a1*LCM;
				b1n = b1*LCM;
				c1n = c1*LCM;
				y = ((c1n-c2)-(a1n-a2))/(b1n-b2); // x=0 หาค่า  y
				x = (c1-(b1*y))/a1; // เอาค่า  y ที่ได้แทนในสมการที่ 1
				System.out.println("x = " +x);
				System.out.println("y = " +y);
			}else if(a2<a1)
			{
				LCM = a1/a2;   // หาตัวคูณสมการ C2 เพื่อทำ x=0
				a2n = a2*LCM;
				b2n = b2*LCM;
				c2n = c2*LCM;
				y = ((c2n-c2)-(a2n-a2))/(b2n-b2); // x=0 หาค่า  y
				x = (c1-(b1*y))/a1; // เอาค่า  y ที่ได้แทนในสมการที่ 1
				System.out.println("x = " +x);
				System.out.println("y = " +y);
			}else if(b1<b2)
			{
				LCM = b2/b1;   // หาตัวคูณสมการ C1 เพื่อทำ y=0
				a1n = a1*LCM;
				b1n = b1*LCM;
				c1n = c1*LCM;
				x = ((c1n-c2)-(b1n-b2))/(a1n-a2); // y=0 หาค่า  x
				y = (c1-(a1*x))/b1;  // เอาค่า  x ที่ได้แทนในสมการที่ 1
				System.out.println("x = " +x);
				System.out.println("y = " +y);
			}else if(b2<b1)
			{
				LCM = b1/b2; // หาตัวไปคูณสมการ  c2 เพื่อทำ y=0
				a2n = a2*LCM;
				b2n = b2*LCM;
				c2n = c2*LCM;
				x = ((c2n-c2)-(b2n-b2))/(a2n-a2); // y=0 หาค่า  x
				y = (c1-(a1*x))/b1; // เอาค่า  x ที่ได้แทนในสมการที่ 1
				System.out.println("x = " +x);
				System.out.println("y = " +y);
			}
		}
		p.close();
	}
}
