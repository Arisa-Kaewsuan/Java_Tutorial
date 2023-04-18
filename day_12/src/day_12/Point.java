package day_12;

public class Point
{
	public double x,y ;
    public Point()
    {}
    public Point(double x ,double y)
	{
    	this.x = x;
    	this.y = y;
	}
    
    public String toString()
    {
    	return String.format("(%f,%f)", x,y);
    }
    
    // deep compare : ทำให้ค่าข้างในตัวชี้ เท่ากัน
    public boolean equals(Object o)  // Open Java Doc
    {
    	if(o instanceof Point)
    	{
    		Point pp = (Point)o;
    		return pp.x == x && pp.y == y ;
    	}
    	else
    	{
    		return false;
    	}
    }
}
