package com.atuldwivedi.learn.jdbc.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingStatementAndBatch {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			Statement stmt = con.createStatement();
			
			Scanner scan = new Scanner(System.in);
			String choice = "";
			
			do {
				System.out.print("Enter user name: ");
				String un = scan.nextLine();
				
				System.out.print("Enter password: ");
				String p = scan.nextLine();
				
				stmt.addBatch("INSERT INTO M2003_LOGIN VALUES('"+un+"', '"+p+"')");

				
				System.out.print("Do you want to continue(Y/N): ");
				choice = scan.nextLine();
				
			} while (choice.equalsIgnoreCase("Y"));
			
			int[] arr = stmt.executeBatch();
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
