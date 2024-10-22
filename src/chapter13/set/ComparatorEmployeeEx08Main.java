package chapter13.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEmployeeEx08Main {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Alice", 85));
		employees.add(new Employee("Bob", 85));
		employees.add(new Employee("Charlie", 80));
		
		//�̸��� �������� ����
		Collections.sort(employees, new NameComparator());
		System.out.println("�̸��� �������� ����: ");
		
		for(Employee employee: employees) {
			System.out.println(employee);
		}
		
		System.out.println();
		//���̸� �������� ����
		Collections.sort(employees, new AgeComparator());
		System.out.println("���̸� �������� ����: ");
		
		for(Employee employee: employees) {
			System.out.println(employee);
		}
		
		
		
	}
	
	
}