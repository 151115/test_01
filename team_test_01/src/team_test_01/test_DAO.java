package team_test_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import team_test_01.test_DTO;

public class test_DAO {


	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; 
			String db_id = "hr"; 
			String db_pw = "hr"; 
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		catch (SQLException e) {	
			e.printStackTrace();
		}		
	}
	
	private void close() {

		try { 
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/////////////////////////////////////////
	
	public int join(test_DTO dto) {	

		int cnt=0;
		getConnection();
		
		try {

			String sql = "insert into member_test_01 values(?,?)"; // SQLException e
			psmt = conn.prepareStatement(sql); // sql 을 보내서 반환받음 
			psmt.setString(1, dto.getMemberId() ); 
			psmt.setString(2, dto.getMemberPw() ); 

			cnt = psmt.executeUpdate();

		}
		catch (SQLException e) { e.printStackTrace(); }
		finally { close(); }
		return cnt;
	}
	
	
	
	public int write_review(test_DTO dto) {
		
		int cnt=0;
		getConnection();
		
		try {

			String sql = "insert into Review_test_01 values(?,?,?)"; // SQLException e
			psmt = conn.prepareStatement(sql); // sql 을 보내서 반환받음 
			psmt.setString(1, dto.getMemberId() ); 
			psmt.setString(2, dto.getMemberPw() ); 
			psmt.setString(2, dto.getReview_text() ); 

			cnt = psmt.executeUpdate();

		}
		catch (SQLException e) { e.printStackTrace(); }
		finally { close(); }
		return cnt;
	}
	

	public test_DTO review(test_DTO dto) {
		
		getConnection();

		test_DTO set_dto =null;
		try {
			String sql = "select * from Review_test_01 "; // SQLException e
			psmt = conn.prepareStatement(sql); // sql 을 보내서 반환받음 
			
			rs =psmt.executeQuery();	//rs는 표형태로 존재
			
			if (rs.next() ) {
				System.out.println("리뷰 읽기 > ");
				set_dto = new test_DTO(rs.getString(1) , rs.getString(2), rs.getString(3) );				

			}
		}
		catch (SQLException e) { e.printStackTrace(); }
		finally { close(); }
		
		return set_dto;
	}
	
	
}
