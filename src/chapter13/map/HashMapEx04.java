package chapter13.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx04 {

	public static void main(String[] args) {
		
		Map<String, String>map = new HashMap<String, String>();
		
		//id:key  value:비번
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요!");
			System.out.println("아이디 : ");
			//Hello Soldesk
			String id = scan.nextLine();
			
			//입력한 아이디 존재 여부
		
			if(map.containsKey(id)) {
				//비밀번호 받기
				System.out.println("비밀번호: ");
				String pass=scan.nextLine();
				if(map.get(id).equals(pass)) {
					System.out.println("로그인 성공!!");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}
			
				//비밀번호만 다시 입력하는 코드 만들어보기
				
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			
		}
				
				
			
			
			
		}//while
		
		
	}//main
}//class
