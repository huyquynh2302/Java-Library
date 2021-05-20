import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Main extends JFrame {
	
	private Image img_logo = new ImageIcon(Main.class.getResource("icon/logo.png")).getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setUndecorated(true);
		setTitle("Trang ch\u1EE7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Trang ch\u1EE7");
		lblNewLabel.setBounds(40, 10, 67, 22);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 38, 828, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(61, 157, 245));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 0, 200, 462);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(61, 157, 245));
		panel_2.setBounds(10, 10, 180, 49);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtAdmin = new JTextField();
		txtAdmin.setBorder(null);
		txtAdmin.setBackground(new Color(61, 157, 245));
		txtAdmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAdmin.setText("Admin");
		txtAdmin.setBounds(52, 10, 96, 29);
		panel_2.add(txtAdmin);
		txtAdmin.setColumns(10);
		
		JPanel panel_3_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1_1_1.setBounds(10, 353, 180, 49);
		panel_1.add(panel_3_1_1_1_1_1);
		
		JButton btnNewButton = new JButton("\u0110\u0103ng k\u00ED");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(61, 157, 245));
		
		btnNewButton.setBounds(51, 0, 129, 49);
		panel_3_1_1_1_1_1.add(btnNewButton);
		
		JPanel panel_3_1_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1_1_1_1.setBounds(10, 294, 180, 49);
		panel_1.add(panel_3_1_1_1_1_1_1);
		
		JButton btnQunLTi = new JButton("Qu\u1EA3n l\u00FD t\u00E0i kho\u1EA3n");
		btnQunLTi.setHorizontalAlignment(SwingConstants.LEFT);
		btnQunLTi.setForeground(Color.WHITE);
		btnQunLTi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnQunLTi.setBorder(null);
		btnQunLTi.setBackground(new Color(61, 157, 245));
		btnQunLTi.setBounds(51, 0, 129, 49);
		panel_3_1_1_1_1_1_1.add(btnQunLTi);
		
		JPanel panel_3_1_1_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1_1_1_1_1.setBounds(10, 235, 180, 49);
		panel_1.add(panel_3_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Qu\u1EA3n l\u00FD m\u01B0\u1EE3n tr\u1EA3");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(61, 157, 245));
		btnNewButton_1_1.setBounds(51, 0, 129, 49);
		panel_3_1_1_1_1_1_1_1.add(btnNewButton_1_1);
		
		JPanel panel_3_1_1_1_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1_1_1_1_1_1.setBounds(10, 176, 180, 49);
		panel_1.add(panel_3_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Qu\u1EA3n l\u00FD \u0111\u1ED9c gi\u1EA3");
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setBackground(new Color(61, 157, 245));
		btnNewButton_1_1_1.setBounds(51, 0, 129, 49);
		panel_3_1_1_1_1_1_1_1_1.add(btnNewButton_1_1_1);
		
		JPanel panel_3_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1_1_1_1_1_1_1.setBounds(10, 117, 180, 49);
		panel_1.add(panel_3_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Qu\u1EA3n l\u00FD s\u00E1ch");
		btnNewButton_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1.setBackground(new Color(61, 157, 245));
		btnNewButton_1_1_1_1.setBounds(51, 0, 129, 49);
		panel_3_1_1_1_1_1_1_1_1_1.add(btnNewButton_1_1_1_1);
		
		JPanel panel_3_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		panel_3_1_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1_1_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1_1_1_1_1_1_1_1.setBounds(10, 58, 180, 49);
		panel_1.add(panel_3_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("M\u01B0\u1EE3n s\u00E1ch");
		btnNewButton_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1_1.setBackground(new Color(61, 157, 245));
		btnNewButton_1_1_1_1_1.setBounds(51, 0, 129, 49);
		panel_3_1_1_1_1_1_1_1_1_1_1.add(btnNewButton_1_1_1_1_1);
		
		JLabel lblIonLogo = new JLabel("");
		lblIonLogo.setBounds(10, 10, 27, 28);
		contentPane.add(lblIonLogo);
		lblIonLogo.setIcon(new ImageIcon(img_logo));
		setLocationRelativeTo(null);
	}
}
