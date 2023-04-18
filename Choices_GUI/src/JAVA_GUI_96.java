import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JAVA_GUI_96 extends JFrame implements ItemListener,ActionListener
{
    static JFrame f;
    static JLabel l,l1;
    static JComboBox<String> c1;
    static JTextField tf ;
   
	public static void main(String[] args) 
	{
		f = new JFrame();
		
		// create a object
		JAVA_GUI_92 s = new  JAVA_GUI_92 ();
		
		// create checkbox
		String s1[] = {"ANT" , "BAT" , "CAT" };
		c1 = new JComboBox< >(s1);
		
		//create textfield
		tf = new JTextField(10);
		
		// create add and remove buttons
		JButton b = new JButton("ADD");
		JButton b1 = new JButton("REMOVE");
		
		// add ActinListener and ItemListener
		b.addActionListener(s);
		b1.addActionListener(s);
		c1.addActionListener(s);
		
		// create labels
		l = new JLabel("select your pet");
		l1 = new JLabel("- selected");
		
		// create a new panel
		JPanel p = new JPanel();
		 
		// add components to panel
		p.add(tf);
		p.add(b);
		p.add(b1);
		p.add(l);
		p.add(c1);
		p.add(l1);
		
		f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
	}

	// if button is pressed
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s = e.getActionCommand();
		if(s.equals("ADD"))
		{
			c1.addItem(tf.getText());;		
		}
		else
		{
	       c1.removeItem(tf.getText());
		}
	}

	// if the state comboBox is changed
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource() == c1) 
		{
			l1.setText(c1.getSelectedItem() + "selected");
		}
		
	}

}
