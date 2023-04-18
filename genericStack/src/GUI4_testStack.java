import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI4_testStack extends JFrame {

	private MyPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI4_testStack frame = new GUI4_testStack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI4_testStack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new MyPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.stack = new Stack<Integer>();
		contentPane.stack.push(1);
		contentPane.stack.push(2);
		contentPane.stack.push(3);
		contentPane.stack.push(4);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(34, 46, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Push");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.stack.push(Integer.parseInt(textField.getText()));
				repaint();
			}
		});
		btnNewButton.setBounds(34, 98, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Pop");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.stack.pop();
				repaint();
			}
		});
		btnNewButton_1.setBounds(34, 153, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

class MyPanel extends JPanel
{
	public Stack<Integer> stack;
	public void paint(Graphics g)
	{
		super.paint(g);
		if(stack != null)
		stack.draw(g);
	}
}