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


public class BookController {
	static Connection conn = DBConnection.connect();
	
	public List<Book> findByCate(int id) {
		List<Book> books = new ArrayList<Book>();
		String sql = "SELECT *  FROM books WHERE book_cate_id =" + id ;
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next())
			{
				Book book = new Book(
					rs.getInt(1),
					rs.getInt(2),
					rs.getInt(3),
					rs.getInt(4),
					rs.getInt(5),
					rs.getString(6),
					rs.getString(7),
					rs.getString(8));
				books.add(book);
			}
			rs.close();
			return books;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	
		
	}
	
}
