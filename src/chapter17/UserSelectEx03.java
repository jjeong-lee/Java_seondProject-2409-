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
	         // 1. JDBC 드라이버 로드
	         Class.forName("oracle.jdbc.OracleDriver");

	         // 2. Connection 얻기
	         // 연결문자열
	         String url = "jdbc:oracle:thin:@localhost:1521:xe";
	         // 사용자
	         String user = "system";
	         // 비밀번호
	         String password = "12345";

	         con = DriverManager.getConnection(url, user, password);

	         // 3. 매개 변수화된 SQL 문 작성
	         String sql = "SELECT userid, name, password, age, email FROM usertbl WHERE userid=?"; //필드는 대소문자까지 정확해야함
	         //"SELECT * FROM usertbl WHERE userid=?"으로 해도됨.
	         
	         // 4. PreparedStatement 얻기 및 값 지정
	         PreparedStatement pstmt = con.prepareStatement(sql); //sql형변환
	         pstmt.setString(1, "eunjeong");

	         // 5. SQL 구문 실행
	         ResultSet rs = pstmt.executeQuery();  //자바에서 hasnext로 받아오던 것과 똑같다.
	         if (rs.next()) {
	            UserDTO userDto = new UserDTO();
	            userDto.setUserid(rs.getString("userid"));
	            userDto.setName(rs.getString("name"));
	            userDto.setPassword(rs.getString("password"));
	            userDto.setAge(rs.getInt("age"));
	            userDto.setEmail(rs.getString("email"));

	            System.out.println(userDto);
	         } else {
	            System.out.println("사용자 아이디가 존재하지 않음");
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
	               con.close(); // 연결 종료
	            } catch (SQLException e) {
	               e.printStackTrace();
	            }
	         }
	      }
	}
}
