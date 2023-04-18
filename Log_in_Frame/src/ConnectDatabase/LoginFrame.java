package ConnectDatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Cursor;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 337);
		setUndecorated(true);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(169, 169, 169));
		panel.setBounds(0, 0, 450, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Close = new JLabel("X");
		Close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Close.setForeground(Color.white);
				Close.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.white));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Close.setForeground(Color.black);
				Close.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.black));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to close this application ?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					LoginFrame.this.dispose();
				}
			}
		});
		Close.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Close.setFont(new Font("Arial", Font.BOLD, 13));
		Close.setHorizontalAlignment(SwingConstants.CENTER);
		Close.setBounds(421, 11, 19, 23);
		panel.add(Close);
		
		JLabel Hide = new JLabel("-");
		Hide.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Hide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Hide.setForeground(Color.white);
				Hide.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.white));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Hide.setForeground(Color.black);
				Hide.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.black));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		Hide.setHorizontalAlignment(SwingConstants.CENTER);
		Hide.setFont(new Font("Arial", Font.BOLD, 13));
		Hide.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Hide.setBounds(397, 11, 19, 23);
		panel.add(Hide);
		
		JLabel lblNewLabel = new JLabel("L O G I N");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(139, 15, 161, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel(">> No  Account ?  Sign Up !");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(new Color(178, 34, 34));
		lblNewLabel_2.setBounds(121, 289, 282, 20);
		contentPane.add(lblNewLabel_2);
		
		txtLogin = new JTextField();
		txtLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtLogin.setBackground(new Color(65,80,200));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtLogin.setBackground(new Color(65,105,225));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				 PreparedStatement st;
			     ResultSet rs;
			        
			        // get the username & password
			        String username = txtUsername.getText();
			        String password = String.valueOf(pwdPassword.getPassword());
			        
			        //create a select query to check if the username and the password exist in the database
			        String query = "SELECT * FROM `users` WHERE `username` = ? AND `password` = ?";
			        
			        // show a message if the username or the password fields are empty
			        if(txtUsername.getText().trim().equals("username"))
			        {
			            JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username", 2);
			        }
			        else if(pwdPassword.getText().trim().equals("password"))
			        {
			            JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password", 2);
			        }
			        else{
			            
			            try {
			            st =  My_CNX.getConnection().prepareStatement(query);
			            
			            st.setString(1, username);
			            st.setString(2, password);
			            rs = st.executeQuery();
			            
			            if(rs.next())
			            {
			                // show a new form
			                MainFrame form = new MainFrame();
			                form.setVisible(true);
			                form.pack();
			                form.setLocationRelativeTo(null);
			                // close the current form(login form)
			                dispose();
			                
			            }else{
			                // error message
			                JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
			            }
			            
			        } catch (SQLException ex) {
			            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
			        }
			            
			        }
			                                             
			}
		});
		txtLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtLogin.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		txtLogin.setText("LOGIN");
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setForeground(new Color(255, 255, 255));
		txtLogin.setBackground(new Color(65, 105, 225));
		txtLogin.setBounds(111, 246, 306, 32);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(111, 108, 306, 40);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
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
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUsername.setForeground(new Color(192, 192, 192));
		txtUsername.setText("Username");
		txtUsername.setBorder(null);
		txtUsername.setBounds(10, 11, 286, 20);
		panel_4.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(111, 179, 306, 39);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
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
		pwdPassword.setEchoChar((char)0);
		pwdPassword.setForeground(new Color(192, 192, 192));
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pwdPassword.setText("Password");
		pwdPassword.setBorder(null);
		pwdPassword.setBounds(10, 11, 286, 20);
		panel_5.add(pwdPassword);
		
		JLabel user = new JLabel("");
		user.setHorizontalAlignment(SwingConstants.CENTER);
		user.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\man (1).png"));
		user.setBounds(26, 97, 75, 62);
		contentPane.add(user);
		
		JLabel lock = new JLabel("");
		lock.setHorizontalAlignment(SwingConstants.CENTER);
		lock.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\login (1).png"));
		lock.setBounds(39, 170, 62, 56);
		contentPane.add(lock);
		
	
		
	}

}
