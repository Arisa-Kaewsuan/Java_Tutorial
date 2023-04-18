package V;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import M.CustomerDB;
import M.CustomerManager;
import M.ProductDB;
import M.ProductManager;
import M.UserDB;
import M.UserManager;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_id;
	private JTextField textField_username;
	private JTextField textField_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					UserFrame frame = new UserFrame();
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
	public UserFrame() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 580, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 310, 369);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(table.getSelectedRowCount() < 1)
				{
					return;
				}
				int index = table.getSelectedRow();
				int id = Integer.parseInt(table.getValueAt(index, 0).toString());
				String username = table.getValueAt(index, 1).toString();
				String password = "" + table.getValueAt(index, 2);
				String usertype = "" + table.getValueAt(index, 3);
				
				textField_id.setText("" + id);
				textField_username.setText("" + username);
				textField_password.setText("" + password);
				comboBox.setSelectedItem(usertype);
			}
		});
		scrollPane.setViewportView(table);
		
		
		JLabel label = new JLabel("id");
		label.setBounds(348, 30, 52, 14);
		contentPane.add(label);
		
		textField_id = new JTextField();
		textField_id.setEditable(false);
		textField_id.setColumns(10);
		textField_id.setBackground(Color.YELLOW);
		textField_id.setBounds(410, 24, 144, 20);
		contentPane.add(textField_id);
		
		textField_username = new JTextField();
		textField_username.setColumns(10);
		textField_username.setBounds(410, 57, 144, 20);
		contentPane.add(textField_username);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(348, 63, 52, 14);
		contentPane.add(lblUsername);
		
		textField_password = new JTextField();
		textField_password.setColumns(10);
		textField_password.setBounds(410, 92, 144, 20);
		contentPane.add(textField_password);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(348, 98, 52, 14);
		contentPane.add(lblPassword);
		
		JLabel lblUsertype = new JLabel("usertype");
		lblUsertype.setBounds(348, 129, 52, 14);
		contentPane.add(lblUsertype);
		
		JButton button_save = new JButton("SAVE NEW");
		button_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDB x = new UserDB(0 , textField_username.getText().trim(), textField_password.getText().trim() , comboBox.getSelectedItem().toString().trim());
				UserManager.saveNewUser(x);
				load();
				
				textField_id.setText("");
				textField_username.setText("");
				textField_password.setText("");
				
				JOptionPane.showMessageDialog(UserFrame.this , "finish!!");
			}
		});
		button_save.setBounds(423, 175, 89, 23);
		contentPane.add(button_save);
		
		JButton button_edit = new JButton("EDIT");
		button_edit.setBounds(423, 209, 89, 23);
		contentPane.add(button_edit);
		
		JButton button_delete = new JButton("DELETE");
		button_delete.setBounds(423, 243, 89, 23);
		contentPane.add(button_delete);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"admin", "user"}));
		comboBox.setBounds(410, 123, 144, 22);
		contentPane.add(comboBox);
		
		load();
	}
	
	ArrayList<UserDB> list;
	private JTable table;
	private JComboBox<String> comboBox;
	public void load()
	{
		list = UserManager.getAllUser();
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("username");
		model.addColumn("password");
		model.addColumn("usertype");
		
		for(UserDB c : list)
		{
			model.addRow(new Object[] {c.Id,c.username,c.password,c.usertype});
		}
		
	}
}
