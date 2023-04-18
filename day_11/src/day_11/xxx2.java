package day_11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class xxx2 extends JFrame
{

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

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
					xxx2 frame = new xxx2();
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
	public xxx2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WORD");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		lblNewLabel.setBounds(57, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MEANING");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		lblNewLabel_1.setBounds(57, 109, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(134, 60, 150, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setEditable(false);
		txt2.setBackground(Color.LIGHT_GRAY);
		txt2.setBounds(134, 110, 260, 140);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File f = new File("D://xxx.txt");
				FileOutputStream outs;
				PrintWriter pw = null;
				try
				{
					outs = new FileOutputStream(f,true);
					pw = new PrintWriter(outs);
					pw.println(txt1.getText()+","+txt2.getText());
			        pw.close();
				} catch (FileNotFoundException e1)
				{
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(310, 61, 80, 20);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("THIS  IS  MY  DICTIONARY");
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 22, 200, 20);
		contentPane.add(lblNewLabel_2);
	}
}
