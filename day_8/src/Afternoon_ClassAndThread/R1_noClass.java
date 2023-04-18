package Afternoon_ClassAndThread;

import java.util.Scanner;

public class R1_noClass
{
	public static void main(String[] args)
	{
		// Exercse_R1 (p.94)
		String [] names = new String[10];
		String [] surnames = new String[10];
		int [] score = new int [10];
		Scanner sc = new Scanner (System.in);
		for(int i = 0 ; i < score.length ; i++)
		{
			System.out.println("Please Input name , surname , score");
			names[i] = sc.nextLine();
			surnames[i] = sc.nextLine();
			score[i] = sc.nextInt();
			sc.nextLine();
		}
		String max_name = "" , max_surname = "";
		int max = Integer.MAX_VALUE;
		for(int i = 0 ; i < score.length ; i++)
		{
			if(score[i]>max)
			{
				max = score[i];
				max_name = names[i];
				max_surname = surnames[i];
			}
		}
        System.out.println(max_name + ""+max_surname);
        sc.close();
	}

}
