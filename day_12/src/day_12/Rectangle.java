package day_12;

public class Rectangle
{
    public Point corner ;         //มุมซ้ายบน
    public double width,height;   //ความกว้าง กับ ความสูง
    
	public Rectangle()
	{
		
	}
	
	public Rectangle(Point corner , double width , double height)
	{
		this.corner = corner ;
		this.width = width;
		this.height = height;
	}
	
	public String toString()    //Override
	{
		return "RECT : " + corner + " w : " + width + " h : " + height;
	}
	
	public void grow (double dx , double dy)
	{
		this.width += dx ; 
		this.height += dy;
	}
	
	public void move (int xx , int yy)
	{
		this.corner.x = xx ; 
		this.corner.y = yy;
	}

}
