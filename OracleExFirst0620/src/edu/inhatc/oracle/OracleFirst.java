package edu.inhatc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleFirst {
	
	Connection con = null;
	
	public OracleFirst() { //기본생성자
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang";
		String pwd = "madang";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로딩 성공");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url,userid,pwd);
			System.out.println("오라클 데이터베이스 접속 성공");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void sqlRun() {
		String query = "select * from Book";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("BOOKNO \t BOOKNAME \t PUBLISHER \t PRICE");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getInt(4)+"\t");
			}
			
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleFirst ob = new OracleFirst();
		ob.sqlRun();
	}

}
