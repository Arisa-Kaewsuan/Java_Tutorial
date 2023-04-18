import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JAVA_GUI_10 extends JFrame
{
    static JFrame f;
    static JButton b , b1 , b2 ;
    static JLabel l;
    
	public static void main(String[] args) 
	{
		f = new JFrame("Hello");
		JPanel p = new JPanel();
		
		l = new JLabel("this is label");
		//p.add(l);
       // p.setBackground(Color.MAGENTA);
        
        f.add(l);
        f.setSize(300,300);
        f.setVisible(true);
	}

}
