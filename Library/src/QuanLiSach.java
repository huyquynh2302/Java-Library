import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controllers.BookController;
import controllers.CategoryController;
import controllers.AuthorController;
import controllers.PublicationHouseController;
import models.Book;
import models.BookCategory;
import models.DBConnection;

import javax.swing.JScrollPane;


public class QuanLiSach extends JPanel {
	/**
	 * Create the panel.
	 */
	
	public BookController bookController;
	public CategoryController categoryController;
	public AuthorController authorController;
	public PublicationHouseController publicationHouseController;
	public int totalAttributeOfClass = 10;
	private JTable table;
	private JTable table_1;
	public List<BookCategory> listCate;
	
	public JComboBox<String> comboBox = new JComboBox<String>();
	private String currentCateID;
	private HashMap<String, String> categoriesMap = new HashMap<String, String>();
	private HashMap<String, String> categoriesMapRev = new HashMap<String, String>();
	private String currentAuthorID;
	private HashMap<String, String> authorsMap = new HashMap<String, String>();
	private HashMap<String, String> authorsMapRev = new HashMap<String, String>();
	private String currentNXBID;
	private HashMap<String, String> NXBsMap = new HashMap<String, String>();
	private HashMap<String, String> NXBsMapRev = new HashMap<String, String>();
	
	public JComboBox<String> comboBox_1_1_1 = new JComboBox<String>();
	private String currentShelfID;
	private HashMap<String, String> shelvesMap = new HashMap<String, String>();
	private HashMap<String, String> shelvesMapRev = new HashMap<String, String>();
	
	private String currentBookID;
	private JTextField textField_3;
	private JTextField textField_4;
	
	void loadBooks() {
		DefaultTableModel modelTableBook = (DefaultTableModel) table_1.getModel();
		
		modelTableBook.getDataVector().removeAllElements();
		modelTableBook.fireTableDataChanged();
		
		List<Book> listBook = bookController.getAllBooks();
		
		
		for (int i = 0; i < listBook.size(); i++) {
			Object rowData[] = new Object[this.totalAttributeOfClass];
			rowData[0] = listBook.get(i).getId();
			rowData[1] = listBook.get(i).getAuthorId();
			rowData[2] = listBook.get(i).getBookCateId();
			rowData[3] = listBook.get(i).getPublicationHouseId();
			rowData[4] = listBook.get(i).getShelfId();
			rowData[5] = listBook.get(i).getBookName();
			rowData[6] = listBook.get(i).getPublicationYear();
			rowData[7] = listBook.get(i).getStatus();
			
			modelTableBook.addRow(rowData);
		}
	}
	
	void loadCategories() {
		DefaultTableModel modelTableCate = (DefaultTableModel) table.getModel();
		
		modelTableCate.getDataVector().removeAllElements();
		modelTableCate.fireTableDataChanged();
		
		this.listCate = categoryController.getAllCategories();
		
		
		for (int i = 0; i < listCate.size(); i++) {
			Object rowData[] = new Object[this.totalAttributeOfClass];
			rowData[0] = listCate.get(i).getId();
			rowData[1] = listCate.get(i).getBookCateName();
			
			modelTableCate.addRow(rowData);
		}
		
	}

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
		lblNewLabel_2.setBounds(10, 74, 107, 29);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 113, 107, 29);
		add(lblNewLabel_2_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(145, 79, 138, 20);
		add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 119, 138, 20);
		textField_1.setEditable(false);
		add(textField_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("T\u00EAn sa\u0301ch");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(394, 74, 107, 29);
		add(lblNewLabel_2_2);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(489, 80, 175, 20);
		add(textField_2);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Danh mu\u0323c");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1_1.setBounds(394, 114, 107, 29);
		add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("Ta\u0301c gia\u0309");
		lblNewLabel_2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2.setBounds(394, 153, 107, 29);
		add(lblNewLabel_2_2_1_2);
		
		JLabel lblNewLabel_2_2_1_3 = new JLabel("N\u0103m xu\u00E2\u0301t ba\u0309n");
		lblNewLabel_2_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1_3.setBounds(394, 238, 107, 29);
		add(lblNewLabel_2_2_1_3);
		
		JLabel lblNewLabel_2_2_1_4 = new JLabel("S\u00F4\u0301 k\u00EA\u0323");
		lblNewLabel_2_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1_4.setBounds(394, 277, 55, 29);
		add(lblNewLabel_2_2_1_4);
		
		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(526, 245, 138, 20);
		add(textField_5);
		
		JButton btnNewButton = new JButton("Th\u00EAm");
		btnNewButton.setBounds(233, 316, 87, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() && textField_1.getText().isEmpty()) {
					if(textField_3.getText().isEmpty() || textField_4.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Chưa điền đầy đủ các trường");
					}
					else {
						System.out.print(textField_3.getText()+ "  " + textField_4.getText()+ "   ");
						int authorId;
						int houseId;
						if(authorController.getAuthorId(textField_3.getText()) ==- 1) {
							authorId = authorController.addAuthor(textField_3.getText());
							//authorId = authorController.getAuthorId(textField_3.getText());
							System.out.print(" author id: " + authorId);
						}
						else authorId = authorController.getAuthorId(textField_3.getText());
						
						if(publicationHouseController.getPublicationHouseId(textField_4.getText()) ==-1) {
							houseId = publicationHouseController.addPublicationHouse(textField_4.getText());
							//houseId = publicationHouseController.getPublicationHouseId(textField_4.getText());
							System.out.print( "nxb id: " + houseId);
						}
						else houseId = publicationHouseController.getPublicationHouseId(textField_4.getText());
						
						boolean success = bookController.addBook(authorId, Integer.parseInt(currentCateID)  , houseId, Integer.parseInt(currentShelfID), textField_2.getText(), textField_5.getText());
						if(success) {
							JOptionPane.showMessageDialog(null, "Thêm saìch thaÌnh công.");
							loadBooks();
						}
					}
				} else {
					boolean success = categoryController.addCate(textField.getText());
					if(success) {
						JOptionPane.showMessageDialog(null, "Thêm danh muòc thaÌnh công.");
						textField_1.setText("");
						textField.setText("");
						loadCategories();
					}
				}
			}
		});
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xo\u0301a");
		btnNewButton_1.setBounds(429, 316, 87, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() && textField_1.getText().isEmpty()) {
					boolean success = bookController.deleteBook(currentBookID);
					if(success) {
						JOptionPane.showMessageDialog(null, "Xoìa saìch thaÌnh công.");
						loadBooks();
					}
				} else {
					boolean success = categoryController.deleteCate(textField_1.getText());
					if(success) {
						JOptionPane.showMessageDialog(null, "Xoìa danh muòc thaÌnh công.");
						textField_1.setText("");
						textField.setText("");
						loadCategories();
					}
				}
			}
		});
		add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("S\u01B0\u0309a");
		btnNewButton_1_1.setBounds(330, 316, 87, 23);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() && textField_1.getText().isEmpty()) {
					boolean success = bookController.editBook(currentBookID, currentAuthorID, currentCateID, currentNXBID, currentShelfID, textField_2.getText(), textField_5.getText());
					if(success) {
						JOptionPane.showMessageDialog(null, "SýÒa saìch thaÌnh công.");
						loadBooks();
					}
				} else {
					boolean success = categoryController.editCate(textField_1.getText() ,textField.getText());
					if(success) {
						JOptionPane.showMessageDialog(null, "SýÒa danh muòc thaÌnh công.");
						textField_1.setText("");
						textField.setText("");
						loadCategories();
					}
				}
			}
		});
		add(btnNewButton_1_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 337, 694, 158);
		add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Danh mu\u0323c", null, scrollPane, null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "Tên danh muòc"
				}
			));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int selectedRow = table.getSelectedRow();
				
				textField_2.setText("");
			
				//textField_4.setText("");
				textField_5.setText("");
				//textField_6.setText("");

				textField_1.setText(table.getModel().getValueAt(selectedRow, 0).toString());
				textField.setText(table.getModel().getValueAt(selectedRow, 1).toString());
				
			}
		});
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("Sa\u0301ch", null, scrollPane_1, null);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "ID Taìc giaÒ", "ID Danh muòc", "ID NXB", "ID Kêò saìch", "Tên saìch", "Nãm xuâìt baÒn", "TiÌnh traòng"
				}
			));
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int selectedRow = table_1.getSelectedRow();
				
				textField_2.setText(table_1.getModel().getValueAt(selectedRow, 5).toString());
				//textField_3.setText(table_1.getModel().getValueAt(selectedRow, 2).toString());
				currentCateID = table_1.getModel().getValueAt(selectedRow, 2).toString();
				currentAuthorID =  table_1.getModel().getValueAt(selectedRow, 1).toString();
				currentNXBID = table_1.getModel().getValueAt(selectedRow, 3).toString();
				currentShelfID = table_1.getModel().getValueAt(selectedRow, 4).toString();
				currentBookID = table_1.getModel().getValueAt(selectedRow, 0).toString();
				comboBox.setSelectedItem(categoriesMap.get(currentCateID));
				comboBox_1_1_1.setSelectedItem(shelvesMap.get(currentShelfID));
				textField_3.setText( authorController.getAuthorNameById(table_1.getModel().getValueAt(selectedRow, 1).toString()));
				textField_4.setText( publicationHouseController.getHouseNameById(table_1.getModel().getValueAt(selectedRow, 3).toString()));
				textField_5.setText(table_1.getModel().getValueAt(selectedRow, 6).toString());
				textField_1.setText("");
				textField.setText("");
				
				
			}
		});
		scrollPane_1.setViewportView(table_1);
		
		
		comboBox.setBounds(489, 119, 175, 22);
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		       currentCateID = categoriesMapRev.get(comboBox.getSelectedItem());
		    }
		});
		add(comboBox);
		
		JLabel lblNewLabel_2_2_1_3_1 = new JLabel("Nha\u0300 xu\u00E2\u0301t ba\u0309n");
		lblNewLabel_2_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1_3_1.setBounds(394, 199, 93, 20);
		add(lblNewLabel_2_2_1_3_1);
		
		
		comboBox_1_1_1.setBounds(489, 282, 175, 22);
		comboBox_1_1_1.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
			       currentShelfID = shelvesMapRev.get(comboBox_1_1_1.getSelectedItem());
			       System.out.println(currentShelfID);
			    }
			});
		add(comboBox_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(489, 160, 175, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(489, 198, 175, 20);
		add(textField_4);
		

		
		
		loadBooks();
		loadCategories();
		loadComboBoxData(); //categories
//		loadAuthorsComboBoxData();
//		loadNXBsComboBoxData();
		loadShelvesComboBoxData();
	}
	
	void loadComboBoxData() {
		Connection conn = DBConnection.connect();
		
		try {
			Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from book_categories");
	    while(rs.next()){         
	    	categoriesMap.put(rs.getString(1), rs.getString(2));
	    	categoriesMapRev.put(rs.getString(2), rs.getString(1));
	    	comboBox.addItem(rs.getString(2));
	    }
	    }
	    catch(Exception e)
	    {
	        System.out.println("Error"+e);
	    }    
	}
	
//	void loadAuthorsComboBoxData() {
//		Connection conn = DBConnection.connect();
//		
//		try {
//			Statement stmt = conn.createStatement();
//		ResultSet rs= stmt.executeQuery("select * from authors");
//	    while(rs.next()){         
//	    	authorsMap.put(rs.getString(1), rs.getString(2));
//	    	authorsMapRev.put(rs.getString(2), rs.getString(1));
//	    	comboBox_1.addItem(rs.getString(2));
//	    }
//	    }
//	    catch(Exception e)
//	    {
//	        System.out.println("Error"+e);
//	    }    
//	}
	
//	void loadNXBsComboBoxData() {
//		Connection conn = DBConnection.connect();
//		
//		try {
//			Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery("select * from publication_house");
//	    while(rs.next()){         
//	    	NXBsMap.put(rs.getString(1), rs.getString(2));
//	    	NXBsMapRev.put(rs.getString(2), rs.getString(1));
//	    	comboBox_1_1.addItem(rs.getString(2));
//	    }
//	    }
//	    catch(Exception e)
//	    {
//	        System.out.println("Error"+e);
//	    }    
//	}
	
	void loadShelvesComboBoxData() {
		Connection conn = DBConnection.connect();
		
		try {
			Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from shelves");
	    while(rs.next()){         
	    	shelvesMap.put(rs.getString(1), rs.getString(2));
	    	shelvesMapRev.put(rs.getString(2), rs.getString(1));
	    	comboBox_1_1_1.addItem(rs.getString(2));
	    }
	    }
	    catch(Exception e)
	    {
	        System.out.println("Error"+e);
	    }    
	}
}
