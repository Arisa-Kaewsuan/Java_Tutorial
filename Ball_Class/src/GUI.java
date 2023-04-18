import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel
{
	// class GUI have : ball rect star
	Ball balls[];
	Rect rects[];
	Star stars[];

	// constructor : set ball(create&move)  , set JFrame
	public GUI()
	{
		// create ball rect star
		balls = new Ball[10];
		for (int i = 0; i < balls.length; i++)
		{
			balls[i] = new Ball();
		}
		rects = new Rect[10];
		for (int i = 0; i < rects.length; i++)
		{
			rects[i] = new Rect();
		}
		stars = new Star[10];
		for (int i = 0; i < stars.length; i++)
		{
			stars[i] = new Star();
		}

		// Have Thread for move at same time
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

					for (int i = 0; i < rects.length; i++)
					{
						rects[i].move();
					}

					for (int i = 0; i < stars.length; i++)
					{
						stars[i].move();
					}
					repaint();
				}
			}
		});
		
		// set JFrame
		t.start();
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
	}
	
	// paint
	public void paint (Graphics g)
	{
		super.paint(g);
		for (int i = 0; i < balls.length; i++)
		{
			balls[i].draw(g);
		}

		for (int i = 0; i < rects.length; i++)
		{
			rects[i].draw(g);
		}

		for (int i = 0; i < stars.length; i++)
		{
			stars[i].draw(g);
		}
	}

	// to call use GUI 
	public static void main(String[] args)
	{
        new GUI();
	}

}
