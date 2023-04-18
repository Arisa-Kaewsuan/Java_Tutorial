package ConnectDatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 429);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(128, 128, 128)));
		panel.setBounds(0, 0, 518, 429);
		contentPane.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(10, 88, 149, 330);
		panel.add(panel_2);
		
		JLabel label_2 = new JLabel(">>  Home");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("3ds", Font.BOLD, 13));
		label_2.setBounds(21, 36, 105, 20);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel(">>  Home");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("3ds", Font.BOLD, 13));
		label_3.setBounds(21, 76, 105, 20);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel(">>  Home");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("3ds", Font.BOLD, 13));
		label_4.setBounds(21, 119, 105, 20);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel(">>  Home");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("3ds", Font.BOLD, 13));
		label_5.setBounds(21, 163, 105, 20);
		panel_2.add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(0, 0, 517, 77);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Create  A  Menu  In  Java");
		label.setBounds(124, 23, 253, 32);
		panel_1.add(label);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel label_1 = new JLabel("X");
		label_1.setBounds(486, 11, 21, 20);
		panel_1.add(label_1);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setForeground(Color.white);
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("3ds", Font.BOLD, 15));
	}

}
