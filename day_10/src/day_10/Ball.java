package day_10;

import java.awt.Graphics;
import java.awt.Color;

public class Ball
{
	public int R ,G ,B , Size ;
	public Vector pos , vel ;

	public Ball()   // initial value of Ball
	{
		R = (int)(Math.random()*255);
		G = (int)(Math.random()*255);
		B = (int)(Math.random()*255);
		Size = (int)(Math.random()*255);
		
		pos = new Vector ((int)(Math.random()*500) , (int)(Math.random()*500)) ;
		vel = new Vector ((int)(Math.random()*10-5) , (int)(Math.random()*10-5)) ;
	}
	
	public void move()
	{
		pos = pos.add(vel);
		if(pos.x + Size > 500)
		{
			pos.x = 500- Size;
			vel.x *= -1;
		}
		if(pos.x < 0)
		{
			pos.x = 0;
			vel.x *= -1;
		}
		if(pos.y + Size > 500)
		{
			pos.y = 500 - Size;
			vel.x *= -1;
		}
		if(pos.y < 0)
		{
			pos.y = 0;
			vel.y *= -1;
		}
	}
	
	public void draw(Graphics g)
	{
		g.setColor(new Color(R,G,B,200));
		g.fillOval((int)(pos.x), (int)(pos.y) ,Size ,Size);
	}

}
