 import java.util.Arrays;
import java.util.Scanner;

public class ED_12 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
        String n = sc.nextLine();
 		String [][] led = new String[][]
		{
			{  "xxxx" , "x--x" , "x--x" , "x--x" , "xxxx" }, //0
			{  "---x" , "---x" , "---x" , "---x" , "---x" }, //1
			{  "xxxx" , "---x" , "xxxx" , "x---" , "xxxx" }, //2
			{  "xxxx" , "---x" , "xxxx" , "---x" , "xxxx" }, //3
			{  "x--x" , "x--x" , "xxxx" , "---x" , "---x" }, //4
			{  "xxxx" , "x---" , "xxxx" , "---x" , "xxxx" }, //5
			{  "x---" , "x---" , "xxxx" , "x--x" , "xxxx" }, //6
			{  "xxxx" , "---x" , "---x" , "---x" , "---x" }, //7
			{  "xxxx" , "x--x" , "xxxx" , "x--x" , "xxxx" }, //8
			{  "xxxx" , "x--x" , "xxxx" , "---x" , "---x" }, //9
		 };
		
		//System.out.println(led.length); //10
		//System.out.println(led[0].length); //5
	    //System.out.println(n.length()); //3
		 
		int [] num = new int[n.length()];
		for(int i = 0 ; i < num.length ; i++)
        {
			num[i] = Character.getNumericValue(n.charAt(i));
        }
		//System.out.println(Arrays.toString(num)); [1,2,3] 
		
		for(int k = 0 ; k < led[0].length ; k++) //0-5
		{
			for(int i = 0 ; i < num.length ; i++) // 0-2
			{
				if(i == num.length-1)
				{ System.out.print(led[num[i]][k]); }
				else
				{ System.out.print(led[num[i]][k]+"\t"); }
			}
			System.out.println();
		}
		
		
		 
		
		
		/*Scanner p = new Scanner(System.in);
		String x = p.nextLine();

		int[] temp = new int[x.length()];
		
		for(int i = 0 ; i < x.length() ; i++)
		{
			temp[i] = Integer.parseInt(""+x.charAt(i));
		}

		//System.out.println(a[0].length); // row = 5
		//System.out.println(a.length);// columns = 10
		//System.out.println(temp.length);
		//System.out.println(Arrays.toString(temp));
		
		for (int j = 0; j < a[0].length ; j++)
		{
			for(int i = 0; i < temp.length ; i++)
			{
				for(int k = 0; k < a.length ; k++)
				{
				    if(temp[i] == k)
				    {
				    	System.out.print(a[k][j]+"\t");
				    }
				}
			}
			System.out.println();
		}*/
	}

}
