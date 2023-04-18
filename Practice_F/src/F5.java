/*input : enter 1 Integer(n) */
/*output : Print all prime number < 100 */
/*Example : 2 3 5 7 11 13 17 ... 97 */

public class F5
{
	public static void main(String[] args)
	{
		for(int i = 1 ; i<100 ; i++)
		{
			int count=0;
			for(int j = 1 ; j<=i ; j++)
			{
				if(i%j==0) { count++;}
			}
			if(count == 2)
			{ System.out.println(i);}
		}

	}

	/*public static void main(String[] args)
	{
		int i;
	     
	    for(i=1; i<=100; i++){
	         
	        if((i==1 || i%2 == 0 || i%3 == 0 || i%5==0 || i%7==0) 
	            && (i!=2 && i!=3 && i!=5 && i!=7)){
	            continue;
	        }
	 
	        System.out.printf(" %d\n", i);     
	    }

	}*/

}
