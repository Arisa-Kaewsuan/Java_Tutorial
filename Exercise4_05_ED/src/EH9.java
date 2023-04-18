import java.util.Scanner;

public class EH9
{

	public static void main(String[] args)
	{
		double sum=0 ,x ;
	    Scanner p = new Scanner (System.in);
		for(int i = 0 ;i < 5 ; i++)
		{
			x = p.nextDouble();
			sum += x;
		}
		double avg;
		avg = sum/5;
		System.out.println(sum);
		System.out.println(avg);
        p.close();
	}

}
