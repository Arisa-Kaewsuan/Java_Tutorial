package Afternoon_ClassAndThread;

import java.util.Scanner;

public class Studentest
{

	public static void main(String[] args)
	{
		// Exercse_R1 (p.94)
		Student [] s = new Student[10] ; // ประ�?าศตัว�?ปร type Student
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++)
		{
			s[i] = new Student();  // new Student คือ สร้างออบเจ็ค 
			System.out.println("Please Input name , surname , score");
			s[i].name = sc.nextLine();
			s[i].surname = sc.nextLine();
			s[i].score = sc.nextInt();
			sc.nextLine();
		}
		Student max = new Student();
		max.score = Integer.MAX_VALUE;
		for (int i = 0; i < s.length; i++)
		{
			if (s[i].score > max.score)
			{
				max = s[i];
			}
		}
		System.out.println(max.name + "" + max.surname);
		sc.close();

	}

}
