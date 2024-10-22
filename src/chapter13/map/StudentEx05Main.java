package chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentEx05Main {

	public static void main(String[] args) {
		
		//�л�����, ����
		Map<Student, Integer>map = new HashMap<Student, Integer>();
		
		//�ߺ�X
		map.put(new Student(1, "�̼���"), 95);
		map.put(new Student(1, "�̼���"), 95);
		
		map.put(new Student(2, "�����"), 85);
		map.put(new Student(3, "������"), 98);
		
		System.out.println("�� �ο�: "+ map.size()+"��");
		
		
		//��ȯ������ ó��
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		
		//Iterator<Student> keyIt = map.keySet().iterator();  �������� �������� ���� ���� �ڵ带 ���°��� ����.
		
		while(keyIterator.hasNext()) {
			Student key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t"+key + " : "+value);
		}
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		Student std;
		int input;
		String name;
		
		while (true) {
			System.out.println("�л� ��ȣ�� �Է��ϼ���: ");
			input = scan.nextInt();
			System.out.println("�л� �̸��� �Է��ϼ��� : ");
			name = scan.next();
			std = new Student(input, name);

			if (map.containsKey(std)) {
				System.out.println(name + "�л��� ������ " + map.get(std) + "�� �Դϴ�.");
				break;
			} else
				System.out.println("�ش� �л��� �����Ͱ� �������� �ʽ��ϴ�.");
			System.out.println("======================================");
		}

	}
}
