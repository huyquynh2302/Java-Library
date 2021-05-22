import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class themDocGia extends JFrame {

	private JPanel contentPane;
	private JTextField txtMTh;
	private JTextField textField;
	private JTextField txtHTn;
	private JTextField txtGiiTnh;
	private JTextField txtNgySinh;
	private JTextField txtCmnd;
	private JTextField txtEmail;
	private JTextField txtSinThoi;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					themDocGia frame = new themDocGia();
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
	public themDocGia() {
		setTitle("Th\u00EAm \u0111\u1ED9c gi\u1EA3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 516, 419);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtMTh = new JTextField();
		txtMTh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMTh.setText("M\u00E3 th\u1EBB:");
		txtMTh.setHorizontalAlignment(SwingConstants.LEFT);
		txtMTh.setBounds(83, 21, 150, 32);
		panel.add(txtMTh);
		txtMTh.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(283, 21, 150, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		txtHTn = new JTextField();
		txtHTn.setText("H\u1ECD T\u00EAn:");
		txtHTn.setHorizontalAlignment(SwingConstants.LEFT);
		txtHTn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtHTn.setColumns(10);
		txtHTn.setBounds(83, 71, 150, 32);
		panel.add(txtHTn);
		
		txtGiiTnh = new JTextField();
		txtGiiTnh.setText("Gi\u1EDBi T\u00EDnh:");
		txtGiiTnh.setHorizontalAlignment(SwingConstants.LEFT);
		txtGiiTnh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtGiiTnh.setColumns(10);
		txtGiiTnh.setBounds(83, 121, 150, 32);
		panel.add(txtGiiTnh);
		
		txtNgySinh = new JTextField();
		txtNgySinh.setText("Ng\u00E0y Sinh:");
		txtNgySinh.setHorizontalAlignment(SwingConstants.LEFT);
		txtNgySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNgySinh.setColumns(10);
		txtNgySinh.setBounds(83, 171, 150, 32);
		panel.add(txtNgySinh);
		
		txtCmnd = new JTextField();
		txtCmnd.setText("L\u1EDBp:");
		txtCmnd.setHorizontalAlignment(SwingConstants.LEFT);
		txtCmnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtCmnd.setColumns(10);
		txtCmnd.setBounds(83, 221, 150, 32);
		panel.add(txtCmnd);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email:");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmail.setColumns(10);
		txtEmail.setBounds(83, 271, 150, 32);
		panel.add(txtEmail);
		
		txtSinThoi = new JTextField();
		txtSinThoi.setText("S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i:");
		txtSinThoi.setHorizontalAlignment(SwingConstants.LEFT);
		txtSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSinThoi.setColumns(10);
		txtSinThoi.setBounds(83, 321, 150, 32);
		panel.add(txtSinThoi);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(283, 71, 150, 32);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(283, 121, 150, 32);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(283, 171, 150, 32);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(283, 221, 150, 32);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(283, 271, 150, 32);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(283, 321, 150, 32);
		panel.add(textField_6);
		
		JButton btnNewButton = new JButton("Th\u00EAm m\u1EDBi");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(309, 374, 124, 32);
		panel.add(btnNewButton);
		btnNewButton.setBackground(new Color(61, 157, 245));
	}
}
