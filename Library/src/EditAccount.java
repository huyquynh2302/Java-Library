import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class EditAccount extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditAccount frame = new EditAccount();
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
	public EditAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton btnLuTiKhon = new JButton("L\u01B0u t\u00E0i kho\u1EA3n");
		btnLuTiKhon.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		btnLuTiKhon.setBounds(189, 302, 200, 30);
		panel.add(btnLuTiKhon);
		
		JButton btnTrVQun = new JButton("Tr\u1EDF v\u1EC1 qu\u1EA3n l\u00FD t\u00E0i kho\u1EA3n");
		btnTrVQun.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		btnTrVQun.setBounds(174, 361, 231, 30);
		panel.add(btnTrVQun);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(189, 147, 200, 30);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 104, 200, 30);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(189, 187, 200, 30);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(189, 62, 200, 30);
		panel.add(textField_3);
		
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
		comboBox.setBounds(189, 227, 200, 30);
		panel.add(comboBox);
	}

}
