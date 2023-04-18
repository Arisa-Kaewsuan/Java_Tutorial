package day_9;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
public class GUI1 extends JFrame
{

	public GUI1()
	{
		setSize (500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint (Graphics g)
	{
		super.paint(g);
		g.fillOval((50), 50, 100, 150);
		g.setColor(Color.red);
		g.fillRect(200, 50, 100, 200);
	}
	
	public static void main (String[] args)
	{
		new GUI1();
	}

}
