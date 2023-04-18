import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
iimport javax.swing.JFormattedTextField;

public class xxxx extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		 try {
	            // Set System L&F
	        UIManager.setLookAndFeel(
	            UIManager.getSystemLookAndFeelClassName());
	    } 
	    catch (UnsupportedLookAndFeelException e) {
	       // handle exception
	    }
	    catch (ClassNotFoundException e) {
	       // handle exception
	    }
	    catch (InstantiationException e) {
	       // handle exception
	    }
	    catch (IllegalAccessException e) {
	       // handle exception
	    }
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					xxxx frame = new xxxx();
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
	public xxxx()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("xxxx");
		lblNewLabel.setBounds(41, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "kjkjk " , "InfoBox: " , JOptionPane.ERROR_MESSAGE);
		}
	});
		btnNewButton.setBounds(34, 57, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(165, 37, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(146, 82, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(146, 127, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(142, 182, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(146, 217, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(291, 67, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"5", "6", "7", "8", "0", "0", "hkj", "bhkh"}));
		comboBox.setBounds(291, 127, 89, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(291, 182, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(41, 115, 77, 103);
		contentPane.add(formattedTextField	System.out.println(tglbtnNewToggleButton.isSelected());
			}
		});
		tglbtnNewToggleButton.setBounds(291, 67, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		/*JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(291, 67, 121, 23);
		contentPane.add(tglbtnNewToggleButton);*/
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"5", "6", "7", "8", "0", "0", "hkj", "bhkh"}));
		comboBox.setBounds(291, 182, 89, 23);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {

			private Object xxx2;

			public void actionPerformed(ActionEvent e) {
				DefaultComboBoxModel xx = (DefaultComboBoxModel) comboBox.getModel();
				xx.removeAllElements();
				POSCustomer xxx = new POSCustomer();
				xxx.id = 2;
				xxx.name = "xxx" ;
				POSCustomer xxx2 = new POSCustomer();
				xxx2.id = 3;
				xxx2.name = "yyy" ;
				
				xx.addElement(xxx);
				xx.addElement(xxx2);
				/*xx.addElement("a");
				xx.addElement("b");
				xx.addElement("c");*/
		}
	});
		btnNewButton_1.setBounds(34, 57, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
