public class Vector
{
    public double x,y;
    
    // constructor : x=0 , y=1
	public Vector()
	{
		setX(0);
		setY(1);
	}
	
	// constructor get parameter x=? , y=?
	public Vector(double x , double y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public void setX (double x)
	{
		this.x = x;
	}
	
	public void setY (double y)
	{
		this.y = y;
	}
	
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	
	public Vector add(Vector v)
	{
		Vector result = new Vector();
		result.x = x+v.x;
		result.y = y+v.y;
		return result ;
	}

}
