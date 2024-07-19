package com.pack;
 
import java.util.Scanner;
 
public class JdbcTestDriver3 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter category to search:");
		String category = sc.nextLine();
		JDBCSelectDemo.viewRecords(category);
		
		sc.close();
	}
 
}
;