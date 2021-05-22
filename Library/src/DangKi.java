import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DangKi extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangKi frame = new DangKi();
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
	public DangKi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(124, 50, 574, 403);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("T\u1EA1o t\u00E0i kho\u1EA3n");
		btnNewButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		btnNewButton.setBounds(189, 302, 200, 30);
		panel.add(btnNewButton);
		
		JButton btnTrVng = new JButton("Tr\u1EDF v\u1EC1 \u0111\u0103ng nh\u1EADp");
		btnTrVng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTrVng.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		btnTrVng.setBounds(189, 361, 200, 30);
		panel.add(btnTrVng);
		
		textField = new JTextField();
		textField.setBounds(189, 147, 200, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 104, 200, 30);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(189, 187, 200, 30);
		panel.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(189, 62, 200, 30);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EAn t\u00E0i kho\u1EA3n");
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(46, 62, 121, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(46, 104, 121, 30);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("M\u1EADt kh\u1EA9u");
		lblNewLabel_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(46, 147, 121, 30);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ghi ch\u00FA");
		lblNewLabel_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(46, 187, 121, 30);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ch\u1EE9c v\u1EE5");
		lblNewLabel_1_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(46, 227, 121, 30);
		panel.add(lblNewLabel_1_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Staff"}));
		comboBox.setBounds(189, 227, 200, 30);
		panel.add(comboBox);
		
		lblNewLabel = new JLabel("T\u1EA1o t\u00E0i kho\u1EA3n m\u1EDBi");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblNewLabel.setBounds(316, 10, 163, 30);
		contentPane.add(lblNewLabel);
	}
}
