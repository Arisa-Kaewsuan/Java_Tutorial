package Test_JAVA_Part1;

public class No_4 {

	public static void main(String[] args) 
	{
        for(int a = 1 ; a < 3 ; a++)
        {
        	for(int b = 1 ; b < 3 ; b++)
            {
        		for(int c = 1 ; c < 3 ; c++)
                {
                	if(checkResult(a,b,c) == true)
                	{
                		System.out.println(a + " " + b + " " + c);
                	}
                }
            }
        }
	}
	
	public static boolean checkResult(int i , int j , int k)
	{ 
		int r = (int) Math.pow(k, 2) ;
		int sum =  (int)(Math.pow(i, 2) + Math.pow(j, 2) + Math.pow(k, 2)) ;
		if(r == sum && checkDuplicate(i,j,k) == true)
		{
				 // เก็บใส่ เพิ่มไปใน Array 
		}
		return true;
	}
	
	public static boolean checkDuplicate(int x , int y , int z)
	{ 
		if()
		return true;
	}

}
