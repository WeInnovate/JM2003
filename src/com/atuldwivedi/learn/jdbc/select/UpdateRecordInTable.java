package com.atuldwivedi.learn.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecordInTable {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			Statement stmt = con.createStatement();

			int i = stmt.executeUpdate("UPDATE M2003_LOGIN SET USER_NAME ='JKL'  WHERE PASSWORD = '123'");
			
			if(i > 0){
				System.out.println("Record is UPDATED successfully.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
