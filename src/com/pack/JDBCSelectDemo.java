package com.pack;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
public class JDBCSelectDemo {
 
	public static void viewRecords(String category) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver")	; // load jdbc driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprojdbc","root","tiger");
			PreparedStatement smt = con.prepareStatement("select * from book where category=?"); // make sql Statement
			smt.setString(1, category);
			ResultSet rs = smt.executeQuery();
			while ( rs.next()) {
				System.out.printf("\n%5d %20s %20s %6d", rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				}
			}
		catch(Exception e){
			System.out.println(e.getMessage());
			}
	}
}