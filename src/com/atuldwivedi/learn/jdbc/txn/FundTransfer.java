package com.atuldwivedi.learn.jdbc.txn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.atuldwivedi.learn.jdbc.util.ConnectionFactory;

public class FundTransfer {

	static Connection con;
	public static void main(String[] args) {
		try {
			// CREATE TABLE JM2003_ACCOUNT (USER_NAME VARCHAR, AMOUNT DECIMAL);
			// INSERT INTO JM2003_ACCOUNT VALUES ('Siaram', 1000.10);
			// Connection con = DriverManager.getConnection("jdbc:h2:~/test",
			// "sa", "");
			String siaramSql = "UPDATE JM2003_ACCOUNT SET AMOUNT = AMOUNT - ?  WHERE USER_NAME = ?";
			String dheerajSql = "UPDATE JM2003_ACCOUNT SET AMOUNT = AMOUNT + ?  WHERE USER_NAME = ?";
			con = ConnectionFactory.getConnection();
			
			con.setAutoCommit(false);

			PreparedStatement siaramPstmt = con.prepareStatement(siaramSql);
			
			siaramPstmt.setDouble(1, 100.0);
			siaramPstmt.setString(2, "Siaram");
			
			int siaramUpd = siaramPstmt.executeUpdate();
			
			if(siaramUpd > 0){
				System.out.println("- Amount has been deducted from Siaram's account.");
//				int j = 10/0;
			}
			
			
			PreparedStatement dheerajPstmt = con.prepareStatement(dheerajSql);
			
			dheerajPstmt.setDouble(1, 100.0);
			dheerajPstmt.setString(2, "Dheeraj");
			
			int dheerajUpd = dheerajPstmt.executeUpdate();
			
			if(dheerajUpd > 0){
				System.out.println("+ Amount has been added to Dheeraj's account.");
			}
			
			con.commit();
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2003_ACCOUNT");
			
			while(rs.next()){
				System.out.println(rs.getString(1)+"   	"+rs.getDouble(2));
			}

		} catch (Exception e) {
			System.out.println("Catch block is running...");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block is running...");
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
