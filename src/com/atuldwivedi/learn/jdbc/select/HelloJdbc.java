package com.atuldwivedi.learn.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM M2003_LOGIN");
			
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
