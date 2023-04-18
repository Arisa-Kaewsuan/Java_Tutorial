package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;

public class SignupFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupFrame frame = new SignupFrame();
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
	public SignupFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSignUp.setBounds(20, 11, 80, 22);
		contentPane.add(lblSignUp);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(106, 84, 177, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 128, 177, 20);
		contentPane.add(textField_1);
		
		JLabel label_1 = new JLabel("ID / E-mail");
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		label_1.setBounds(31, 82, 69, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		label_2.setBounds(31, 122, 69, 28);
		contentPane.add(label_2);
		
		JButton btnSignUp = new JButton("SIGN  UP");
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnSignUp.setBackground(Color.LIGHT_GRAY);
		btnSignUp.setBounds(31, 183, 252, 23);
		contentPane.add(btnSignUp);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(20, 61, 275, 185);
		contentPane.add(editorPane);
	}

}
