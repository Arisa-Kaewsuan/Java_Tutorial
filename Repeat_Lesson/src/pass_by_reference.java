
public class pass_by_reference
{
	public static void xx(int [] x)
	{
		x[0] = 19;
	}

	public static void main(String[] args)
	{
		int[] y = new int [1];
		y[0] = 7;
		System.out.println(String.join(" ", y));
        xx(y);
        System.out.println(String.join(" ", y));
	}
	

} 
