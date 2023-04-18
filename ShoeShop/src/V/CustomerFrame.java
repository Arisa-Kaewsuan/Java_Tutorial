package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import M.CustomerDB;
import M.CustomerManager;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerFrame extends JFrame
{

	private JPanel contentPane;
	private JTable table;
	private JTextField textField_id;
	private JTextField textField_name;
	private JTextField textField_surname;
	private JTextField textField_phone;
	ArrayList<CustomerDB>  list;

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
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CustomerFrame frame = new CustomerFrame();
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
	public CustomerFrame()
	{
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 656, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 390, 369);
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
				String name = table.getValueAt(index, 1).toString();
				String surname = table.getValueAt(index, 2).toString();
				String phone = table.getValueAt(index, 3).toString();
				
				textField_id.setText("" + id);
				textField_name.setText("" + name);
				textField_surname.setText("" + surname);
				textField_phone.setText("" + phone);
				
			}
		});
		table.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				System.out.println(arg0.getPropertyName());
				//if(arg0.getPropertyName())
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(400, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_id = new JTextField();
		textField_id.setEditable(false);
		textField_id.setBackground(Color.YELLOW);
		textField_id.setBounds(462, 8, 142, 20);
		contentPane.add(textField_id);
		textField_id.setColumns(10);
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		textField_name.setBounds(462, 41, 142, 20);
		contentPane.add(textField_name);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(400, 47, 46, 14);
		contentPane.add(lblName);
		
		textField_surname = new JTextField();
		textField_surname.setColumns(10);
		textField_surname.setBounds(462, 76, 142, 20);
		contentPane.add(textField_surname);
		
		JLabel lblSurname = new JLabel("surname");
		lblSurname.setBounds(400, 82, 46, 14);
		contentPane.add(lblSurname);
		
		textField_phone = new JTextField();
		textField_phone.setColumns(10);
		textField_phone.setBounds(462, 107, 142, 20);
		contentPane.add(textField_phone);
		
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setBounds(400, 113, 46, 14);
		contentPane.add(lblPhone);
		
		JButton btnSaveNew = new JButton("SAVE NEW");
		btnSaveNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerDB x = new CustomerDB(0 , textField_name.getText().trim(), textField_surname.getText().trim() , textField_phone.getText().trim());
				CustomerManager.saveNewCustomer(x);
				load();
				
				textField_id.setText("");
				textField_name.setText("");
				textField_surname.setText("");
				textField_phone.setText("");
				
				JOptionPane.showMessageDialog(CustomerFrame.this , "finish!!");
			}
		});
		btnSaveNew.setBounds(413, 164, 89, 23);
		contentPane.add(btnSaveNew);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CustomerDB x = new CustomerDB(Integer.parseInt(textField_id.getText()) , textField_name.getText().trim() ,textField_surname.getText().trim() , textField_phone.getText().trim());
				CustomerManager.editCustomer(x);
				load();
				textField_id.setText("");
				textField_name.setText("");
				textField_surname.setText("");
				textField_phone.setText("");
				
				JOptionPane.showMessageDialog(CustomerFrame.this, "finish!!");
			}
		});
		btnEdit.setBounds(413, 198, 89, 23);
		contentPane.add(btnEdit);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setBounds(413, 232, 89, 23);
		contentPane.add(btnNewButton_2);
		
		load();
	}
	
	public void load()
	{
		list = CustomerManager.getAllCustomer();
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("id");
		model.addColumn("name");
		model.addColumn("surname");
		model.addColumn("phone");
		for(CustomerDB c : list)
		{
			model.addRow(new Object[] {c.id,c.name,c.surname,c.phone});
		}
		table.setModel(model);
	}
}
