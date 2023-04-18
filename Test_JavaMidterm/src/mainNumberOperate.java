
public class mainNumberOperate
{

	public static void main(String[] args)
	{
		int a=2 , b=8;
		NumberOperate r = new NumberOperate();
        int rAdd = r.add(a,b);
        int rSub = r.subtract(a, b);
        int rMul = r.multiply(a, b);
        int rDiv = r.divide(a, b);
        
        System.out.println("add : " + rAdd + "\n"
        		           + "subtract : " + rSub + "\n"
        		           + "multiply : " + rMul + "\n"
        		           + "divide : " + rDiv + "\n");
	}

}
