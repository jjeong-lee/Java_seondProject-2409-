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
		
		//이름을 기준으로 정렬
		Collections.sort(employees, new NameComparator());
		System.out.println("이름을 기준으로 정렬: ");
		
		for(Employee employee: employees) {
			System.out.println(employee);
		}
		
		System.out.println();
		//나이를 기준으로 정렬
		Collections.sort(employees, new AgeComparator());
		System.out.println("나이를 기준으로 정렬: ");
		
		for(Employee employee: employees) {
			System.out.println(employee);
		}
		
		
		
	}
	
	
}
