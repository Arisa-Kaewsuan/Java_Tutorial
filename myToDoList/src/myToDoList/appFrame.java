package myToDoList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class appFrame extends JFrame
{
	private JButton btn;
	
	public appFrame() 
	{
		this.setSize(400, 600);
		this.setVisible(true);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(btn);
	}
}
