import java.awt.Color;
import java.awt.Graphics;

public class Rect
{
	public Vector pos , vel , acc ;
    public int Size , R , G , B ;
    
	public Rect()
	{
		R = (int)(Math.random()*255);
	    G = (int)(Math.random()*255);
	    B = (int)(Math.random()*255);
	    Size = (int)(Math.random()*100);
	    
	    pos = new Vector();
	    vel = new Vector();
	    acc = new Vector();
	    
	    pos.x = (int)(Math.random()*500);
	    pos.y = (int)(Math.random()*500);
	    vel.x = (int)(Math.random()*10-5);
	    vel.y = (int)(Math.random()*10-5);
	    acc.x = 0;
	    acc.y = 0.1;
	}
	
	public void draw (Graphics g)
	{
		g.fillRect((int)(pos.x) , (int)(pos.y) , Size , Size);
		g.setColor(new Color(R,G,B,200));
	}
	
	public void move()
	{
		pos = pos.add(vel);
		if(pos.x + Size > 500)
		{
			pos.x = 300- Size;
			vel.x *= -1;
		}
		if(pos.x < 0)
		{
			pos.x = 0;
			vel.x *= -1;
		}
		if(pos.y + Size > 500)
		{
			pos.y = 200 - Size;
			vel.x *= -1;
		}
		if(pos.y < 0)
		{
			pos.y = 0;
			vel.y *= -1;
		}
	}

}
