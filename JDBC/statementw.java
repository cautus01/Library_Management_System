package statementw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class statementw {
	public static void main(String args[]) {
		Connection conn = null;	

		String url = "jdbc:postgresql://localhost:5432/test";
		String user = "postgres";
		String passwd="1234";
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		String sql = "select memid, name from member where memid > 3;";
		
		try{

			 //드라이버 로딩
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loading success");
			
			try{				
				//DB접속
				conn = DriverManager.getConnection(url, user, passwd);
				System.out.println("connect success");
				
				pstmt = conn.prepareStatement(sql);
				//pstmt.setInt(1, 1);
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					int memid = rs.getInt("memid");               
					String name = rs.getString("name");
					System.out.println("memid : " + memid +"  name : " + name );
				}
				
				System.out.println("executeQuery success");
				
				pstmt.close();
				conn.close();

			}catch(SQLException e){
				System.out.println(e);
				System.out.println("db접속에러");
			}
			
		}catch(Exception e){
			System.out.println("Exception" + e);
		}
	}
}


