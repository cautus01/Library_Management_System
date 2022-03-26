package postgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class postgreSQL {
	public static void main(String args[]){
		Connection conn = null;

		String url ="jdbc:postgresql://localhost:5432/test";  // 이 부분은 접속할 데이터베이스
		String user = "postgres";  // sql접속 계정
		String passwd="1234"; // sql 접속 계정의 비밀번호(자신이 변경한 비밀번호 입력)
	
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select memid, name from member;";
	
		try{
			//드라이버 로딩
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loading success");
			try{				
				//DB접속
				conn = DriverManager.getConnection(url, user, passwd);
				System.out.println("connect success");
			
				stmt = conn.createStatement();
				rs=stmt.executeQuery(sql);
				System.out.println(sql);
			
				while(rs.next()){
					int memid=rs.getInt("memid");
					String name=rs.getString("name");
					System.out.println("memid : " + memid + "  name : " + name);
				}
				rs.close();
				stmt.close();
				conn.close();
			}catch(SQLException e){
				System.out.println(e);
			}
		}catch(Exception e){
			System.out.println("Exception" + e);
		}
	}
}