import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class intactAbode extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField password;
	private JTextField OK;
	private JTextField Close;
	private JLabel pass;
	private JLabel users;
	private JLabel close;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intactAbode frame = new intactAbode();
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
	public intactAbode() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 180, 629, 356);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.PLAIN, 15));
		user.setBounds(172, 107, 320, 32);
		contentPane.add(user);
		user.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		password.setBounds(172, 174, 320, 32);
		contentPane.add(password);
		
		OK = new JTextField();
		OK.setBackground(new Color(105, 105, 105));
		OK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		OK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		OK.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		OK.setText("LOGIN");
		OK.setHorizontalAlignment(SwingConstants.CENTER);
		OK.setFont(new Font("Tahoma", Font.BOLD, 15));
		OK.setBounds(172, 248, 122, 32);
		contentPane.add(OK);
		OK.setColumns(10);
		
		Close = new JTextField();
		Close.setBackground(new Color(240, 128, 128));
		Close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		Close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Close.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Close.setText("CLOSE");
		Close.setFont(new Font("Tahoma", Font.BOLD, 15));
		Close.setHorizontalAlignment(SwingConstants.CENTER);
		Close.setColumns(10);
		Close.setBounds(368, 248, 122, 32);
		contentPane.add(Close);
		
		JLabel Login = new JLabel("LOGIN");
		Login.setForeground(new Color(255, 255, 255));
		Login.setFont(new Font("Tahoma", Font.BOLD, 25));
		Login.setHorizontalAlignment(SwingConstants.CENTER);
		Login.setBounds(267, 26, 146, 47);
		contentPane.add(Login);
		
		JLabel person = new JLabel("");
		person.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\user (3).png"));
		person.setHorizontalAlignment(SwingConstants.CENTER);
		person.setBounds(76, 91, 89, 67);
		contentPane.add(person);
		
		JLabel pass = new JLabel("");
		pass.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\lock.png"));
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setBounds(76, 153, 86, 72);
		contentPane.add(pass);
		
		users = new JLabel("");
		users.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\person (1).png"));
		users.setHorizontalAlignment(SwingConstants.CENTER);
		users.setBounds(220, 26, 74, 47);
		contentPane.add(users);
		
		close = new JLabel("");
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\close (2).png"));
		close.setHorizontalAlignment(SwingConstants.CENTER);
		close.setBounds(575, 11, 44, 32);
		contentPane.add(close);
	}

}
