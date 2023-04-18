import java.util.Scanner;

public class EB_11
{
	/*public static void main(String[] args)
	{
        Scanner sc = new Scanner (System.in);
        int i =1;
        int count = 0;
        double sum = 0.0;
        while(true)
        {
        	int n = sc.nextInt();
        	if(n == 0 && sum == 0) 
        	{ 
        		System.out.println("NO AVERAGE");
        		return;
        	}
        	else if(n < 0) { System.out.println("ERROR"); }
        	else if(n == 0 && sum != 0) 
        	{ 
        		System.out.println(sum/count); 
        		return;
        	}
        	else 
        	{ 
        		sum += n;
        	    count++;
        	}
        }
	}*/

	public static void main(String[] args)
	{

		int n = 0, sum = 0, count = 0;
		double avg;
		Scanner p = new Scanner(System.in);

		while(true)
		{
			n = p.nextInt();
			if (n < 0)
			{
				System.out.println("ERROR");
			} 
			
			else if (n == 0 && count != 0)
			{
				break;
			} 
			else if (count == 0 && n == 0)
			{
				break;
			}
			else
			{
				sum += n;
				count++;
			}


		}
		if (n == 0 && count != 0)
		{
			avg = (double) sum / count;
			System.out.println(avg);
		} 
		else if (count == 0 && n == 0)
		{
			System.out.println("NO AVERAGE");
		}
		p.close();

	}

}
