import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Emerson_Dalwampo extends JFrame {
	

	private JPanel keys;
	private JLabel man;
	private JLabel person;
	private JLabel key;
	private JLabel icon;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel log;
	private JLabel close;
	private JLabel LoginMessage;
	private JLabel LogMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emerson_Dalwampo frame = new Emerson_Dalwampo();
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
	public Emerson_Dalwampo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 430);
		setUndecorated(true);
		setLocationRelativeTo(null);
		keys = new JPanel();
		keys.setBackground(new Color(0, 128, 128));
		keys.setBorder(new LineBorder(new Color(47, 79, 79), 2));
		setContentPane(keys);
		keys.setLayout(null);
		
		person = new JLabel("");
		person.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\user.png"));
		person.setHorizontalAlignment(SwingConstants.CENTER);
		person.setBounds(331, 147, 52, 41);
		keys.add(person);
		
		key = new JLabel("");
		key.setBackground(new Color(255, 255, 255));
		key.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\login (1).png"));
		key.setHorizontalAlignment(SwingConstants.CENTER);
		key.setBounds(331, 211, 59, 41);
		keys.add(key);
		
		icon = new JLabel("");
		icon.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\bank-icon.png"));
		icon.setHorizontalAlignment(SwingConstants.CENTER);
		icon.setBounds(153, 25, 158, 86);
		keys.add(icon);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(84, 147, 295, 41);
		keys.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}		
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals("")) {
					txtUsername.setText("Username");
				}
			}
		});
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsername.setForeground(new Color(105, 105, 105));
		txtUsername.setBorder(null);
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 11, 236, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(84, 211, 295, 41);
		keys.add(panel_1);
		panel_1.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
					pwdPassword.setEchoChar('●');
					pwdPassword.setText("");
				}
				else {
					pwdPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPassword.getText().equals("")) {
					pwdPassword.setText("Password");
				}
			}
		});
		pwdPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		pwdPassword.setForeground(new Color(105, 105, 105));
		pwdPassword.setBorder(null);
		pwdPassword.setEchoChar((char)0);
		pwdPassword.setText("Password");
		pwdPassword.setBounds(10, 11, 236, 20);
		panel_1.add(pwdPassword);
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("admin") && pwdPassword.getText().equals("admin123")) {
					LogMessage.setText("");
					JOptionPane.showMessageDialog(null,"Login Successful");
				}
				else if (txtUsername.getText().equals("") || txtUsername.getText().equals("Username") || pwdPassword.getText().equals("") || pwdPassword.getText().equals("Password")) {
					LogMessage.setText("Plese input all requirement !");
				}
				else {
					LogMessage.setText("Username & Password didn't match");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2.setBackground(new Color(30,60,60));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(new Color(47,79,79));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel_2.setBackground(new Color(60,80,80));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_2.setBackground(new Color(30,60,60));
			}
			
		});
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.setBackground(new Color(47, 79, 79));
		panel_2.setBounds(84, 313, 295, 41);
		keys.add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(144, 0, 141, 41);
		panel_2.add(lblNewLabel);
		
		log = new JLabel("");
		log.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\key (1).png"));
		log.setHorizontalAlignment(SwingConstants.RIGHT);
		log.setBounds(70, 0, 62, 41);
		panel_2.add(log);
		
		close = new JLabel("X");
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to close this application ?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					Emerson_Dalwampo.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				close.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				close.setForeground(Color.white);
			}
		});
		close.setHorizontalAlignment(SwingConstants.CENTER);
		close.setFont(new Font("Tahoma", Font.BOLD, 15));
		close.setForeground(new Color(255, 255, 255));
		close.setBounds(432, 0, 46, 41);
		keys.add(close);
		
		LogMessage = new JLabel("  New label");
		LogMessage.setForeground(new Color(255, 160, 122));
		LogMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		LogMessage.setBounds(84, 278, 295, 24);
		keys.add(LogMessage);
		
	
	}
}
