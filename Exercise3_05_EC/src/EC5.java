import java.util.Scanner;

public class EC5
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int ts ;
		double sc = 0;
		while (true)
		{
			ts = p.nextInt();
			if (ts == -1)
			{
				break;
			}
			else
			{
				if(ts < 10000)
					 sc = 0;
				else if(ts >= 10000 && ts <25000)
					 sc = (7.0/100.0) * ts;
				else if(ts >= 25000)
					sc = (10.0 / 100.0) * ts;
				System.out.println(sc);
			}
		}
		System.out.println("exit");

	}


}
