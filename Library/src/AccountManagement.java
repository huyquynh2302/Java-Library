import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;

public class AccountManagement extends JFrame {

	private Image img_logo = new ImageIcon(Main.class.getResource("icon/logo.png")).getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtAdmin;
	private JTextField txtMnSch;
	private JTextField txtQunLSch;
	private JTextField txtQunLc;
	private JTextField txtQunLMn;
	private JTextField txtQunLTi;
	private JTextField txtngK;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountManagement frame = new AccountManagement();
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
	public AccountManagement() {
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
		
		txtQunLSch = new JTextField();
		txtQunLSch.setBorder(null);
		txtQunLSch.setForeground(Color.WHITE);
		txtQunLSch.setText("Qu\u1EA3n l\u00FD s\u00E1ch");
		txtQunLSch.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtQunLSch.setColumns(10);
		txtQunLSch.setBackground(new Color(61, 157, 245));
		txtQunLSch.setBounds(40, 0, 108, 49);
		panel_3_1.add(txtQunLSch);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1.setBounds(10, 174, 180, 49);
		panel_1.add(panel_3_1_1);
		
		txtQunLc = new JTextField();
		txtQunLc.setBorder(null);
		txtQunLc.setForeground(Color.WHITE);
		txtQunLc.setText("Qu\u1EA3n l\u00FD \u0111\u1ED9c gi\u1EA3");
		txtQunLc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtQunLc.setColumns(10);
		txtQunLc.setBackground(new Color(61, 157, 245));
		txtQunLc.setBounds(31, 0, 129, 49);
		panel_3_1_1.add(txtQunLc);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1.setBounds(10, 234, 180, 49);
		panel_1.add(panel_3_1_1_1);
		
		txtQunLMn = new JTextField();
		txtQunLMn.setBorder(null);
		txtQunLMn.setForeground(Color.WHITE);
		txtQunLMn.setText("Qu\u1EA3n l\u00FD m\u01B0\u1EE3n tr\u1EA3");
		txtQunLMn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtQunLMn.setColumns(10);
		txtQunLMn.setBackground(new Color(61, 157, 245));
		txtQunLMn.setBounds(23, 0, 147, 49);
		panel_3_1_1_1.add(txtQunLMn);
		
		JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1_1.setBounds(10, 294, 180, 49);
		panel_1.add(panel_3_1_1_1_1);
		
		txtQunLTi = new JTextField();
		txtQunLTi.setBorder(null);
		txtQunLTi.setForeground(new Color(51, 0, 204));
		txtQunLTi.setText("Qu\u1EA3n l\u00FD t\u00E0i kho\u1EA3n");
		txtQunLTi.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtQunLTi.setColumns(10);
		txtQunLTi.setBackground(new Color(61, 157, 245));
		txtQunLTi.setBounds(30, 0, 140, 49);
		panel_3_1_1_1_1.add(txtQunLTi);
		
		JPanel panel_3_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1.setBackground(new Color(61, 157, 245));
		panel_3_1_1_1_1_1.setBounds(10, 353, 180, 49);
		panel_1.add(panel_3_1_1_1_1_1);
		
		txtngK = new JTextField();
		txtngK.setBorder(null);
		txtngK.setForeground(Color.WHITE);
		txtngK.setText("\u0110\u0103ng k\u00FD");
		txtngK.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtngK.setColumns(10);
		txtngK.setBackground(new Color(61, 157, 245));
		txtngK.setBounds(52, 0, 96, 49);
		panel_3_1_1_1_1_1.add(txtngK);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(229, 68, 559, 314);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"M\u00E3", "T\u00EAn t\u00E0i kho\u1EA3n", "Email", "Ghi ch\u00FA"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setBounds(36, 99, 482, 160);
		panel_4.add(table);
		
		JButton btnNewButton = new JButton("S\u1EEDa");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(205, 37, 100, 30);
		panel_4.add(btnNewButton);
		
		JButton btnXa = new JButton("X\u00F3a");
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnXa.setBounds(341, 37, 100, 30);
		panel_4.add(btnXa);
		
		JLabel lblIonLogo = new JLabel("");
		lblIonLogo.setBounds(10, 10, 27, 28);
		contentPane.add(lblIonLogo);
		lblIonLogo.setIcon(new ImageIcon(img_logo));
		setLocationRelativeTo(null);
}

