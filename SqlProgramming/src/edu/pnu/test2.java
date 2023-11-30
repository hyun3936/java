package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test2{
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "triger";
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select Code");
			
			while(rs.next()) {
				System.out.println(rs.getString("Code")+",");
				
			}
			rs.close();
			st.close();
			con.close();
			
			
			
		} catch (Exception e) {
			System.out.println("dd");
			// TODO: handle exception
		}
	}
}