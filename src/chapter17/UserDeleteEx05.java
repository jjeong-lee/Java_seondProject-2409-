package chapter17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDeleteEx05 {
	
	public static void main(String[] args) {
		
	
	
	  Connection con = null;

      try {
         // 1. JDBC ����̹� �ε�
         Class.forName("oracle.jdbc.OracleDriver");

         // 2. Connection ���
         // ���Ṯ�ڿ�
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         // �����
         String user = "system";
         // ��й�ȣ
         String password = "12345";

         con = DriverManager.getConnection(url, user, password);

         // 3. �Ű� ����ȭ�� SQL �� �ۼ�
         String sql = "DELETE FROM userTBL WHERE userid = ?";

         // 4. PreparedStatement ��� �� �� ����
         PreparedStatement pstmt = con.prepareStatement(sql);
         pstmt.setString(1, "emily");

         // 5. SQL ���� ����
         int rows = pstmt.executeUpdate();
         System.out.println("������ user �� : " + rows);

         pstmt.close();

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
         }
      }
}
}
