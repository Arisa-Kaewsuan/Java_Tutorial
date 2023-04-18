import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Ball
{
    public void draw (Graphics g)
    {
    	g.fillRect((int)(pos.x), (int)(pos.y), Size, Size);
    	g.setColor(new Color(R,G,B,200));
    }
}
