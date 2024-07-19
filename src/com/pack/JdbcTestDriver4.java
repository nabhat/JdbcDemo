package com.pack;
 
import java.util.Scanner;
 
public class JdbcTestDriver4 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ISBNNumber to search:");
		int isbn = Integer.parseInt(sc.nextLine());
		System.out.println("Enter new book name:");
		String bookName = sc.nextLine();
		System.out.println("Enter updated price:");
		int price = Integer.parseInt(sc.nextLine());
		if( JDBCUpdateDemo.editRecords(isbn,bookName,price) )
    	  System.out.println("Record is updated");
        else
    	  System.out.println("Record not edited");
		sc.close();
	}
 
}
;