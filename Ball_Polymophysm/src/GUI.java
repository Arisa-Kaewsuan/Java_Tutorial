import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel
{
	Ball balls[];

	public GUI()
	{
		balls = new Ball[30];
		for (int i = 0; i < balls.length; i++)
		{
			balls[i] = new Ball();
		}
		for (int j = 10; j <20; j++)
		{
			balls[j] = new Rect();
		}
		for (int k = 20; k <balls.length; k++)
		{
			balls[k] = new Star();
		}

		Thread t = new Thread(new Runnable()
		{
			public void run()
			{
				while (true)
				{
					try
					{
						Thread.sleep(40);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					for (int i = 0; i < balls.length; i++)
					{
						balls[i].move();
					}
					repaint();
				}
			}
		});
		t.start();
		JFrame f = new JFrame();
	    f.add(this);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setSize(500, 500);
	    f.setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		for(int i = 0 ; i < balls.length ; i++)
		{
			balls[i].draw(g);
		}
	}

	public static void main(String[] args)
	{
		new GUI();
	}

}
