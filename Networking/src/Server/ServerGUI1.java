package Server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServerGUI1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerGUI1 frame = new ServerGUI1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Server xServer ;
	/**
	 * Create the frame.
	 */
	public ServerGUI1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 45, 546, 236);
		contentPane.add(textArea);
		
		JButton btnOpen = new JButton("OPEN");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {      // กดปุ่ม OPEN ให้ new server ขึ้นมา
				xServer = new Server(new MsgReceive() {


					@Override
					public void getMsg(String s) {            // ถ้าได้แมสเซสแล้ว จะทำอะไร 
						textArea.setText(textArea.getText() + "\r\nclient : " + s);
						
					}
					
				});
			}
		});
		btnOpen.setBounds(10, 11, 89, 23);
		contentPane.add(btnOpen);
		
		JTextField textField = new JTextField();
		textField.setBounds(10, 315, 334, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(xServer == null)
				{
					JOptionPane.showMessageDialog(ServerGUI1.this , "PLEASE PUSH OPEN BTN First");
					return;
				}
			    xServer.sendAll(textField.getText());
			    textField.setText("");
			}
		});
		btnSend.setBounds(391, 314, 89, 23);
		contentPane.add(btnSend);
	}
}
