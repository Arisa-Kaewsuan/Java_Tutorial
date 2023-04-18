package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setTitle("mapleShoeShop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.background"));
		contentPane.setForeground(UIManager.getColor("Button.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Login = new JLabel("Log-in");
		Login.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Login.setBounds(210, 41, 69, 22);
		contentPane.add(Login);
		
		textField = new JTextField();
		textField.setBounds(285, 90, 177, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(285, 134, 177, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("ID / E-mail");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(210, 88, 69, 22);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("Password");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel.setBounds(210, 128, 69, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(210, 165, 252, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Forgot password");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setForeground(Color.BLUE);
		chckbxNewCheckBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(211, 205, 124, 22);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("Sign Up");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(416, 39, 46, 31);
		contentPane.add(lblNewLabel_2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(199, 22, 275, 251);
		contentPane.add(editorPane);
		Image img = new ImageIcon(this.getClass().getResource("/output-onlinepngtools.png")).getImage();
		
	}
}
