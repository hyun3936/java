package edu.pnu;

// 국가명 'South Korea'에서 사용되는 언어를 검색해서, language, isofficial, percentage를 아래의 방법으로 모두 출력하세요.
// Name = 'South Korea'
// 방법 1: select ... from countrylanguage cl where exists(...);
// 방법 2: select ... from countrylanguage c join ... on ...;
// 방법 3: select ... from country c, countrylanguage cl where ...;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test1205_4 {
	public static void main(String[] args) {

		Connection con = null;
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "tiger";

			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);

			PreparedStatement pt = con.prepareStatement("select cl.language, cl.isofficial, cl.percentage "
														+"from country c ,countrylanguage cl "
														+"where c.Code = cl.CountryCode "
														+"and c.Name = ? ");	
			pt.setString(1, "South Korea");
			
			ResultSet rs = pt.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getString("language") + "\t \t");
				System.out.print(rs.getString("isofficial") + "\t");
				System.out.print(rs.getString("percentage") + "\n");
			}
			rs.close();
			pt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}
	}
}
