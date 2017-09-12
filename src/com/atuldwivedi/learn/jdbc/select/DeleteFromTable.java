package com.atuldwivedi.learn.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteFromTable {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			Statement stmt = con.createStatement();

			int i = stmt.executeUpdate("DELETE FROM M2003_LOGIN WHERE USER_NAME = 'PQR'");
			
			if(i > 0){
				System.out.println("Record is DELETED successfully.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
