import java.util.*; 
import java.lang.*;

public class EF3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int Shour = sc.nextInt();
		int Smin = sc.nextInt();
		int Ehour = sc.nextInt();
		int Emin = sc.nextInt();
		int hour = 0;
		int min = 0;
		int count = 0;
		
		if(Shour == 0 && Ehour == 0) 
		{
			hour = Ehour - Shour;
			System.out.println(hour);
			System.out.println(Emin);
		}
		else
		{
			min = Emin - Smin;
			
			int i = Shour+1;
			while(i <= (Ehour-1))
			{ count++; }
			
			System.out.println(count + "\n" + min);
		}
	}

	
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
