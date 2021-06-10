package controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.*;

import models.DBConnection;

public class UserController {
	static Connection conn = DBConnection.connect();
	
	public UserController() {}
	
	public boolean checkUserToLogin(String username, String password)  {
       
    	String query = "SELECT * FROM Staff WHERE username = '" + username + "' AND password = '"+ password+"'"; 
        try {
        	//Connection conn = DBConnect.getConnection();
        	Statement stmt = conn.createStatement();
        	ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
              return true;
            }
            //conn.close();
        }catch(Exception e) {
            System.out.println(e);;
        }
        return false;
    }
	
	public boolean addUser (String username, String email, String password, String description) {
		String query = "INSERT INTO Staff (username, email, password, description) VALUES('"+username+"', '"+email+"','"+password+"', '"+description+"')";
		try {
			//Connection conn = DBConnect.getConnection();
			Statement stmt = conn.createStatement();
			int count = stmt.executeUpdate(query);
			
			//conn.close();
			if(count > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			 System.out.println(e);
			 //conn.close();
			 return false;
		}
	}
	
	public String checkUserToSignUp(String username, String email, String password, String description) {
		
		String querycheckExistUsername = "SELECT * FROM Staff WHERE username='"+ username+"' or email='" +email + "'";
		String errType1 = "EMPTY FIELD";
		String errType2 = "INVALID OR EXISTED EMAIL";
		String errType3 = "EXISTED EMAIL OR EXISTED USERNAME";
		
		if(((username.equals("")) || (email.equals("")) ) || (password.equals(""))) {
			return errType1;
		} else {
			try {
				//Connection conn = DBConnect.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(querycheckExistUsername);
				if(rs.next()) {
					return errType3;
				} else {
					if(!checkEmailValidation(email)) {
						return errType2;
					}
				}
				
				//conn.close();
			} catch (Exception ex) {
				System.out.print(ex);
			}
		}
		
		return "VALID USER";
		
	}
	
	public boolean checkEmailValidation(String email){
		Pattern VALID_EMAIL_ADDRESS_REGEX =  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
	}
}