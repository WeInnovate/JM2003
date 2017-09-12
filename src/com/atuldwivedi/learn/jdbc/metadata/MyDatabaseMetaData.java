package com.atuldwivedi.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.atuldwivedi.learn.jdbc.util.ConnectionFactory;

public class MyDatabaseMetaData {

	public static void main(String[] args) {
		try {
//			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			
			Connection con = ConnectionFactory.getConnection();
			
			DatabaseMetaData dbmd = con.getMetaData();
			
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
			System.out.println(dbmd.getDriverMajorVersion());
			System.out.println(dbmd.getDriverMinorVersion());
			
			System.out.println(dbmd.getURL());
			System.out.println(dbmd.getUserName());
//			System.out.println(dbmd.);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
