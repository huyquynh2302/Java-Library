
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controllers.BookController;
import models.Book;
import models.DBConnection;

public class TimKiemDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			TimKiemDialog dialog = new TimKiemDialog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	void searchBook(String keyword) {
		String sql = "SELECT * FROM books WHERE book_name LIKE '%" + keyword + "%'";
		
		HashMap<String, String> results = new HashMap<String, String>();
		
		DefaultTableModel modelTableBook = (DefaultTableModel) table.getModel();
		
		modelTableBook.getDataVector().removeAllElements();
		modelTableBook.fireTableDataChanged();
		
		Connection conn = DBConnection.connect();
		
		try {
			Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
	    while(rs.next()){         
	    	results.put(rs.getString(1), rs.getString(6));
	    }
	    }
	    catch(Exception e)
	    {
	        System.out.println("Error"+e);
	    }    
		
		for (int i = 0; i < results.size(); i++) {
			
			
			
			
			
		}
		
		for (Map.Entry<String, String> entry : results.entrySet()) {
			Object rowData[] = new Object[2];
			
		    String id = entry.getKey();
		    Object name = entry.getValue();
		    
		    rowData[0] = id;
			rowData[1] = name;
		    modelTableBook.addRow(rowData);
		}
	}
	
	
	public TimKiemDialog() {
		setTitle("Ti\u0300m ki\u00EA\u0301m sa\u0301ch");
		setBounds(100, 100, 513, 360);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u01B0\u0300 kho\u0301a");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(133, 26, 50, 17);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(222, 26, 163, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"ID", "Tên saìch"
			}
		));
		table.setBounds(10, 127, 477, 184);
		contentPanel.add(table);
		
		JLabel lblNewLabel_3 = new JLabel("K\u00EA\u0301t qua\u0309 ti\u0300m ki\u00EA\u0301m");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 99, 105, 17);
		contentPanel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Ti\u0300m");
		btnNewButton.setBounds(298, 57, 87, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchBook(textField.getText());
			}
		});
		contentPanel.add(btnNewButton);
	}
}
