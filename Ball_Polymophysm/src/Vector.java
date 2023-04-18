
public class Vector
{
    public double x,y;
	public Vector()
	{
		setX(0);
		setY(1);
	}
	public Vector(double x , double y)
	{
		setX(x);
		setY(y);
	}
	public Vector add(Vector v)
	{
		Vector result = new Vector();
		result.x = x+ v.x;
		result.y = y+v.y;
		return result;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
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

}
