import java.util.Scanner;

public class ED_11
{
	static char[][] a = new char[][]
			{
				{ 'a', 'b', 'c', 'd' },
				{ 'e', 'f', 'g', 'h' },
				{ 'i', 'j', 'k', 'l' },
				{ 'm', 'n', 'o', 'p' } 
			};
	static Scanner sc = new Scanner(System.in);
	static int n ,i=0;
	static String c ;
				
	public static void main(String[] args)
	{
		while (true)
		{
			n = sc.nextInt(); 
			sc.nextLine();
			
			if (n != -1)
			{
				 String c = sc.nextLine();
				 print(toRotate(c));
			}
			else {break;}
            i++;
		}
	}
	
	public static char[][] toRotate(String b)
	{
		// Rotate Left (T)
		if (b.charAt(0) == 'l')
		{
			char t = a[n][0];
			for (int i = 0; i < a[0].length - 1; i++)
			{
				a[n][i] = a[n][i + 1];
			}
			a[n][a[0].length - 1] = t;
		}

		// Rotate Right (T)
		else if (b.charAt(0) == 'r')
		{
			char t = a[n][a[0].length - 1];
			for (int i = a.length - 1 ; i>0 ; i--)
			{
				a[n][i] = a[n][i-1];
			}
			a[n][0] = t;
		}
		
		// Rotate down (T)
		else if(b.charAt(0) == 'd')
		{
			int i = a.length-1;
			char t = a[a[0].length-1][n];
			for(; i > 0 ; i--)
			{
				a[i][n] = a[i-1][n] ;
			}
			a[0][n] = t ;
		}
		
		// Rotate Up (T)
		else if (b.charAt(0) == 'u')
		{
			char t = a[0][n];
			for(int i = 0 ; i < a[0].length-1 ; i++)
			{
				a[i][n] = a[i+1][n];
			}
			a[a[0].length-1][n] = t;
		}
		return a;
	}

	public static void print(char[][] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x.length; j++)
			{
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}
}


