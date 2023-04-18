import java.util.Scanner;

public class E5_4
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int num = p.nextInt();
		double toFoot , toCen , toLha ;
		
		System.out.println(toFoot = (1.0/12.0)*num);
		System.out.println(toCen = 2.54*num);
		System.out.println(toLha = (1.0/36.0) * num);
	}

}
