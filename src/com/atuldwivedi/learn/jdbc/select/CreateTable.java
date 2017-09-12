package com.atuldwivedi.learn.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			Statement stmt = con.createStatement();

			boolean b = stmt
					.execute("CREATE TABLE JM2003_USER_2 (NAME VARCHAR, MOBILE VARCHAR, AGE NUMBER, SALARY DECIMAL)");
			if (!b) {
				System.out.println("Table creation successfull.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
