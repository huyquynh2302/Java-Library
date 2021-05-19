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

public class Main extends JFrame {
	
	private Image img_logo = new ImageIcon(Main.class.getResource("icon/logo.png")).getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtAdmin;
	private JTextField txtMnSch;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(61, 157, 245));
		panel_3.setBounds(10, 56, 180, 49);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		txtMnSch = new JTextField();
		txtMnSch.setBorder(null);
		txtMnSch.setForeground(Color.WHITE);
		txtMnSch.setBackground(new Color(61, 157, 245));
		txtMnSch.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtMnSch.setText("M\u01B0\u1EE3n s\u00E1ch");
		txtMnSch.setBounds(52, 0, 96, 49);
		panel_3.add(txtMnSch);
		txtMnSch.setColumns(10);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(61, 157, 245));
		panel_3_1.setBounds(10, 115, 180, 49);
		panel_1.add(panel_3_1);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setForeground(Color.WHITE);
		textField.setText("M\u01B0\u1EE3n s\u00E1ch");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBackground(new Color(61, 157, 245));
		textField.setBounds(52, 0, 96, 49);
		panel_3_1.add(textField);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1.setBounds(10, 175, 180, 49);
		panel_1.add(panel_3_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBorder(null);
		textField_1.setForeground(Color.WHITE);
		textField_1.setText("M\u01B0\u1EE3n s\u00E1ch");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(61, 157, 245));
		textField_1.setBounds(52, 0, 96, 49);
		panel_3_1_1.add(textField_1);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1.setBounds(10, 234, 180, 49);
		panel_1.add(panel_3_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(null);
		textField_2.setForeground(Color.WHITE);
		textField_2.setText("M\u01B0\u1EE3n s\u00E1ch");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(61, 157, 245));
		textField_2.setBounds(52, 0, 96, 49);
		panel_3_1_1_1.add(textField_2);
		
		JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1_1.setBounds(10, 294, 180, 49);
		panel_1.add(panel_3_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBorder(null);
		textField_3.setForeground(Color.WHITE);
		textField_3.setText("M\u01B0\u1EE3n s\u00E1ch");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(61, 157, 245));
		textField_3.setBounds(52, 0, 96, 49);
		panel_3_1_1_1_1.add(textField_3);
		
		JPanel panel_3_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1_1_1.setBounds(10, 353, 180, 49);
		panel_1.add(panel_3_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setBorder(null);
		textField_4.setForeground(Color.WHITE);
		textField_4.setText("M\u01B0\u1EE3n s\u00E1ch");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(61, 157, 245));
		textField_4.setBounds(52, 0, 96, 49);
		panel_3_1_1_1_1_1.add(textField_4);
		
		JLabel lblIonLogo = new JLabel("");
		lblIonLogo.setBounds(10, 10, 27, 28);
		contentPane.add(lblIonLogo);
		lblIonLogo.setIcon(new ImageIcon(img_logo));
		setLocationRelativeTo(null);
	}
}
