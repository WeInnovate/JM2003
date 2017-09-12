package com.atuldwivedi.learn.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	static Connection con = null;
	
	public static Connection getConnection() throws SQLException{
		
		if(con == null || con.isClosed()){
			con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		}
		
		return con;
	}

}
