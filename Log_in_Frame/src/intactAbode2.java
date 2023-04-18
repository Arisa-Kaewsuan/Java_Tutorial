import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.Dimension;

public class intactAbode2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intactAbode2 frame = new intactAbode2();
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
	public intactAbode2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 426);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 245, 426);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		JLabel hello = new JLabel("<html> Hi ! <br> InStact </html>");
		hello.setLabelFor(hello);
		hello.setForeground(Color.DARK_GRAY);
		hello.setFont(new Font("Arial", Font.BOLD, 20));
		hello.setHorizontalAlignment(SwingConstants.CENTER);
		hello.setBounds(82, 160, 93, 124);
		panel.add(hello);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 0, 33, 29);
		panel.add(lblNewLabel_3);
		
		JLabel circle = new JLabel("");
		circle.setHorizontalAlignment(SwingConstants.CENTER);
		circle.setIcon(new ImageIcon("C:\\Users\\Maple\\eclipse-workspace\\Log_in_Frame\\Images\\dry-clean (2).png"));
		circle.setBounds(10, 128, 225, 199);
		panel.add(circle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(244, 0, 380, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register  Now");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(94, 11, 184, 18);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(290, 67, 58, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.GRAY);
		lblEmail.setFont(new Font("Arial", Font.BOLD, 13));
		lblEmail.setBounds(290, 127, 58, 22);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(Color.GRAY);
		lblPhone.setFont(new Font("Arial", Font.BOLD, 13));
		lblPhone.setBounds(290, 193, 58, 22);
		contentPane.add(lblPhone);
		
		JLabel lblHowDidYou = new JLabel("How did you find us ?");
		lblHowDidYou.setForeground(Color.GRAY);
		lblHowDidYou.setFont(new Font("Arial", Font.BOLD, 13));
		lblHowDidYou.setBounds(290, 256, 184, 22);
		contentPane.add(lblHowDidYou);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(303, 350, 94, 34);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Submit");
		lblNewLabel_2.setBackground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 11, 74, 14);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(466, 350, 94, 34);
		contentPane.add(panel_3);
		
		JLabel lblClose = new JLabel("Close");
		lblClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setForeground(Color.WHITE);
		lblClose.setFont(new Font("Arial", Font.BOLD, 13));
		lblClose.setBounds(10, 11, 74, 14);
		panel_3.add(lblClose);
		
		textField = new JTextField();
		textField.setForeground(Color.ORANGE);
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setBackground(UIManager.getColor("Button.background"));
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.ORANGE));
		textField.setBounds(287, 94, 298, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.ORANGE);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setBackground(UIManager.getColor("Button.background"));
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.ORANGE));
		textField_1.setColumns(10);
		textField_1.setBounds(287, 158, 298, 25);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.ORANGE);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_2.setBackground(UIManager.getColor("Button.background"));
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.ORANGE));
		textField_2.setColumns(10);
		textField_2.setBounds(287, 220, 298, 25);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.ORANGE);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setBackground(UIManager.getColor("Button.background"));
		textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.ORANGE));
		textField_3.setColumns(10);
		textField_3.setBounds(287, 288, 298, 25);
		contentPane.add(textField_3);
	}
}
