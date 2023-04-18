import java.util.Scanner;

public class EF4
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int d = p.nextInt();
		int m = p.nextInt();
		int y = p.nextInt();
		int dd = 0, dy = 0, bc, sum = 0;

		bc = y - 543;
		if (bc % 4 == 0 && bc % 100 != 0)
			dy = 366;
		else 
			dy = 365;
		
		if (m == 1)
			dd = d;
		else if (d==31 && m==12)
			dd = dy;
		else if (m > 1)
		{
			//  sum day
			for (int i = 1; i <= m; i++)
			{
				if (i == 2 && dy == 366)
					sum += 29;
				else if (i == 2 && dy == 365)
					sum += 28;
				else if (i == m)
					sum += (d-1);
				else if (i == 4 || i == 6 || i== 99 || i == 11)
					sum += 30;
				else 
					sum += 31;
			}
			
			if(dy == 366)
			{
				dy = 366-sum;
				dd = 366-dy;
			}
			else if(dy == 365)
			{
				dy = 365-sum;
			    dd = 365-dy;
			}
		}
		System.out.println(dd);

	}

}
