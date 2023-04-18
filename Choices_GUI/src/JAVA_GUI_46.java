import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class JAVA_GUI_46 extends JFrame
{  
	public static void main(String[] args) 
	{
		JFrame horizontalFrame = new JFrame();
		horizontalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponent topButton = new JButton("Left");
		JComponent bottomButton = new JButton("Right");
		final JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		splitPane.setTopComponent(topButton);
		splitPane.setBottomComponent(bottomButton);
		
		horizontalFrame.add(splitPane, BorderLayout.EAST);
		horizontalFrame.setSize(150,150);
		horizontalFrame.setVisible(true);
		
		splitPane.setDividerLocation(0.5);
	}

}
