package edu.oracle.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleTwoEx {
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
		int updateCount = 0 ;
		Connection  conn  = null;
		String  url = "jdbc:oracle:thin:@localhost:1521:xe";
		String  userid = "madang";
		String  pwd = "madang" ;
		Statement  stmt = null;
		PreparedStatement pstmtCreate = null ;
		PreparedStatement pstmtInsert = null ;
		
		ResultSet  rs  = null ;
		String  createQuery =
			"create table student("
				+ "num number constraint student_num_PK  primary key ,"
				+ "name varchar2(20) not null ,"
				+ "major varchar2(15) not null)" ;
		//String  query = "insert into student(num , name, major) values(? , ?, ?)";
		String  query = "insert into student values(? , ?, ?)";
		
		try {
			conn =
				DriverManager.getConnection(url, userid, pwd);
			stmt = conn.createStatement() ;
			pstmtCreate = conn.prepareStatement(createQuery) ;
			pstmtInsert = conn.prepareStatement(query);
			
			//pstmtCreate.executeUpdate();
			
		}
		catch(SQLException e)
		{
			System.out.println(
				"error=" + e.toString());
			System.exit(0);
		}//end of catch(....)
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print(
	"메뉴 선택=> 1.입력  2.출력  3.종료 =");
			int x = sc.nextInt() ;
			
			if(x == 1)
			{
				System.out.print("순번:");
				int idNum =  sc.nextInt();
				sc.nextLine() ;
				
				System.out.print("이름:");
				String name = sc.nextLine();
				System.out.print("학과명:");
				String major =sc.nextLine();
				try{
					pstmtInsert.setInt(1, idNum);
					pstmtInsert.setString(2, name);
					pstmtInsert.setString(3, major);
					pstmtInsert.executeUpdate();
				}
				catch(SQLException  e)
				{  System.out.println(
						"error=" + e.toString());
				System.exit(0); }
			}//end of if(x==1)
			else if(x == 2)
			{
				try{
					rs = stmt.executeQuery(
						"SELECT * FROM student");
					while(rs.next())
					{
						System.out.println(
						rs.getInt("num") + ":" +
						rs.getString("name") + ":" +  
						rs.getString("major") );
					}
					rs.close() ;					
				}catch(SQLException  e){    }
			}//end of else if(x == 2)
			
			else if(x ==3)
				break;
		}//end of while(true)
		
		try {
			conn.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}


