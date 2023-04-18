/*input : no input */
/*output : from  int a=0 , b=1 , c=2;
 *               double x=0 , y=1 , z=2;
 *               x = a-- + ++b + c++ + ++y / z++;
 *          print value of a b c x y z  from code above */

/*Example : -1 2 3 5.0 2.0 3.0 */


public class E5_12
{

	public static void main(String[] args)
	{
		int a=0 ,b=1 ,c=2 ;
		double x=0 ,y=1 ,z=2 ;
		x = a-- + ++b + c++ + ++y / z++ ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
