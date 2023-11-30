package edu.pnu;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class city {
	
	private int id; 
	private String name; 
	private String countryCode;
	private String district;
	private String population;
	private int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
}






public class test3 {
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
			ResultSet rs = st.executeQuery("select * from city");
		
			
			while(rs.next()) {
				System.out.println(rs.getString("id")+"\t");
				System.out.println(rs.getString("name") + ",");
				System.out.println(rs.getString("district")+ "\n" );
				System.out.println(rs.getString("population")+"\n");
			}
			rs.close();
			st.close();
			con.close();
			
		}catch(Exception e) {
			System.out.println();
		}
	}
}
