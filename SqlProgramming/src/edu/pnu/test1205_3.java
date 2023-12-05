package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 국가코드가 'KOR'인 도시 중 인구수가 많은 순서로 상위 10개만 표시하세요.
// HINT) order by limit

public class test1205_3 {
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
			ResultSet rs = st.executeQuery("select * from city where Countrycode = 'KOR' and city.population between 1000000 and 5000000 order by population desc ");

			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("name")+",\t");
				System.out.print(rs.getString("district")+",\t");
				System.out.print(rs.getString("population")+"\n");
			}
			rs.close();
			st.close();
			con.close(); 
		}catch(Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}
	}
}
