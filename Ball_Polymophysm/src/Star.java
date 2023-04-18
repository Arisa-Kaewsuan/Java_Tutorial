import java.awt.Color;
import java.awt.Graphics;

public class Star extends Ball
{

	public void draw(Graphics g)
	{
		int n = 5 ;
		int [] xx = new int[n*2];
		int [] yy = new int[n*2];
		
		for(int i = 0 ; i < n*2 ; i++)
		{
			xx[i] = (int)(pos.x + Size * Math.cos(i*Math.PI/n));
			yy[i] = (int)(pos.y + Size * Math.sin(i*Math.PI/n));
			i++;
			xx[i] = (int)(pos.x + Size/2 * Math.cos(i*Math.PI/n));
			yy[i] = (int)(pos.y + Size/2 * Math.sin(i*Math.PI/n));
		}
		g.setColor(new Color(R,G,B,200));
		g.fillPolygon(xx, yy, n*2);
	}

}
