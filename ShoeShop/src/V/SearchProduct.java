package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import M.CustomerDB;
import M.CustomerManager;
import M.ProductDB;
import M.ProductManager;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchProduct extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchProduct frame = new SearchProduct();
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
	public SearchProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 54, 414, 194);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JTextField textField_search = new JTextField();
		textField_search.setColumns(10);
		textField_search.setBounds(10, 23, 203, 20);
		panel.add(textField_search);
		
		JButton button_search = new JButton("Search");
		button_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});
		button_search.setBounds(223, 22, 89, 23);
		panel.add(button_search);
		
		JButton button_select = new JButton("Select");
		button_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRowCount() == 0)
				{
					JOptionPane.showMessageDialog(SearchProduct.this, "Please Select 1 row ");
					return;
				}
				if(xSelectProductI != null)
				{
					if(list != null)
					{
					xSelectProductI.select(list.get(table.getSelectedRow()));
					setVisible(false);
					}
				}
			}
		});
		button_select.setBounds(353, 22, 71, 23);
		panel.add(button_select);
	}
	SelectProductI xSelectProductI;
	public void setSelectProductI(SelectProductI x)
	{
		xSelectProductI = x;
	}
	
	ArrayList<ProductDB>  list;
	public void search()
	{

		list = ProductManager.searchProduct(textField_search.getText());
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("id");
		model.addColumn("name");
		model.addColumn("surname");
		model.addColumn("phone");
		for(ProductDB c : list)
		{
			model.addRow(new Object[] {c.id,c.name,c.surname,c.phone});
		}
		table.setModel(model);
	}
}
interface SelectProductI
{
	public void select(ProductDB x);
}

