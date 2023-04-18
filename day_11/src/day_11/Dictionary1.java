package day_11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;

public class Dictionary1 extends JFrame
{

	private JPanel contentPane;
	private JTextField txt;
	private JTextArea textArea;

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
					Dictionary1 frame = new Dictionary1();
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
	public Dictionary1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THIS  IS  MY  DICTIONARY");
		lblNewLabel.setBounds(33, 11, 300, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WORD");
		lblNewLabel_1.setBounds(33, 68, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MEANNING");
		lblNewLabel_2.setBounds(33, 115, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		txt = new JTextField();
		txt.setBounds(115, 65, 200, 20);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String mytext_tosearch = txt.getText().trim().toUpperCase();
				File f = new File("dictionary2.txt");
				Scanner sc = null;
				try
				{
					boolean isFound = false;
					System.out.println("start read File");
					sc = new Scanner(f);
					while(sc.hasNext())
					{
						String word = sc.nextLine();
						String meaning = sc.nextLine();
						if(word.equals(mytext_tosearch))
						{
							textArea.setText(meaning);
							isFound = true;
							break;
						}
						
					}
					if(!isFound)
					{
						JOptionPane.showMessageDialog(Dictionary1.this, "WORD NOT FOUND");
					}
					System.out.println("end read File");
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(339, 65, 70, 20);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBackground(Color.PINK);
		textArea.setForeground(Color.WHITE);
		textArea.setBounds(115, 110, 294, 140);
		contentPane.add(textArea);
	}
}
