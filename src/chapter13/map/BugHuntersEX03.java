package chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//�ǽ� ���� , ȥ�� �غ��� , �����Բ��� ���ؼ� ����
public class BugHuntersEX03 {

	public static void main(String[] args) {
		
		Map<Integer, String> hunters = new HashMap<Integer, String>();
		
		hunters.put(1, "�����");
		hunters.put(2, "������");
		hunters.put(3, "���ڼ�");
		hunters.put(4, "�����");
		hunters.put(5, "������");
		System.out.println("�� ���� �� : "+ hunters.size()+"��");
		
		//ã��
		System.out.println("2�� ���� ã��: "+hunters.get(2));
		System.out.println();
		
		//���� ��� ���
		Set<Integer> member = hunters.keySet();
		
		Iterator<Integer> ir = member.iterator();
		System.out.println("===���������� ����===");
		while(ir.hasNext()) {
			Integer memberNum = ir.next();
			String memberName = hunters.get(memberNum);
			System.out.println("No."+memberNum + ", "+memberName);
		}
		System.out.println();
		
		
		//���� ��� ����
		hunters.clear();
		System.out.println("��ü ���� �� ���� ���� �� : "+hunters.size());
		
		
	}
}
