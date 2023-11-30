package edu.pnu; // 국가 코드가 'KOR'인 도시를 찾아 인구수를 역순으로 표시하시오

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class code_kor {
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "tiger";
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from city where CountryCode = 'KOR' order by Population asc");
			
			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("name")+",");
				System.out.print(rs.getString("district")+",");
				System.out.print(rs.getString("population")+"\n");
			}
			rs.close();
			st.close();
			con.close();	
		}catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage()); 
		}
	}
}
