package com.pack;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
public class JDBCInsertDemo {
 
	public static boolean addBook(int isbnNo, String bookName, String category, int price) {
    	boolean result=false;
		try{
		Class.forName("com.mysql.cj.jdbc.Driver")	; // load jdbc driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprojdbc","root","tiger");
		PreparedStatement smt = con.prepareStatement("insert into book values (?,?,?,?)"); // make sql Statement
		smt.setInt(1,isbnNo);  
		smt.setString(2, bookName); 
		smt.setString(3, category); 
		smt.setInt(4, price);
		int res = smt.executeUpdate();
		if(res>0)
		   result= true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());		}
		return result;
	}
}