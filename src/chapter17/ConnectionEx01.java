package chapter17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx01 {

	
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			// 1. JDBC ����̹� �ε�
            Class.forName("oracle.jdbc.OracleDriver");//����Ŭ ����̹�
            
            //2.Connection ���
            String url = "jdbc:oracle:thin:@localhost:1521:xe";//���� ���� ����
			String user = "system";// ������
			String password = "12345";// ���

			con = DriverManager.getConnection(url, user, password);

			System.out.println("����Ǿ����ϴ�.");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close(); // ���� ����
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//if
		}//finally

	}
}
