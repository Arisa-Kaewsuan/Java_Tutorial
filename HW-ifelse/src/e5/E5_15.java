package e5;
import java.util.Scanner;
public class E5_15
{

	public static void main(String[] args)
	{
		double w ,Hcm ,Hm ,Hsm ,Sm ,Sd ,Sb ;
		Scanner p = new Scanner(System.in);
		
		System.out.print("Enter value of width (kg.) : ");
		w = p.nextDouble();
		System.out.print("Enter value of high (cm.) : ");
		Hcm = p.nextDouble();
		
		Hm = Hcm * (1/100);
		Hsm = Hm*Hm;
		
		Sm = Math.sqrt((w*Hsm) / 3600);
		Sd = Math.sqrt((71.84*Math.pow(w,0.425)*Math.pow(Hsm,0.725))/10000);
		Sb = 0.0003207 * Math.pow(Hsm,0.3) * Math.pow((1000*w),(0.7285-0.0188*(3+Math.log10(w))));
		
		System.out.println("Sm = " +Sm);
		System.out.println("Sd = " +Sd);
		System.out.println("Sb = " +Sb);
		p.close();

	}

}
