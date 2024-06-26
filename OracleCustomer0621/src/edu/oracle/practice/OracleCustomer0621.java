package edu.oracle.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleCustomer0621 {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로딩 성공");
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
		PreparedStatement pstmtInsert = null ;
		PreparedStatement pstmtSelect = null ;
		String insertQuery = "insert into customer values(? , ?, ?,?)";
		String query = "select * from customer where custid=?";
		ResultSet  rs  = null ;
		
		try {
			conn = DriverManager.getConnection(url,userid,pwd);
			stmt = conn.createStatement() ;
			System.out.println("오라클 데이터베이스 접속 성공");
			pstmtInsert = conn.prepareStatement(insertQuery) ;
			pstmtSelect = conn.prepareStatement(query);
			
		}catch(SQLException e) {
			System.out.println("오류메세지="+e.toString());
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택하세요:"+"\n"+
								"1. Customer 정보 입력"+"\n"+
								"2. 특정 Customer 검색"+"\n"+
								"3. 모든 Customer 검색"+"\n"+
								"4. 종료");
			int number = sc.nextInt();
			if(number == 1) {
				System.out.println("Custoer 정보를 입력:");
				System.out.print("ID: ");
				int idNum =  sc.nextInt();
				sc.nextLine() ;
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Address: ");
				String address = sc.nextLine();
				System.out.print("Phone: ");
				String phone = sc.nextLine();
				try{
					pstmtInsert.setInt(1, idNum);
					pstmtInsert.setString(2, name);
					pstmtInsert.setString(3, address);
					pstmtInsert.setString(4, phone);
					pstmtInsert.executeUpdate();
				}
				catch(SQLException  e){  
					System.out.println("오류메세지="+e.toString());
				}
			} else if(number == 2) {
				System.out.print("검색할 ID입력: ");
				int keyid = sc.nextInt();
				try{
					pstmtSelect.setInt(1, keyid);
					rs = pstmtSelect.executeQuery();
					while(rs.next())
					{
						System.out.println(
						rs.getInt(1) + "\t" +
						rs.getString(2) + "\t" +  
						rs.getString(3)+ "\t" +
						rs.getString(4));
					}
					rs.close() ;					
				}catch(SQLException  e){  
					System.out.println("오류메세지="+e.toString());
				}
				
				
			} else if (number == 3) {
				try{
					rs = pstmtSelect.executeQuery(
						"SELECT * FROM CUSTOMER");
					while(rs.next())
					{
						System.out.println(
						rs.getInt(1) + "\t" +
						rs.getString(2) + "\t" +  
						rs.getString(3)+ "\t" +
						rs.getString(4));
					}
					rs.close() ;					
				}catch(SQLException  e){  
					System.out.println("오류메세지="+e.toString());
				}
				
			}
		}

	}

}
