
public class Vector
{

	public double x,y ;
	public Vector()
	{
		setX(0);
		setY(1);
	}
	public Vector(double x , double y)
	{
		this.setX(x);
		this.setY(y);
	}

	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getX()
	{
		return x;
	}
	
	public Vector add (Vector v)
	{
		Vector result = new Vector();
		result.x = x+v.x;
		result.y = y+v.y;
		return result;
	}

}
