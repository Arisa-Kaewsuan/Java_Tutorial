import javax.swing.JFrame;

public class Main 
{
	public static void main(String[] args) 
	{
		JFrame obj = new JFrame();
		Gameplay gameplay = new Gameplay();
		obj.setBounds(10,10,700,600);
        obj.setVisible(true);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);	
    }

}
