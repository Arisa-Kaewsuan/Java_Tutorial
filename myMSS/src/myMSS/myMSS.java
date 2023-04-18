package myMSS;

public class myMSS {

	public static void main(String[] args) 
	{
		/*int[] a = new int[2000];
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = (int) (Math.random()) ;
		}*/
		
		int[] a = {7,12,1,5,2};
		int max = Integer.MIN_VALUE;
		calMSS mss = new calMSS();
		
		long x1,x2;
		
		x1 = System.currentTimeMillis();
        System.out.println(mss.mssI(a, max));
        x2 = System.currentTimeMillis();
        System.out.println("mssI Time : " +(x2-x1));
        
        x1 = System.currentTimeMillis();
        System.out.println(mss.mssII(a, max));
        x2 = System.currentTimeMillis();
        System.out.println("mssII Time : " +(x2-x1));
        
        x1 = System.currentTimeMillis();
        System.out.println(mss.mssIII(a, max));
        x2 = System.currentTimeMillis();
        System.out.println("mssIII Time : " +(x2-x1));
	}

}
