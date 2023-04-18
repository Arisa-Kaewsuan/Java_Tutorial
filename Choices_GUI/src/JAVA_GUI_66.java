import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JAVA_GUI_66 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("Test1");
		JButton b2 = new JButton("Test2");
		contentPane.add(b1);
		contentPane.add(b2);
		
        b1.setBounds(10,10,100,20);
        b2.setBounds(120,10,150,40);
        
        frame.setBounds(200,200,300,300);
        frame.setVisible(true);
	}

}
