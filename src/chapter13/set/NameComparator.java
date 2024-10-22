package chapter13.set;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());		 //comparator는 하나를 기준으로 두기때문에 compareTo, comparable은 두개를 비교해서 compare 사용.
	}

	
	
}
