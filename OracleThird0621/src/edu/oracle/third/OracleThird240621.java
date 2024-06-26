

package edu.oracle.third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleThird240621 {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException  e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection  conn  = null;
		String  url = "jdbc:oracle:thin:@localhost:1521:xe";
		String  userid = "madang";
		String  pwd = "madang" ;
		Statement  stmt = null;
		PreparedStatement pstmt = null ;
		String query = "select * from zipcode where dong like ?";
		
		try {
			conn = DriverManager.getConnection(url, userid, pwd);
			pstmt = conn.prepareStatement(query);		
		}
		catch(SQLException e) {
			System.out.println("에러 메세지="+e.toString());
		}
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 동이름 입력=");
			String keydong = sc.nextLine();
			try {
				pstmt.setString(1,"%"+ keydong +"%");
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.println(
							rs.getInt(1)+ ":"+
							rs.getString(2)+ ":"+
							rs.getString(3)+ ":"+
							rs.getString(4)+ ":"+
							rs.getString(5)+ ":"+
							rs.getString(6)+ ":"+
							rs.getString(7)+ ":");
				}
				rs.close();
			}
			catch(SQLException e) {
				System.out.println("오류메세지="+e.toString());
			}
		}
	}

}
