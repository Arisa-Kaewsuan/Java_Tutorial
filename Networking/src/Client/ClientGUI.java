package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Server.MsgReceive;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_ip;
	private JTextField textField_port;
	JTextArea textArea;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientGUI frame = new ClientGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Client xClient;
	/**
	 * Create the frame.
	 */
	public ClientGUI() {
		setTitle("Client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xClient = new Client(new MsgReceive()
						{
					       @Override
					       public void getMsg(String s)
					       {
					    	  textArea.setText(textArea.getText()+ "\r\n" + s); 
					       }
						} , textField_ip.getText() , Integer.parseInt(textField_port.getText()));
			}
		});
		btnConnect.setBounds(10, 11, 89, 23);
		contentPane.add(btnConnect);
		
		textArea= new JTextArea();
		textArea.setBounds(10, 45, 560, 236);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 315, 334, 20);
		contentPane.add(textField);
		
		JButton button_send = new JButton("SEND");
		button_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xClient.send(textField.getText() );
				textField.setText("");
			}
		});
		button_send.setBounds(381, 314, 89, 23);
		contentPane.add(button_send);
		
		textField_ip = new JTextField();
		textField_ip.setText("127.0.0.1");
		textField_ip.setBounds(130, 12, 153, 20);
		contentPane.add(textField_ip);
		textField_ip.setColumns(10);
		
		textField_port = new JTextField();
		textField_port.setText("1234");
		textField_port.setColumns(10);
		textField_port.setBounds(357, 12, 153, 20);
		contentPane.add(textField_port);
	}
}
