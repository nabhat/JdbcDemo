package com.pack;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
public class JDBCUpdateDemo {
 
	public static boolean editRecords(int isbn, String bookName, int price) {
		boolean result =false;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver")	; // load jdbc driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprojdbc","root","tiger");
		PreparedStatement smt = con.prepareStatement("update book set bookname=? , price=?  where isbnno=?"); // make sql Statement
		smt.setString(1, bookName);
		smt.setInt(2, price);
		smt.setInt(3, isbn);
		int rs = smt.executeUpdate();
		if(rs>0)
			result = true;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return result;
	}
}