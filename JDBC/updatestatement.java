package updatestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updatestatement {
	public static void main(String args[]) {
		Connection conn = null;	

		String url ="jdbc:postgresql://localhost:5432/test";  // �� �κ��� ������ �����ͺ��̽�
		String user = "postgres";  // sql���� ����
		String passwd="1234"; // sql ���� ������ ��й�ȣ(�ڽ��� ������ ��й�ȣ �Է�)
		
		ResultSet rs = null;
		Statement stmt = null;
		String sql = "update book set title='feel good' where bookid=50;";
		String sql_1 = "select bookid, title from book;";
		try{

			 //����̹� �ε�
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loading success");
			
			try{				
				//DB����
				conn = DriverManager.getConnection(url, user, passwd);
				System.out.println("connect success");
				
				stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				System.out.println("executeQuery success");
				rs = stmt.executeQuery(sql_1);
				while(rs.next()) {
					int Bookid=rs.getInt("bookid");
					String Title = rs.getString("title");		
					System.out.println("bookid : " + Bookid+"  title : " + Title);
				}

				System.out.println("executeQuery success");
				stmt.close();
				conn.close();

			}catch(SQLException e){
				System.out.println(e);
				System.out.println("db���ӿ���");
			}
			
		}catch(Exception e){
			System.out.println("Exception" + e);
		}
	}
}


