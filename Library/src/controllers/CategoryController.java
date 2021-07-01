package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.DBConnection;
import models.Student;
import models.Book;
import models.BookCategory;

public class CategoryController {
	static Connection conn = DBConnection.connect();
	
	
	public List<BookCategory> findAll() {
		//Connection conn = DBConnection.connect();
		List<BookCategory> categories = new ArrayList<BookCategory>();
		String sql = "SELECT *  FROM  book_categories;" ;
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next())
			{
				BookCategory category = new BookCategory(
					rs.getInt(1),
					rs.getString(2));
				categories.add(category);
			}
			rs.close();
//			conn.close();
			return categories;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	
		
	}
}
