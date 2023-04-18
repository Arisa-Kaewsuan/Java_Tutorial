import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class JAVA_GUI_44 extends JFrame
{  
	public static void main(String[] args) 
	{
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		
		JButton b1 = new JButton("Test1");
		JButton b2 = new JButton("Test2");
		
	    JSplitPane c = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        c.setTopComponent(b1);
        c.setBottomComponent(b2);
        
	    p.add(c);
	    p.setBackground(Color.ORANGE);
	    
        f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
	}

}
