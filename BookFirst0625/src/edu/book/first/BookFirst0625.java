package edu.book.first;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookFirst0625 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try { Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb?useSSL=false&serverTimezone=Asia/Seoul", "root","1234");
			System.out.println("데이터베이스 접속 성공~!");
			stmt = conn.createStatement();
			int id = 0;
			
			stmt.executeUpdate("insert into book(id, title, publisher, author)"+
			"values(" +id++ +",'HarryPotter', '대한출판사', '김한국')");
			
			stmt.executeUpdate("insert into book(id, title, publisher, author)"+
					"values(" +id++ +",'The Lord of the Rings', 'Allen & Unwin', 'J.R.R. Tolkein')");
			stmt.executeUpdate("insert into book(id, title, publisher, author)"+
					"values(" +id++ +",'Pride and Prejudice', 'T.Egerton Kingdom', 'Jane Austen')");
			
			printTable(stmt);
			
			
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩 오류");
			System.out.println("드라이버 로딩오류="+e.toString());
		}catch(SQLException e) {
			System.out.println("DB 접속 오류 ="+e.toString());
		}

	}
	public static void printTable(Statement stmt) {
		ResultSet rs = null;
		System.out.printf("%4s|%-30s|%-30s|%-10s\n", 
	            "id","title", "publisher", "author");
		try {
			rs = stmt.executeQuery("select *from book");
			while(rs.next()) {
				System.out.printf("%4s | %-30s | %-30s | %-10s\n",
								rs.getString("id"),
								rs.getString("title"),
								rs.getString("publisher"),
								rs.getString("author"));
			}
		}catch(SQLException e) {
			System.out.println("SQL 실행 에러="+e.toString());
		}
	}

}
