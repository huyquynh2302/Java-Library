import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class QLDG1 extends JPanel {
	
	private Image img_search = new ImageIcon(QLDG1.class.getResource("icon/search.png")).getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
	private Image img_plus = new ImageIcon(QLDG1.class.getResource("icon/plus.png")).getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
	private Image img_search_client = new ImageIcon(QLDG1.class.getResource("icon/search-client.png")).getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
	private Image img_edit_property = new ImageIcon(QLDG1.class.getResource("icon/edit-property.png")).getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
	private Image img_trash = new ImageIcon(QLDG1.class.getResource("icon/trash.png")).getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
	
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public QLDG1() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 714, 521);
		
		textField = new JTextField();
		textField.setText("Từ khóa tìm kiếm");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField.setBounds(10, 23, 120, 30);
		add(textField);
		
		JComboBox comboBox = new JComboBox(new Object[]{});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mã số thẻ"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(139, 23, 86, 30);
		add(comboBox);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(new Color(61, 157, 245));
		panel1.setBounds(235, 23, 94, 30);
		add(panel1);
		
		textField_1 = new JTextField();
		textField_1.setText("Tìm kiếm");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(61, 157, 245));
		textField_1.setBounds(26, 0, 68, 30);
		panel1.add(textField_1);
		
		JLabel lblIconSearch = new JLabel("");
		lblIconSearch.setBounds(0, 1, 26, 30);
		panel1.add(lblIconSearch);
		lblIconSearch.setIcon(new ImageIcon(img_search));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(61, 157, 245));
		panel_1_1_1.setBounds(610, 23, 94, 30);
		add(panel_1_1_1);
		
		JLabel lblIconSearch_1_1_1 = new JLabel("");
		lblIconSearch_1_1_1.setBounds(0, 1, 26, 30);
		panel_1_1_1.add(lblIconSearch_1_1_1);
		lblIconSearch_1_1_1.setIcon(new ImageIcon(img_trash));
		
		JButton btnNewButton_2 = new JButton("Xóa");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(61, 157, 245));
		btnNewButton_2.setBounds(26, 1, 68, 30);
		panel_1_1_1.add(btnNewButton_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(61, 157, 245));
		panel_1_1.setBounds(506, 23, 94, 30);
		add(panel_1_1);
		
		JLabel lblIconSearch_1_1 = new JLabel("");
		lblIconSearch_1_1.setBounds(0, 1, 26, 30);
		panel_1_1.add(lblIconSearch_1_1);
		lblIconSearch_1_1.setIcon(new ImageIcon(img_edit_property));
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setForeground(Color.WHITE);
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSa.setBorder(null);
		btnSa.setBackground(new Color(61, 157, 245));
		btnSa.setBounds(26, 1, 68, 30);
		panel_1_1.add(btnSa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(61, 157, 245));
		panel_1.setBounds(396, 23, 100, 30);
		add(panel_1);
		
		JLabel lblIconSearch_1 = new JLabel("");
		lblIconSearch_1.setBounds(0, 1, 26, 30);
		panel_1.add(lblIconSearch_1);
		lblIconSearch_1.setIcon(new ImageIcon(img_plus));
		
		JButton btnNewButton = new JButton("Thêm mới");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(61, 157, 245));
		btnNewButton.setBounds(26, 1, 74, 30);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.BOLD, 17));
		scrollPane.setBorder(new LineBorder(Color.BLACK));
		scrollPane.setBounds(10, 115, 694, 267);
		add(scrollPane);
		
		table = new JTable();
		//scrollPane.setColumnHeaderView(table);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 134, 694, 377);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"S\u1ED1 TT", "M\u00E3 th\u1EBB", "H\u1ECD T\u00EAn", "Gi\u1EDBi t\u00EDnh", "Ng\u00E0y sinh", "L\u1EDBp", "Email", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i"
			}
		));
		scrollPane.setViewportView(table);

	}

}
