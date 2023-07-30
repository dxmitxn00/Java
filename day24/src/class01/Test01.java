package class01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {
	public static void main(String[] args) {

		// JDBC의 4가지 순서

		// 1. JAVA와 DB를 연결해줄 자원(resource)을 가진
		//	클래스(==드라이버)를 메모리로 불러와야 함 == load(적재)
		//			ㄴ> 드라이버 : 서로 다른 시스템, 이종기기 간의 연결을 위해 필요한 객체
		// 위 드라이버들은 기본제공되는 클래스가 아님

		// 유지보수에 용이하기 위해 주소를 상수로 상단에 배치함
		final String driverName_MySQL = "com.mysql.cj.jdbc.Driver"; // mysql 주소
		final String driverName_Oracle = "oracle.jdbc.driver.OracleDriver"; // oracle 주소
		try {
			Class.forName(driverName_MySQL); 

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2. DB와 연결
		// 	: Connection 객체가 필요함
		String url_MySQL = "jdbc:mysql://localhost/tan";// mysql url
							// "jdbc:mysql://localhost/DB명" 
		String url_Oracle = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클 url
		String userName = "root";
		String passwd = "Lucete5381";
//		DriverManager.getConnection(url, userName, password);
		Connection conn = null; // 스코프 이슈
		try {
			conn = DriverManager.getConnection(url_MySQL, userName, passwd);
			// conn 객체는 DB와의 연결통로 역할
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3. DB에 데이터를 작성하거나(write),
		//	DB의 데이터를 받아오거나(read)할 수 있음
		//	: Statement 객체를 생성하고, 사용하는 것이 목표
		
		/*
		// ------ View 시작
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하세요.");
		String studentName = sc.next();
		System.out.println("학생의 점수를 입력하세요.");
		int studentScore = sc.nextInt();
		// ------ View 끝
		
		// ------ Controller 시작
		// Controller 입장 : "M의 DAO의 CRUD 메서드의 인자는 VO인데, 나도 VO로 주면 좋겟다,,"
		StudentVO sVO = new StudentVO(0, studentName, studentScore);
		// ------ Controller 끝
		*/

		/*
		final String sql_INSERT = "INSERT INTO STUDENT (NAME,SCORE) VALUES('"+ sVO.getName() +"',"+ sVO.getScore() +")";
		final String sql_UPDATE = "UPDATE STUDENT SET SCORE=0 WHERE NUM=1";
		final String sql_DELETE = "DELETE FROM STUDENT WHERE NUM=2"; // 주로 WHERE 뒤에는 pk를 입력함
		*/
		
		Statement stmt = null;
		ResultSet rs = null;
		final String sql_SELECTALL = "SELECT NUM,NAME,SCORE FROM STUDENT;";
		
		try {
			stmt = conn.createStatement();
//			stmt.executeUpdate(sql_UPDATE);
//			stmt.executeUpdate(sql_DELETE);
			// 메소드 executeQuery -> SELECT  --> output : ResultSet(rs) => 데이터값이 없다면 0사이즈로 나옴
			// 메소드 executeUpdate -> INSERT, UPDATE, DELETE  --> output : int => 데이터를 반환할 필요없어서
																				// 적용된 개수만 나옴

			rs = stmt.executeQuery(sql_SELECTALL);
			
			// 차례로 출력
			while(rs.next()) {
				// --- Controller 시작
				StudentVO sVO =new StudentVO(rs.getInt("NUM"), rs.getString("NAME"), rs.getInt("SCORE"));
				// --- Controller 끝
				
				// --- View 시작
				System.out.println(sVO);
				System.out.println();
				// --- View 끝
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// 4. DB와 연결 해제 !!!!! 중요함 !!!!!
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" 로그: 프로그램 종료");

	}
}
