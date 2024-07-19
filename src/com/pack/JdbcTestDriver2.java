package com.pack;
 
import java.util.Scanner;
 
public class JdbcTestDriver2 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ISBNNumber");
		int isbn = Integer.parseInt(sc.nextLine());
		System.out.println("Enter book name:");
		String bookName = sc.nextLine();
		System.out.println("Enter category:");
		String category = sc.nextLine();
		System.out.println("Enter price:");
		int price = Integer.parseInt(sc.nextLine());
		if( JDBCInsertDemo.addBook(isbn,bookName,category,price) )
    	  System.out.println("Record is added");
		else
    	  System.out.println("Record not added");
		
		sc.close();
		
	}
 
}
;