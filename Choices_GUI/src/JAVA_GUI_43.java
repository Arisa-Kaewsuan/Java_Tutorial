import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class JAVA_GUI_43 extends JFrame
{  
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Hello");
		JPanel p = new JPanel();
		
		JButton b1 = new JButton("Test1");
		JButton b2 = new JButton("Test1");
		
	    JToolBar c = new JToolBar();
        c.add(b1);
        c.add(b2);
        
	    p.add(c);
	    p.setBackground(Color.CYAN);
	    
        f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
	}

}
