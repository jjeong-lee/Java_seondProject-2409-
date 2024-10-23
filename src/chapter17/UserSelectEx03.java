package chapter17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectEx03 {

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
	         String sql = "SELECT userid, name, password, age, email FROM usertbl WHERE userid=?"; //�ʵ�� ��ҹ��ڱ��� ��Ȯ�ؾ���
	         //"SELECT * FROM usertbl WHERE userid=?"���� �ص���.
	         
	         // 4. PreparedStatement ��� �� �� ����
	         PreparedStatement pstmt = con.prepareStatement(sql); //sql����ȯ
	         pstmt.setString(1, "eunjeong");

	         // 5. SQL ���� ����
	         ResultSet rs = pstmt.executeQuery();  //�ڹٿ��� hasnext�� �޾ƿ��� �Ͱ� �Ȱ���.
	         if (rs.next()) {
	            UserDTO userDto = new UserDTO();
	            userDto.setUserid(rs.getString("userid"));
	            userDto.setName(rs.getString("name"));
	            userDto.setPassword(rs.getString("password"));
	            userDto.setAge(rs.getInt("age"));
	            userDto.setEmail(rs.getString("email"));

	            System.out.println(userDto);
	         } else {
	            System.out.println("����� ���̵� �������� ����");
	         }

	         rs.close();
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
