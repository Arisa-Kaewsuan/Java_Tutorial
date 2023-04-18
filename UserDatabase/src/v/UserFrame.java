package v;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import m.UserDB;
import m.UserDBManager;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserFrame extends JFrame
{

	private JPanel contentPane;
	private JTextField txt_id;
	private JTextField txt_username;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					UserFrame frame = new UserFrame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();	
		scrollPane.setBounds(10, 11, 289, 360);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int index = table.getSelectedRow();
				if(index == -1) {
					return;
				}
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				txt_id.setText(""+model.getValueAt(index, 0));
				txt_username.setText(""+model.getValueAt(index, 1));
				passwordField.setText(""+model.getValueAt(index, 2));
				
				comboBox.setSelectedItem(""+model.getValueAt(index, 3));
			}
		});
		
		scrollPane.setViewportView(table);
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(312, 11, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(312, 36, 59, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		 lblPassword.setBounds(312, 61, 46, 14);
		contentPane.add( lblPassword);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"admin", "user"}));
		comboBox.setBounds(382, 80, 86, 22);
		contentPane.add(comboBox);
		
		JLabel lblUsertype = new JLabel("usertype");
		lblUsertype.setBounds(312, 84, 46, 14);
		contentPane.add(lblUsertype);
		
		txt_id = new JTextField();
		txt_id.setEditable(false);
		txt_id.setBounds(382, 9, 86, 20);
		contentPane.add(txt_id);
		txt_id.setColumns(10);
		
		txt_username = new JTextField();
		txt_username.setBounds(382, 33, 86, 20);
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(382, 58, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnInsertNewUser = new JButton("Insert new user");
		btnInsertNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("a");
				System.out.println("c");
				UserDB x = new UserDB();

				System.out.println("b");
				x.Username = txt_username.getText();

				System.out.println("c");// ดึง text ที่อยู่ใน txt_username เก็บลงใน x.user
				x.Password = new String(passwordField.getPassword());  
				x.UserType = (String) comboBox.getSelectedItem();

				System.out.println("d");
				UserDBManager.addNewUser(x);

				System.out.println("e");
				JOptionPane.showMessageDialog(UserFrame.this,"Insert Finish!!");

				System.out.println("f");
				load_data();

				System.out.println("g");
			}
		});
		btnInsertNewUser.setBounds(353, 127, 115, 23);
		contentPane.add(btnInsertNewUser);
		
		JButton btnEditUser = new JButton("edit user");
		btnEditUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserDB x = new UserDB();
				x.id = Integer.parseInt(txt_id.getText());
				x.Username = txt_username.getText();                   // ดึง text ที่อยู่ใน txt_username เก็บลงใน x.user
				x.Password = new String(passwordField.getPassword());  
				x.UserType = (String) comboBox.getSelectedItem();
				
				UserDBManager.updateUser(x);
				JOptionPane.showMessageDialog(UserFrame.this,"Update Finish!!");
				
				load_data();
			}
		});
		btnEditUser.setBounds(363, 161, 89, 23);
		contentPane.add(btnEditUser);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(UserFrame.this, 
						"please Confirm to delete User ?","confirm",JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION)
				{
					int k = 0;
					if(!txt_id.getText().matches("\\d+"))
					{
						JOptionPane.showMessageDialog(UserFrame.this,"Please select one row on table");
						return;
					}
					UserDB x = new UserDB();
					x.id = Integer.parseInt(txt_id.getText());
					UserDBManager.deleteUser(x);
					load_data();
				}
			}
		});
		btnDelete.setBounds(363, 195, 89, 23);
		contentPane.add(btnDelete);
		
		load_data();
	}
	
	ArrayList<UserDB> allUsers;
	private JComboBox<String> comboBox;
	public void load_data()
	{
		allUsers = UserDBManager.getAllUsers();
		DefaultTableModel model = new DefaultTableModel();  // create table 
		model.addColumn("id");
		model.addColumn("Username");
		model.addColumn("pass");
		model.addColumn("type");
		
		for(UserDB x : allUsers)
		{
			model.addRow(new Object[] {"" + x.id , x.Username , x.Password , x.UserType});  // class object เหมือนป็นอุปกรณืเก็บข้อมูล
		}
		table.setModel(model);   // ยัด model ลงในตาราง
	}
}
