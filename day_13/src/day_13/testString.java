package day_13;

public class testString
{
    // mutable & imutable 
	public static void main(String[] args)
	{
		int n = 10000;
		long a = System.currentTimeMillis();
		String s = "";
		for(int i = 0 ; i < n ; i++)
		{
			s = s + Math.random();
		}
		long b = System.currentTimeMillis();
		System.out.println(b-a);
		
		 a = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i <n ; i++)
		{
			sb. append( Math.random());
		}
		b = System.currentTimeMillis();
		System.out.println(b-a);
				

	}

}
