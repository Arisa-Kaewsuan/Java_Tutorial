package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class ResetPasswordFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetPasswordFrame frame = new ResetPasswordFrame();
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
	public ResetPasswordFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(84, 59, 200, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnNewButton.setBounds(71, 105, 168, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Reset  Password");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel.setBounds(84, 11, 141, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail  :");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_1.setBounds(22, 59, 64, 19);
		contentPane.add(lblNewLabel_1);
	}

}
