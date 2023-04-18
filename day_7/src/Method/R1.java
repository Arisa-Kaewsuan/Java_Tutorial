package Method;

import java.util.Scanner;

public class R1
{

	public static void main(String[] args)
	{
		int[] score = new int[3];
		String[] name = new String[3];
		String[] surname = new String[3];
		Scanner p = new Scanner(System.in);

		// input
		for (int i = 0; i < score.length; i++)
		{
			System.out.print("Please input name , surname , score : ");
			name[i] = p.nextLine();
			surname[i] = p.nextLine();
			score[i] = p.nextInt();
			p.nextLine();
		}

		// max
		int max = 0;
		int max_index = -1;
		for (int i = 0; i < score.length; i++)
		{
			if (score[i] > max)
			{
				max = score[i];
				max_index = i;
			}
		}
		System.out.println(name[max_index] + " " + surname[max_index]);
		p.close();
	}

}
