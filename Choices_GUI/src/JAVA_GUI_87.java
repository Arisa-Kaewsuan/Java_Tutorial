import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JAVA_GUI_87 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		
		Container contentPane = frame.getContentPane();
		GroupLayout groupLayout = new GroupLayout(contentPane);
		contentPane.setLayout(groupLayout);
		
        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        
        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
        		.addComponent(b1)
        		.addGap(5,20,50)
        		.addComponent(b2));
        
        groupLayout.setVerticalGroup(groupLayout
        		.createParallelGroup(GroupLayout.Alignment.BASELINE)
        		.addComponent(b1)
        		.addComponent(b2));
        
        frame.setBounds(200,200,180,200);
        frame.setVisible(true);
	}

}
