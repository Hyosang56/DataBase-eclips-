package edu.mysql.second;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlSecond0625 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try { Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?useSSL=false&serverTimezone=Asia/Seoul", "root","1234");
			System.out.println("데이터베이스 접속 성공~!");
			stmt = conn.createStatement();
//			stmt.executeUpdate("insert into student(name,id,dept) " +
//			"values('손흥민' , '12345','체육학과' )");
			printTable(stmt);
			
			System.out.println();
			System.out.println("최고봉 학생의 학과를 기계공학과로 수정후");
			stmt.executeUpdate("update student set dept='기계공학과' where name='최고봉'");
			printTable(stmt);
			
			System.out.println();
			System.out.println("이기자 학생을 삭제한 후");
			stmt.executeUpdate("delete from student where name='이기자' ");
			printTable(stmt);
			
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩 오류");
			System.out.println("드라이버 로딩오류="+e.toString());
		}catch(SQLException e) {
			System.out.println("DB 접속 오류 ="+e.toString());
		}

	}//end if main()
	
	public static void printTable(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from student");
		System.out.printf("name\t\t id\t\t dept\t \n");
		while(rs.next()) {
			System.out.print(rs.getString("name"));
			System.out.print("\t\t"+rs.getString("id"));
			System.out.println("\t\t"+rs.getString("dept"));
		}
	}
}
