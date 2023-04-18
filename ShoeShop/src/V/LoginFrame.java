package V;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import M.UserManager;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
		setTitle("ShoeShop Login");
		setAlwaysOnTop(true);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 236);
		/*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setLocation(arg0 , arg1) ;*/
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_username = new JTextField();
		textField_username.setBounds(114, 54, 125, 20);
		contentPane.add(textField_username);
		textField_username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					check();				}
			}
		});
		passwordField.setBounds(114, 99, 125, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				check();
			}
		});
		btnLogin.setBounds(34, 146, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(149, 146, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(22, 57, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(24, 102, 62, 14);
		contentPane.add(lblNewLabel_1);
	}
	
	public void check()
	{
	if(UserManager.checkLogin(textField_username.getText(), new String(passwordField.getPassword())))
	{
		MainFrame f = new MainFrame();
		f.setVisible(true);
		
		LoginFrame.this.setVisible(false);
	}
	else
	{
		JOptionPane.showMessageDialog(LoginFrame.this , "username or password incorrect!!!");
	}
	}
}
