import java.util.Scanner;
public class EA426
{
	public static void main(String[] args)
	{
		int hrs ,min ,pay ;
		Scanner p =new Scanner(System.in);
		
		hrs = p.nextInt();
		min = p.nextInt();
		
		if(hrs>1)
		{
			pay = (hrs*30-30);
					if(min!=0)
					{
						pay = pay+30;
					}
			System.out.println(pay);
		}
		else if(hrs==1 && min!=0)
			System.out.println("30");
		else
			System.out.println("0");
		p.close();
	}
}
