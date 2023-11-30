package edu.pnu;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	
	public class test_countrylanguage {
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
				ResultSet rs = st.executeQuery("select CountryCode, Language, IsOfficial,Percentage from countrylanguage limit 10");
				
				while(rs.next()) {
					System.out.print(rs.getString("CountryCode")+",");
					System.out.print(rs.getString("Language")+",");
					System.out.print(rs.getString("IsOfficial")+",");
					System.out.print(rs.getString("Percentage")+"\n");
				}
				rs.close();
				st.close();
				con.close();	
			}catch (Exception e) {
				System.out.println("연결 실패 : " + e.getMessage()); 
			}
		}
	}
