package edu.book.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BookUpdate0625 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmtInsert = null ;
		PreparedStatement pstmtDelete = null ;
		PreparedStatement pstmtUpdate = null ;
		String insertQuery = "insert into book values(?,?,?,?)";
		String deleteQuery = "delete from book where id=?";
		String UpdateQuery = "update book set ?=? where ?=?";
		
		try { Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb?useSSL=false&serverTimezone=Asia/Seoul", "root","1234");
			System.out.println("데이터베이스 접속 성공~!");
			stmt = conn.createStatement();
			stmt.executeUpdate("select * from book");
			printTable(stmt);
			pstmtInsert = conn.prepareStatement(insertQuery) ;
			pstmtDelete = conn.prepareStatement(deleteQuery);
			
			
//			stmt.executeUpdate("delete from book where author='김한국'");
			
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩 오류");
			System.out.println("드라이버 로딩오류="+e.toString());
		}catch(SQLException e) {
			System.out.println("DB 접속 오류 ="+e.toString());
		}
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("추가(1), 삭제(2), 수정(3), 끝내기(4)>> ");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("ID>> ");
				int idNum = sc.nextInt();
				sc.nextLine();
				System.out.print("책이름>> ");
				String bookName = sc.nextLine();
				System.out.print("출판사>> ");
				String publisher = sc.nextLine();
				System.out.print("작가>> ");
				String author = sc.nextLine();
				try{
					pstmtInsert.setInt(1, idNum);
					pstmtInsert.setString(2, bookName);
					pstmtInsert.setString(3, publisher);
					pstmtInsert.setString(4, author);
					pstmtInsert.executeUpdate();
				}
				catch(SQLException  e){  
					System.out.println("오류메세지="+e.toString());
				}
			} else if (num == 2) {
				System.out.print("삭제할 ID입력: ");
				int keyid = sc.nextInt();
				try {
					pstmtDelete.setInt(1, keyid);
					printTable(stmt);
				} catch(SQLException e) {
					System.out.println("오류메세지="+e.toString());
				}
			} else if (num == 3) {
				System.out.println("수정할 속성 이름>> ");
				String str1 = sc.nextLine();
				System.out.println("수정할 속성의 현재값>> ");
				String str2 = sc.nextLine();
				System.out.println("수정할 속성의 새로운 값>> ");
				String str3 = sc.nextLine();
				try {
					pstmtUpdate.setString(1, str1);
					pstmtUpdate.setString(2, str3);
					pstmtUpdate.setString(3, str1);
					pstmtUpdate.setString(4, str2);
					printTable(stmt);
				}catch(SQLException  e){  
					System.out.println("오류메세지="+e.toString());
				}
			}
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
