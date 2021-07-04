package controllers;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.DBConnection;
import models.Book;


public class BookController {
	static Connection conn = DBConnection.connect();
	public static String tableName = "books";
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

	public static List<Book> getAllBooks(){
		List<Book> books =  new ArrayList<Book>();
		
		String sql = "SELECT * FROM books";
		
		try {
			Statement stmt = conn.createStatement();
			
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
						rs.getString(8)
						);
				
				books.add(book);
				
			}
			
			stmt.close();

			System.out.println(books.get(1));
			return books;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static boolean addBook(int authorID, int cateID, int nxbID, int shelfID, String name, String year) {
		String sql = "INSERT INTO books (author_id, book_cate_id, publication_house_id, shelf_id, book_name, publication_year) values (" + authorID + " , "
				+ cateID + " , " + nxbID + " , " + shelfID + " , '"  + name + "' , " + year + ")";
		
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			
			return ps.executeUpdate() > 0;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static boolean editBook(String id, String authorID, String cateID, String nxbID, String shelfID, String name, String year) {
		String sql = "UPDATE books SET author_id = " + authorID + ", book_cate_id = " + cateID + ", publication_house_id = " + nxbID + ", shelf_id = " + shelfID + ", book_name = '" + name + "', publication_year = " + year 
				+ " WHERE id = " + id;
		
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			
			return ps.executeUpdate() > 0;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static boolean deleteBook(String id) {
		String sql = "DELETE FROM books WHERE id =" + id;
		
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			
			return ps.executeUpdate() > 0;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
