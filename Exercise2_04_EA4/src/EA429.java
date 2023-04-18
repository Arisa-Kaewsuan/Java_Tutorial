import java.util.Scanner;

public class EA429
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		
		int score = p.nextInt();
		
		if(score>=80 && score<=100) 
		{
			System.out.println("A");
		}
		else if(score>=70 && score<80)
		{
			System.out.println("B");
		}
		else if(score>=60 && score<70)
		{
			System.out.println("C");
		}
		else if(score>=50 && score<60)
		{
			System.out.println("D");
		}
		else if(score<50)
		{
			System.out.println("F");
		}
		p.close();

	}

}
