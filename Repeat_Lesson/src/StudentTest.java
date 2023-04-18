import java.util.Scanner;

public class StudentTest
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		Student [] s = new Student[2];
		
		for(int i = 0 ; i < s.length ; i++)
		{
			System.out.println("Please Input : ");
			s[i] = new Student();
			s[i].score = p.nextInt(); p.nextLine();
			s[i].name = p.nextLine();
			s[i].surname = p.nextLine()	;
		}
		
		Student max = new Student();
		max.score = Integer.MIN_VALUE;
		for(int i = 0 ; i < s.length ; i++)
		{
			if(s[i].score > max.score )
			{
				max = s[i];
			}
		}
		
		System.out.println(max.name);
		p.close();
	}

}
