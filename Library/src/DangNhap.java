import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField txtTnngNhp;
	private JTextField txtMtKhu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap frame = new DangNhap();
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
	public DangNhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(192, 56, 425, 346);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtTnngNhp = new JTextField();
		txtTnngNhp.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		txtTnngNhp.setText("T\u00EAn t\u00E0i kho\u1EA3n");
		txtTnngNhp.setBounds(111, 114, 200, 30);
		panel.add(txtTnngNhp);
		txtTnngNhp.setColumns(10);
		
		txtMtKhu = new JTextField();
		txtMtKhu.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		txtMtKhu.setText("M\u1EADt kh\u1EA9u");
		txtMtKhu.setColumns(10);
		txtMtKhu.setBounds(111, 159, 200, 30);
		panel.add(txtMtKhu);
		
		JButton btnNewButton = new JButton("\u0110\u0103ng nh\u1EADp");
		btnNewButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(111, 221, 200, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0110\u0103ng k\u00FD");
		btnNewButton_1.setForeground(new Color(153, 153, 153));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		btnNewButton_1.setBounds(111, 306, 200, 30);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Ch\u01B0a c\u00F3 t\u00E0i kho\u1EA3n?");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		lblNewLabel.setBounds(132, 261, 164, 30);
		panel.add(lblNewLabel);
	}
}
