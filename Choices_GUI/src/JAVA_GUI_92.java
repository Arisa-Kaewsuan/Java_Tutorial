import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JAVA_GUI_92 extends JFrame implements ActionListener
{
    static JFrame f;
    static JDialog d,d1;
    
	public static void main(String[] args) 
	{
		f = new JFrame("frame");
		
		JAVA_GUI_92 s = new  JAVA_GUI_92 ();
		
		JPanel p = new JPanel();
		JButton b = new JButton("Who");
		
		b.addActionListener((ActionListener) s);
		 
		p.add(b);
		f.add(p);
        f.setBounds(200,200,300,300);
        f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s = e.getActionCommand();
		if(s.equals("Who"))
		{
			// create a dialog Box
			d = new JDialog(f,"CAT");
			
			// create a label
		    JLabel l = new JLabel("I am a cat");
			
			// create a button
			JButton b = new JButton("click for sound");
			
			// add Action Listener
		    b.addActionListener(this);
			
			// create a panel
			JPanel p new JPanel();
			
			// add components to panel
			p.add(b);
			p.add(l);
			
			// add panel to dialog
			d.add(p);
			
			// show dialog
			d.setSize(200,200);
			d.setVisible(true);
		}
		else
		{
			// create a dialog Box
			d1 = new JDialog(d,"SOUND");
			
			// create a label
			JLabel l = new JLabel("MEOWWWWW");
			
			// add label to dialog
			d1.add(l);
			
			// show dialog
			d1.setSize(200,200);
			d1.setLocation(200,200);
			d1.setVisible(true);
		}
	}

}
