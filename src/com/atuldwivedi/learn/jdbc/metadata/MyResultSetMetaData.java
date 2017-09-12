package com.atuldwivedi.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.atuldwivedi.learn.jdbc.util.ConnectionFactory;

public class MyResultSetMetaData {

	public static void main(String[] args) {
		try {
//			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Connection con = ConnectionFactory.getConnection();
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM M2003_LOGIN");
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Table Name: "+rsmd.getTableName(1));
			System.out.println("Column Count: "+rsmd.getColumnCount());
			
//			System.out.println(rsmd.getColumnName(1));
//			System.out.println(rsmd.getColumnTypeName(1));
			
			System.out.println(rsmd.getColumnName(1)+"("+rsmd.getColumnTypeName(1)+")    "+rsmd.getColumnName(2)+"("+rsmd.getColumnTypeName(2)+")");
			
			while(rs.next()){
				System.out.println(rs.getString(1)+"    "+rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
