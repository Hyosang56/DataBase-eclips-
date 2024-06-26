package edu.goodsinfo.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlGoodsTest0625 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try { Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?useSSL=false&serverTimezone=Asia/Seoul", "root","1234");
			System.out.println("데이터베이스 접속 성공~!");
			stmt = conn.createStatement();
			printTable(stmt);
			
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩 오류");
			System.out.println("드라이버 로딩오류="+e.toString());
		}catch(SQLException e) {
			System.out.println("DB 접속 오류 ="+e.toString());
		}

	}
	public static void printTable(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from goodsinfo");
		System.out.printf("code\t title\t\t writer\t price \n");
		while(rs.next()) {
			System.out.print(rs.getString("code")+"\t");
			System.out.print(rs.getString("title")+"\t");
			System.out.print(rs.getString("writer")+"\t");
			System.out.println(rs.getString("price"));
		}
	}

}
