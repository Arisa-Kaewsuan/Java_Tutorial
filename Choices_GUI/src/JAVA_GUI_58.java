import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JAVA_GUI_58 extends JFrame
{

	public static void main(String[] args) 
	{
	   JFrame jf = new JFrame();
	   JProgressBar bar = new  JProgressBar();
	   JButton step = new JButton("Step");
	   
	   step.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e)
		   {
			   int value = bar.getValue() + 25;
			   
			   if(value>bar.getMaximum())
			   {
				   value = bar.getMaximum();
			   }
			   bar.setValue(value);
		   }
	   });
	   
	   jf.getContentPane().add(bar,BorderLayout.NORTH);
	   jf.getContentPane().add(step,BorderLayout.EAST);
       jf.pack();
       jf.setVisible(true);
	}

}
