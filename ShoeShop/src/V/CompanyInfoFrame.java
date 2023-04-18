package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import M.CompanyInfoDB;
import M.CompanyInfoManager;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyInfoFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_company_name;
	private JTextField textField_address;
	private JTextField textField_email;
	private JTextField textField_phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyInfoFrame frame = new CompanyInfoFrame();
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
	public CompanyInfoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_company_name = new JTextField();
		textField_company_name.setBounds(143, 29, 245, 20);
		contentPane.add(textField_company_name);
		textField_company_name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Company Name");
		lblNewLabel.setBounds(31, 32, 87, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(31, 63, 87, 14);
		contentPane.add(lblAddress);
		
		textField_address = new JTextField();
		textField_address.setColumns(10);
		textField_address.setBounds(143, 60, 245, 20);
		contentPane.add(textField_address);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(31, 122, 87, 14);
		contentPane.add(lblEmail);
		
		textField_email = new JTextField();
		textField_email.setColumns(10);
		textField_email.setBounds(143, 119, 245, 20);
		contentPane.add(textField_email);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(31, 91, 87, 14);
		contentPane.add(lblPhone);
		
		textField_phone = new JTextField();
		textField_phone.setColumns(10);
		textField_phone.setBounds(143, 88, 245, 20);
		contentPane.add(textField_phone);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xCompanyInfoDB.company_name = textField_company_name.getText();
				xCompanyInfoDB.address = textField_address.getText();
				xCompanyInfoDB.phone = textField_phone.getText();
				xCompanyInfoDB.email = textField_email.getText();
				CompanyInfoManager.edit(xCompanyInfoDB);
			}
		});
		btnSave.setBounds(143, 168, 89, 23);
		contentPane.add(btnSave);
		
		loadData();
	}
	
	CompanyInfoDB  xCompanyInfoDB;
	public void loadData()
	{
		xCompanyInfoDB  = CompanyInfoManager.getCompanyInfo();
		textField_company_name.setText(xCompanyInfoDB.company_name);
		textField_address.setText(xCompanyInfoDB.address);
		textField_phone.setText(xCompanyInfoDB.phone);
		textField_email.setText(xCompanyInfoDB.email);
	}

}
