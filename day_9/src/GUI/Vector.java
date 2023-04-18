package GUI;

public class Vector
{
	// constructor คือ method ที่ชื่อเหมือน class จะถูกเรียกครั้งแรกครั้งเดียวตอน
	// new obj.
	// จาก class constructor จะไม่มี return type
	double x, y;

	public Vector()
	{
		x = 0;
		y = 0;
	}
	public Vector(double xx , double yy)
	{
		this.x = x;
		this.y = y;
	}
    public Vector add(Vector v)
    {
    	Vector result = new Vector();
    	result.x = this.x+v.x;
    	result.y = this.y+v.y;
    	return result;
    }
    
    public String toString()
    {
    	return"("+x+","+y+")";
    }
    public static void main(String args[])
    {
    	Vector a = new Vector();
    	a.x = 3;
    	a.y = 4;
    	Vector b = new  Vector(5,7);
    	Vector c;
    	c = a.add(b);
    	System.out.println(c.x +" " + c.y);
    	System.out.println(c);
    }
}
