import java.util.Scanner;

public class EA4211
{

	public static void main(String[] args)
	{
		int x ,y=0 ;
		Scanner p =new Scanner (System.in);
		
		x = p.nextInt();
		
		if(x>100)
		{
			y = 20;
		}
		else if(x<=100)
		{
			y = 0;
		}
		System.out.println(y);
		p.close();


	}

}
