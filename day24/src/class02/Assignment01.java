package class02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {

		// 크롤링한 데이터 배열리스트에 넣기
		ArrayList<FilmVO> datas = Crawling.sample();

		// 드라이버 적재
		final String driverName_MySQL = "com.mysql.cj.jdbc.Driver"; 
		try {
			Class.forName(driverName_MySQL);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// DB 연결
		final String url_MySQL = "jdbc:mysql://localhost/film";
		String userName = "root";
		String passwd = "Lucete5381";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url_MySQL, userName, passwd);


			// 웹 크롤링한 데이터 DB에 작성
			Statement stmt = null;
			ResultSet rs = null;
			int num;
			String name;
			String odate;

			stmt = conn.createStatement();
			
			for(int i=0; i<datas.size(); i++) {

				String sql_INSERT = "INSERT INTO FILM (NUM,NAME,DATE) VALUES("
						+ datas.get(i).num +",'"+ datas.get(i).name +"','"+ datas.get(i).odate +"');";

				stmt.executeUpdate(sql_INSERT);
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("출력할 영화 번호 입력 (1001 ~ 1019 중에 입력)");
			System.out.print("입력 ) ");
			int inputNum = sc.nextInt();
			final String sql_SELECTONE = "SELECT NUM, NAME, DATE FROM FILM WHERE NUM="+ inputNum +";";
			rs = stmt.executeQuery(sql_SELECTONE);

			if(rs.next()) {
				FilmVO fVO = new FilmVO(rs.getInt("NUM"), rs.getString("NAME"), rs.getString("DATE"));
				System.out.println(fVO);
			}
			else {
				System.out.println("해당 영화가 존재하지 않음");
			}
			
			/* [ SELECTALL ]
			final String sql_SELECTALL = "SELECT NUM, NAME, DATE FROM FILM;";
			rs = stmt.executeQuery(sql_SELECTALL);

			while(rs.next()) {
				FilmVO fVO = new FilmVO(rs.getInt("NUM"), rs.getString("NAME"), rs.getString("DATE"));

				System.out.println(fVO);
			}
			*/

			stmt.close();
			rs.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}