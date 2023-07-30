package class01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		// JDBC의 4가지 순서

		// 1. JAVA와 DB를 연결해줄 자원(resource)을 가진
		//	클래스(==드라이버)를 메모리로 불러와야 함 == load(적재)
		//			ㄴ> 드라이버 : 서로 다른 시스템, 이종기기 간의 연결을 위해 필요한 객체
		// 위 드라이버들은 기본제공되는 클래스가 아님
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
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		int num = 0; // 입력받을 변수
		// ----- View 시작
		while(true) { // 입력 값 유효성 검사
			try {
				System.out.println("출력할 학생의 번호를 입력하세요.");
				num = sc.nextInt();
				break;
				
			} catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("정수로 입력하세요.");
			}
		}
		// ----- View 끝
		final String sql_SELECTONE = "SELECT NUM,NAME,SCORE FROM STUDENT WHERE NUM="+ num +";";

		try {
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql_SELECTONE);
			StudentVO sVO = null; // Controller
			while(rs.next()) {
				sVO = new StudentVO(rs.getInt("NUM"), rs.getString("NAME"), rs.getInt("SCORE"));
				System.out.println(sVO);
			}
			/*
			while(rs.next()) {
				if(rs.getInt("NUM") == num) { // 데이터 받은 rs의 pk와 입력받은 값이 같으면
					sVO =new StudentVO(rs.getInt("NUM"), rs.getString("NAME"), rs.getInt("SCORE"));					
					System.out.println(sVO);
				}
			}
			*/
			
			// ----- Controller 시작
			if(sVO == null) { // 입력받은 번호와 일치한 pk가 없으면
				System.out.println("없는 학생입니다!"); // View
			}
			System.out.println();
			// ----- Controller 끝


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
