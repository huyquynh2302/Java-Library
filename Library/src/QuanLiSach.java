import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class QuanLiSach extends JPanel {
	private JTable table;
	private JTable table_1;
	/**
	 * Create the panel.
	 */
	public QuanLiSach() {
		setBorder(null);
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 714, 521);
		
		JLabel lblNewLabel = new JLabel("Th\u00EAm th\u00EA\u0309 loa\u0323i");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(152, 25, 124, 39);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Th\u00EAm sa\u0301ch");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(489, 25, 124, 39);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("T\u00EAn th\u00EA\u0309 loa\u0323i");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 100, 107, 29);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 139, 107, 29);
		add(lblNewLabel_2_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(145, 105, 138, 20);
		add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 145, 138, 20);
		add(textField_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("T\u00EAn sa\u0301ch");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(394, 99, 107, 29);
		add(lblNewLabel_2_2);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(526, 105, 138, 20);
		add(textField_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("ISBN");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(394, 139, 107, 29);
		add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Th\u00EA\u0309 loa\u0323i");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1_1.setBounds(394, 183, 107, 29);
		add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("Ta\u0301c gia\u0309");
		lblNewLabel_2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2.setBounds(394, 223, 107, 29);
		add(lblNewLabel_2_2_1_2);
		
		JLabel lblNewLabel_2_2_1_3 = new JLabel("N\u0103m xu\u00E2\u0301t ba\u0309n");
		lblNewLabel_2_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1_3.setBounds(394, 263, 107, 29);
		add(lblNewLabel_2_2_1_3);
		
		JLabel lblNewLabel_2_2_1_4 = new JLabel("Vi\u0323 tri\u0301 k\u00EA\u0323 sa\u0301ch");
		lblNewLabel_2_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1_4.setBounds(394, 304, 107, 29);
		add(lblNewLabel_2_2_1_4);
		
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(526, 145, 138, 20);
		add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(526, 188, 138, 22);
		add(comboBox);
		
		JTextField textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(526, 229, 138, 20);
		add(textField_4);
		
		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(526, 269, 138, 20);
		add(textField_5);
		
		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(526, 310, 138, 20);
		add(textField_6);
		
		JButton btnNewButton = new JButton("Th\u00EAm");
		btnNewButton.setBounds(423, 363, 87, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xo\u0301a");
		btnNewButton_1.setBounds(617, 363, 87, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("S\u01B0\u0309a");
		btnNewButton_1_1.setBounds(520, 363, 87, 23);
		add(btnNewButton_1_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 391, 694, 120);
		add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Th\u00EA\u0309 loa\u0323i", null, panel, null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Sa\u0301ch", null, panel_1, null);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		panel_1.add(table_1);
	}

}
