import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JAVA_GUI_70 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("Test 1");
		JButton b2 = new JButton("Test 2");
		contentPane.add(b1);
		contentPane.add(b2);
		
		b1.setBounds(10, 10,150, 40);
		b2.setBounds(170, 10,100, 2 0);
		
		frame.setBounds(200,200,300,300);
		frame.setVisible(true);

	}

}
