package Method;

import java.util.Scanner;

public class Studenttest
{

	public static void main(String[] args)
	{
		Student[] s = new Student[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++)
		{
			s[i] = new Student();
			System.out.println("Please input name , surname , score : ");
			s[i].name = sc.nextLine();
			s[i].surname = sc.nextLine();
			s[i].score = sc.nextInt();
			sc.nextLine();
		}
		Student max;
		max = s[0];
		for (int i = 0; i < s.length; i++)
		{
			if (max.score < s[i].score)
			{
				max = s[i];
			}
		}
		System.out.println(max.name + " " + max.surname);
		sc.close();
	}

}
