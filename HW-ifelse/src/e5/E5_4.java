package e5;
import java.util.Scanner;
public class E5_4
{

	public static void main(String[] args)
	{
		double f,i,y,cm;
		Scanner p = new Scanner (System.in);
		
		System.out.print("Enter value inches : ");
		i = p.nextDouble();
		
		f = (1/12)*i;
		cm = i*2.54;
		y = (1/36)*i;
		
		System.out.printf("Convert Inches to Foot : %.3f \n" ,f);
		System.out.printf("Convert Inches to Centimeters : %.3f \n" ,cm);
		System.out.printf("Convert Inches to Yard : %.3f \n" ,y);
		p.close();
	}

}
