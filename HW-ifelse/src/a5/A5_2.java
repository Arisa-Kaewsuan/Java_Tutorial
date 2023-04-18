package a5;
import java.util.Scanner;
public class A5_2
{
    // BMI Calculate Program
	public static void main(String[] args)
	{
		double w,h,BMI;
		Scanner p = new Scanner(System.in);
		System.out.print("Enter Your Weight (Kg.) : ");
		w = p.nextDouble();
		System.out.print("Enter Your Hight (cm.) : ");
		h = p.nextDouble();
		BMI = w/(h*h);
		if(BMI<20)
		{
			System.out.println("Thin");
		}
		else if(BMI>=20 && BMI<=25)
		{
			System.out.println("Normal");
		}
		else 
		{
			System.out.println("Fat");
		}
		p.close();
	}

}
