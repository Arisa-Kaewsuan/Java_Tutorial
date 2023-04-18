package a5;
import java.util.Scanner;
public class A5_1
{
    // Check Grade Program
	public static void main(String[] args)
	{   int score;
		Scanner p = new Scanner(System.in);
		System.out.print("Enter Your Score : ");
		score = p.nextInt();
        if(score<50)
        {
        	System.out.println("You get grade F");
        }else if(score>=50 && score<60)
        {
        	System.out.println("You get grade D");
        }else if(score>=60 && score<70)
        {
        	System.out.println("You get grade C");
        }else if(score>=70 && score<80 )
        {
        	System.out.println("You get grade B");
        }else 
        {
        	System.out.println("You get grade A");
        }
        p.close();
	} 

}
