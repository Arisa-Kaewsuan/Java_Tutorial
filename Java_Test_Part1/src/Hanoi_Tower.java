
public class Hanoi_Tower
{
	public static void print(int [][] t)
	{
		for(int i = 0 ; i < t.length ; i++)         // 4 stage
		{
			for(int j = 0 ; j < t[i].length ; j++)  // 3 tower
			{
				for(int k = 0 ; k < t.length-(t[i][j]) ; k++)
				{
					System.out.print(" ");
				}
				for(int k = 0 ; k < t[i][j] ; k++)
				{
					System.out.print("x");
				}
				System.out.print("|");
				for(int k = 0 ; k < t[i][j] ; k++)
				{
					System.out.print("x");
				}
				for(int k = 0 ; k < t.length-(t[i][j]) ; k++)
				{
					System.out.print(" ");
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void solve (int [][] tower , int form , int to , int n) // n = จำนวนตัวที่ย้าย
	{
		if(n == 0) return;
		if(n == 1)
		{
			int top_1 = 0;  // 5
			while(top_1 < tower.length && tower[top_1][form] == 0)
			{
				top_1++;
			}
			
			int top_2 = 0;  // 5
			while(top_2 < tower.length && tower[top_2][to] == 0)
			{
				top_2++;
			}
			top_2--;
			System.out.println();
			tower[top_2][to] = tower[top_1][form];
			tower[top_1][form] = 0;
			
			print(tower);
			return ;
		}
		int another = 3-form-to;  // another = อีกเสานึง 
		solve(tower , form , another , n-1);
		solve(tower , form , to , 1);
		solve(tower , another , to , n-1);
	}
	
	public static void main(String[] args)
	{
	   int [][]tower = new int [5][3];
	   for(int i =0 ; i < tower.length ; i++)
	   {
		 tower[i][0] = i+1;
	   }
	   print(tower);
	   solve(tower , 0 , 2 , tower.length);
	}

}
