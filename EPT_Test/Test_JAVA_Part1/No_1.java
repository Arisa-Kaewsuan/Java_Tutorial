package Test_JAVA_Part1;

public class No_1 
{
	public static void main(String[] args) 
	{
		 for(int i = 1 ;i<=10 ; i++)
		 {
			 for(int j = 1 ; j <= 10-i ; j++)
			 {
				 System.out.print("-");
			 }
			 
			 for(int k = 1 ; k<i+1 ; k++)
			 {
				 System.out.print("x");
			 }
			 System.out.println("\n");
		 }

	}

}
