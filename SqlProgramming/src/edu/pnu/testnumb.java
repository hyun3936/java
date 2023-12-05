package edu.pnu;

// 전화번호부 데이터베이스를 설계하고 입력/검색/수정
// 항목
// 아이디, 이름,주소,전화번호(휴대폰,직장번호,집번호), 이메일 주소, 구분
// id, name, address, mp, jp, hp, email, cate

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class testnumb {
	public static void main(String[] args) {

		Connection con = null;
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/numb";
			String username = "scott";
			String password = "tiger";

			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);

			PreparedStatement pt = con.prepareStatement("insert into numb (name,address,mp,jp,hp,email,cate ) values (?,?,?,?,?,?,?)");
													
//			pt.setString(1, "송지효","전소민");
//			pt.setString(2, "대구", "울산");
//			pt.setString(3, "001", "002");
//			pt.setString(4, "000","000");
//			pt.setString(5, "003","004");
//			pt.setString(6, "런닝@google.com", "런닝@daum.com");
//			pt.setString(7, "티비","티비");
			
			pt.setString(1, "송지효");
			pt.setString(2, "대구");
			pt.setString(3, "001");
			pt.setString(4, "000");
			pt.setString(5, "003");
			pt.setString(6, "런닝@google.com");
			pt.setString(7, "티비");
			
			pt.setString(1, "전소민");
			pt.setString(2, "울산");
			pt.setString(3, "002");
			pt.setString(4, "000");
			pt.setString(5, "003");
			pt.setString(6, "런닝@daum.com");
			pt.setString(7, "티비");
			
			pt.executeUpdate();
			pt.executeUpdate();
			pt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}
		System.out.println("끝!");
	}
}
