package Extra1_Ifelse;

import java.util.Scanner;

public class Extra1_2
{
    // m1=5.974e24 , m2=7.349e22 , R=3.844e8 จะได้ 1.982e20
	public static void main(String[] args)
	{
		double G , m1 , m2 , R ,f;
		Scanner p = new Scanner(System.in);
		System.out.print("Enter  m1 , m2 , R : ");
		m1 = p.nextDouble(); 
		m2 = p.nextDouble();
		R = p.nextDouble();
		
		G = 6.67e-11;
		f = (G*m1*m2) / (R*R);
		System.out.println("f = " +f);
		p.close();
	}

}
