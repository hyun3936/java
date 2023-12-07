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

			// 입력
//			PreparedStatement pt = con.prepareStatement("insert into numb (name,address,mp,jp,hp,email,cate ) values (?,?,?,?,?,?,?)");
													

//			pt.setString(1, "송지효");
//			pt.setString(2, "대구");
//			pt.setString(3, "001");
//			pt.setString(4, "000");
//			pt.setString(5, "003");
//			pt.setString(6, "런닝@google.com");
//			pt.setString(7, "티비");
			
//			pt.executeUpdate();
			
		
			
//			PreparedStatement pt = con.prepareStatement("select id, name, address, mp, jp, hp, email, cate "
//														+"from numb "
//					  									+"where name = ? ");
			
			
//		    검색 할때
//			pt.setString(1, "송지효");
//			
//			ResultSet rs = pt.executeQuery();
//			
//			while(rs.next()) {
//				System.out.print(rs.getInt("id")+","); // id는 int니까 getInt
//				System.out.print(rs.getString("name")+",");
//				System.out.print(rs.getString("address")+",");
//				System.out.print(rs.getString("mp")+",");
//				System.out.print(rs.getString("jp")+",");
//				System.out.print(rs.getString("hp")+",");
//				System.out.print(rs.getString("email")+",");
//				System.out.print(rs.getString("cate")+"\n");
//			}
			
			
			
			
			//rs.close();
			
//			PreparedStatement pt = con.prepareStatement("delete id, name, address, mp, jp, hp, email, cate "
//														+"from numb "
//														+"where id = ?");
//		
//			
//			pt.setInt(1, 6);
//			pt.executeUpdate();
//			
			
			// 수정
			PreparedStatement pt = con.prepareStatement("update into numb (name,address,mp,jp,hp,email,cate ) values (?,?,?,?,?,?,?)");


			pt.setInt(1, 6);
			ResultSet rs = pt.executeQuery();
			
			while(rs.next()) {
			System.out.print(rs.getInt("id")+","); // id는 int니까 getInt
			System.out.print(rs.getString("name")+",");
			System.out.print(rs.getString("address")+",");
			System.out.print(rs.getString("mp")+",");
			System.out.print(rs.getString("jp")+",");
			System.out.print(rs.getString("hp")+",");
			System.out.print(rs.getString("email")+",");
			System.out.print(rs.getString("cate")+"\n");
		}
		
			pt.setString(1, "유재석");
			pt.setString(2, "서초");
			pt.setString(3, "999");
			pt.setString(4, "888");
			pt.setString(5, "777");
			pt.setString(6, "런닝@run.com");
			pt.setString(7, "mbc");
			
			
			
			
			
			
			pt.executeUpdate();
			

			
			pt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}
		System.out.println("끝!");
	}
}
