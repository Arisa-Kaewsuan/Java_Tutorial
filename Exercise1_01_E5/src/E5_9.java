import java.util.Scanner;

public class E5_9
{

	public static void main(String[] args)
	{
		int W,H,A,L;
		Scanner p = new Scanner(System.in);
		//System.out.print("Enter values width : ");
		W = p.nextInt();
		//System.out.print("Enter values high : ");
		H = p.nextInt();
		A = W*H;
		L = 2*(W+H);
		System.out.println(A);
		System.out.println(L);
        p.close();

	}

}
