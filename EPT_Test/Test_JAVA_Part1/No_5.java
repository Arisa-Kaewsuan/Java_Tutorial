package Test_JAVA_Part1;

import java.util.Scanner;

public class No_5
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int ts ;
		int sc = 0;
		while (true)
		{   
			System.out.print("Total Sales : ");
			ts = p.nextInt();
			if (ts > 0)
			{
				if (ts < 10000)
				{
					sc = 0;
					System.out.println(sc);
				} 
				else if (ts <= 10000 || ts <= 25000)
				{
					sc = ts * 7/100;
					System.out.println(sc);
				
				} 
				else if(ts >= 25000)
				{
					sc = ts * 10/100;
					System.out.println(sc);
				}
			}
			else 
				{
				System.out.println("exit");
				break;
				}
		}
		p.close();

	}

}
