package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import M.CustomerDB;
import M.CustomerManager;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchCustomer extends JFrame {

	private JPanel contentPane;
	private JTable table;
	SelectCustomerI xSelectCustomerI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchCustomer frame = new SearchCustomer();
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
	public SearchCustomer() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 414, 194);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textField_Search = new JTextField();
		textField_Search.setBounds(10, 23, 203, 20);
		contentPane.add(textField_Search);
		textField_Search.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});
		btnSearch.setBounds(223, 22, 89, 23);
		contentPane.add(btnSearch);
		
		btnNewButton = new JButton("Select");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRowCount() == 0)
				{
					JOptionPane.showMessageDialog(SearchCustomer.this, "Please Select 1 row ");
					return;
				}
				if(xSelectCustomerI != null)
				{
					if(list != null)
					{
					xSelectCustomerI.select(list.get(table.getSelectedRow()));
					setVisible(false);
					}
				}
			}
		});
		btnNewButton.setBounds(353, 22, 71, 23);
		contentPane.add(btnNewButton);
		
		load();
	}
	
	ArrayList<CustomerDB>  list;
	private JButton btnNewButton;
	private JTextField textField_Search;
	
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
	
	public void search()
	{
		list = CustomerManager.searchCustomer(textField_Search.getText());
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
	
	public void setSelectCustomerI(SelectCustomerI x)
	{
		xSelectCustomerI = x;
	}
}

interface SelectCustomerI
{
	public void select(CustomerDB x);
}
