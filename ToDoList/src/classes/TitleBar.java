package classes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TitleBar extends JFrame
{
	//constructor
	TitleBar()
	{
		this.setPreferredSize(new Dimension(400,50));
		
		JLabel titleText = new JLabel("To Do List");
		titleText.setPreferredSize(new Dimension(200,80));
		titleText.setFont(new Font("Sans-serif",Font.BOLD,20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
	}
}
