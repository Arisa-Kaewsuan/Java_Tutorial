package Test_OOP1;

public class No_7_checkArray {

	public static void main(String[] args) 
	{
		int [] num = new int [] {1,2,1,3};
		int n = 2 , count = 0;
		
		if(num.length%2 != 0)
			System.out.println("False");
		else
		{
			for(int i = 0 ; i < num.length-2 ; i++)
			{
				for(int j =  i; j < i+2 ; j++)
				{
					if(num[i] == n)
						count++;
				}
			}
		}
		
		if(count == num.length/2)
			System.out.println("True");

	}

}
