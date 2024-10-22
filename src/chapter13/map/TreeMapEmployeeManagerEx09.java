package chapter13.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeManagerEx09 {

	public static void main(String[] args) {
		
		
		//TreeMap ��ü ����
		TreeMap<Integer, Employee> employeeMap = new TreeMap<>();
		
		//������ ID�� Ű��, ���� ��ü(Employee)�� ������ TreeMap �� �߰�
		Employee member1 = new Employee("Alice", 30);
		employeeMap.put(102, member1);
		employeeMap.put(101, new Employee("Bob", 25));
		employeeMap.put(104, new Employee("Charlie", 35));
		employeeMap.put(103, new Employee("David", 28));

		
		//�������� ���(ID ������� �ڵ� ���ĵ�)
		  System.out.println("== ���� ���� ��� (�̸��� ����) ==");
		for(Map.Entry<Integer, Employee>entry: employeeMap.entrySet()) {
			System.out.println("ID"+entry.getKey()+ "| NAME: "+entry.getValue()+"��");
		}
		
		//Ư���������� ��ȸ
		int employeeId = 103;
		System.out.println("\nID "+employeeId + "�� ���� ����: "+employeeMap.get(employeeId));
		
		
	}
}
