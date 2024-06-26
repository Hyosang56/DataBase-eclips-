package edu.mysql.first;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlFirst0625 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try { Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?useSSL=false&serverTimezone=Asia/Seoul", "root","1234");
			System.out.println("데이터베이스 접속 성공~!");
			stmt = conn.createStatement();
			ResultSet srs = stmt.executeQuery("select * from student");
			printData(srs, "name","id","dept");
			
			System.out.println();
			System.out.println("sql 구문에서 where 조건절을 이용한 레코드 검색");
			
			srs = stmt.executeQuery("select * from student where name ='이기자'");
			printData(srs, "name","id","dept");
			
			srs.close();
			stmt.close();
			conn.close();
			
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩 오류");
			System.out.println("드라이버 로딩오류="+e.toString());
		}catch(SQLException e) {
			System.out.println("DB 접속 오류 ="+e.toString());
		}

	}//end of main()
	public static void printData(ResultSet prec, 
			String col1, String col2, String col3 ) throws SQLException {
		System.out.printf("name\t id\t dept\t \n");

		while(prec.next()) {
			if(!col1.equals(""))
				System.out.printf("%s\t",prec.getString("name"));
			if(!col2.equals(""))
				System.out.printf("%s\t",prec.getString("id"));
			if(!col3.equals(""))
				System.out.printf("%s\t",prec.getString("dept"));
			
			System.out.println();
		}
	}

}
