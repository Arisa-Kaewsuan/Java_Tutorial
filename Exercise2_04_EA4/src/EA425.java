import java.util.Scanner;

public class EA425
{
	public static void main(String[] args)
	{
		int A ,B ,C ,m ,Y=0;
		Scanner p = new Scanner(System.in);
		
		//System.out.print("Enter value  : ");
		A = p.nextInt();
		B = p.nextInt();
		C = p.nextInt();
		m = p.nextInt();
		
		if(m>5)
			Y = A*m*2+B*m+C;
		else if(m == 5)
			Y = A*m*2+B*m-C;
		else if(m<5)
			Y = A*m*2+B*m;
		System.out.println(Y);
		p.close();
	}
}
