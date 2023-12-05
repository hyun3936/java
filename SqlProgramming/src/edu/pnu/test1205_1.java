package edu.pnu;
// 국가코드가 'KOR'이면서 인구가 100만 이상인 도시를 찾으세요 hint) and
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test1205_1 {
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
			ResultSet rs = st.executeQuery("select *  from city where Countrycode = 'KOR' and population >= 1000000 order by Population asc ");
			
			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("name")+",\t");
				System.out.print(rs.getString("district")+",\t");
				System.out.print(rs.getString("population")+"\n");
			}
			rs.close();
			st.close();
			con.close();
			
		}catch(Exception e){
			System.out.println("연결 실패 : " + e.getMessage());			
		}
	}	
}
