package chapter13.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx04 {

	public static void main(String[] args) {
		
		Map<String, String>map = new HashMap<String, String>();
		
		//id:key  value:���
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���!");
			System.out.println("���̵� : ");
			//Hello Soldesk
			String id = scan.nextLine();
			
			//�Է��� ���̵� ���� ����
		
			if(map.containsKey(id)) {
				//��й�ȣ �ޱ�
				System.out.println("��й�ȣ: ");
				String pass=scan.nextLine();
				if(map.get(id).equals(pass)) {
					System.out.println("�α��� ����!!");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					continue;
				}
			
				//��й�ȣ�� �ٽ� �Է��ϴ� �ڵ� ������
				
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�");
			
		}
				
				
			
			
			
		}//while
		
		
	}//main
}//class
