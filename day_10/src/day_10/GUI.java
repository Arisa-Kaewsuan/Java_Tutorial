package day_10;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel
{
	Ball[] balls;

	public GUI()
	{
		// create 10 BAlls
		balls = new Ball[10];
		for (int i = 0; i < balls.length; i++)
		{
			balls[i] = new Ball();
		}

		// ทำงานพร้อมกัน
		Thread t = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				while (true)
				{
					try
					{
						Thread.sleep(20);
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
		
		// สร้าง JFrame มาวาด Balls ที่เคลื่อนที่ได้
		t.start();
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setVisible(true);
		
		public void paint(Graphics g)
		{
			super.paint(g);
			for(int i=0 ; i < balls.length ; i++)
			{
				balls[i].draw(g);
			}
		}
		
		public static void main(String[] args)
		{
			new GUI();
		}
	}

}
