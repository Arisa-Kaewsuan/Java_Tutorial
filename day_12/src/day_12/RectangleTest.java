package day_12;

public class RectangleTest
{

	public static void main(String[] args)
	{
		Point p = new Point(20,30);
	    Rectangle r = new Rectangle(p,100,200);
	    System.out.println(r);
        r.width += 30;
        r.height += 30;
        System.out.println(r);
        
        r.grow(20, 20);
        System.out.println(r);
        
        r.move(-10, -10);
        System.out.println(r);
        
        Point a = new Point(3,4);
        Point b = new Point(3,4);
        if(a == b)
        {
        	System.out.println("ok");
        }
        else
        {
        	System.out.println("no no no");
        }
        
        int k,l;
        k = 3;
        l = 3;
        System.out.println(k==l);
        System.out.println(a==b);
        Point c = a;
        System.out.println("a==c : " + (a == c));
        System.out.println(a.equals(b));
	}

}
