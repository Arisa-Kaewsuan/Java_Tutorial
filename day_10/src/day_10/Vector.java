package day_10;

public class Vector extends Object
{
	double x, y;

	// Create Vector
	public Vector()
	{
		x = 0;
		y = 0;
	}
	public Vector(double x , double y)
	{
		this.x = x;
		this.y = y;
	}
	
	// Add Vector
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
    
    // Multiply Vector
    public Vector mul(double m)
    {
    	Vector result = new Vector();
    	result.x = this.x*m;
    	result.y = this.y*m;
    	return result;
    }
    
    // Sub Vector
    public Vector sub(Vector v)
    {
    	Vector result = new Vector();
    	result.x = this.x-v.x;
    	result.y = this.y-v.y;
    	return result;
    }
    
    // Dot Vector
    public double dot(Vector v)
    {
    	double result = this.x*v.x + this.y*v.y;
    	return result;
    }
    
    // Size of Vector
    public double size()
    {
    	double result = Math.sqrt(x*x + y*y);
    	return result;
    }
    
    // Unit Vector
    public Vector unit()
    {
    	double s = size();
    	return new Vector(x/s,y/s);
    }
    
   /* public static void main(String args[])
    {
    	Vector a = new Vector();
    	a.x = 3;
    	a.y = 4;
    	Vector b = new  Vector(5,7);
    	Vector c;
    	c = a.add(b);
    	System.out.println(c.x +" " + c.y);
    	System.out.println(c);
    }*/
	

}
