package ConnectDatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SignupFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtRegister;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_4;

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
		setBounds(100, 100, 423, 530);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(169, 169, 169));
		panel.setBounds(0, 0, 423, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.white);
				lblNewLabel.setBorder(new MatteBorder(1,1,1,1,(Color) Color.white));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.black);
				lblNewLabel.setBorder(new MatteBorder(1,1,1,1,(Color) Color.black));
			}
		});
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(396, 11, 17, 18);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("-");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setForeground(Color.white);
				label.setBorder(new MatteBorder(1,1,1,1,(Color) Color.white));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label.setForeground(Color.black);
				label.setBorder(new MatteBorder(1,1,1,1,(Color) Color.black));
			}
		});
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		label.setBounds(372, 11, 17, 18);
		panel.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("R E G I S T E R");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(113, 21, 168, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Full Name  :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabel_2.setBounds(74, 95, 92, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblUsername = new JLabel("Username  :");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setForeground(Color.GRAY);
		lblUsername.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblUsername.setBounds(74, 137, 92, 20);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel(" Password  :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setForeground(Color.GRAY);
		lblPassword.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblPassword.setBounds(74, 178, 92, 20);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel(" Confirm Password  :");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmPassword.setForeground(Color.GRAY);
		lblConfirmPassword.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblConfirmPassword.setBounds(24, 220, 142, 20);
		contentPane.add(lblConfirmPassword);
		
		JLabel lblPhone = new JLabel("      Phone  :");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setForeground(Color.GRAY);
		lblPhone.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblPhone.setBounds(74, 268, 92, 20);
		contentPane.add(lblPhone);
		
		JLabel lblGender = new JLabel("    Gender  :");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setForeground(Color.GRAY);
		lblGender.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblGender.setBounds(74, 312, 92, 20);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton.setBounds(178, 312, 60, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton_1.setBounds(275, 312, 77, 23);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblImage = new JLabel("      Image  :");
		lblImage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImage.setForeground(Color.GRAY);
		lblImage.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblImage.setBounds(74, 352, 92, 20);
		contentPane.add(lblImage);
		
		JButton btnNewButton = new JButton("Select  Image");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(178, 352, 117, 23);
		contentPane.add(btnNewButton);
		
		txtRegister = new JTextField();
		txtRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// select an image and set the image path into a jlabel
		        String path = null;
		        
		        JFileChooser chooser = new JFileChooser();
		        
		        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		        
		        // file extension
		        FileNameExtensionFilter extension = new FileNameExtensionFilter("*.Images","jpg","png","jpeg");
		        chooser.addChoosableFileFilter(extension);
		        
		        int filestate = chooser.showSaveDialog(null);
		         
		        // check if the user select an image
		        if(filestate == JFileChooser.APPROVE_OPTION){
		            
		            File selectedImage = chooser.getSelectedFile();
		            path = selectedImage.getAbsolutePath();
		            btnNewButton.setText(path);
		        }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtRegister.setBackground(new Color(255,100,70));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtRegister.setBackground(new Color(255,127,80));
			}
		});
		txtRegister.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtRegister.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		txtRegister.setForeground(new Color(255, 255, 255));
		txtRegister.setHorizontalAlignment(SwingConstants.CENTER);
		txtRegister.setText("REGISTER");
		txtRegister.setBackground(new Color(255, 127, 80));
		txtRegister.setBounds(120, 431, 169, 36);
		contentPane.add(txtRegister);
		txtRegister.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel(">>  Already  Have  An  Account ? Log In !");
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_3.setForeground(Color.blue);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_3.setForeground(new Color(50,205,50));
			}
		});
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblNewLabel_3.setForeground(new Color(50, 205, 50));
		lblNewLabel_3.setBounds(85, 479, 227, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBorder(null);
		textField_3.setColumns(10);
		textField_3.setBounds(176, 96, 213, 23);
		contentPane.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setBorder(null);
		textField_2.setColumns(10);
		textField_2.setBounds(176, 137, 213, 23);
		contentPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setBorder(null);
		textField_1.setColumns(10);
		textField_1.setBounds(176, 178, 213, 23);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setColumns(10);
		textField.setBounds(176, 220, 213, 23);
		contentPane.add(textField);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		textField_4.setBorder(null);
		textField_4.setColumns(10);
		textField_4.setBounds(176, 268, 213, 23);
		contentPane.add(textField_4);
		
		JLabel imgpath = new JLabel("image_path");
		imgpath.setForeground(Color.GRAY);
		imgpath.setBounds(188, 378, 201, 14);
		contentPane.add(imgpath);
	}
}
