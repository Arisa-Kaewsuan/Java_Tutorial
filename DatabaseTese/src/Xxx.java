import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Xxx extends JFrame
{
	private JPanel contentPane;
	private Container bg1;

	public static void main(String[] args)
	{
		try {
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
					Xxx frame = new Xxx();
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
	public Xxx()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		getContentPane().setLayout(null);
		
		JLabel lblXxxxxx = new JLabel("xxxxxx");
		lblXxxxxx.setBounds(21, 31, 46, 14);
		getContentPane().add(lblXxxxxx);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "kjkjk " , "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
		}
	});
		btnNewButton.setBounds(34, 57, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextField textField = new JTextField();
		textField.setBounds(188 , 11 , 86 , 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(142,72,97,23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(142,100,97,23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(130,142,109,23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(130,142,109,23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		bg1.add(rdbtnNewRadioButton);
		bg1.add(rdbtnNewRadioButton);
		
	}
}
