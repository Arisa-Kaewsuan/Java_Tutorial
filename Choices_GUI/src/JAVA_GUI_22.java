import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JAVA_GUI_22 extends JFrame
{  
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Hello");
		JPanel p = new JPanel();
		
	    JTextArea c = new JTextArea("Type here",2,2);
        JCheckBox b = new JCheckBox("DOG");
        b.setSelected(true);
	  
        p.add(b);
	    p.add(c);
	    p.setBackground(Color.CYAN);
	    
        f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
	}

}
