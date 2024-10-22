package chapter13.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx04 {

	public static void main(String[] args) {

		/*
		 * 특징 : HashSet과 동일하지만, 요소가 삽입된 순서를 유지한다.
		 */

		Set<String> LinkedHashSet = new LinkedHashSet<String>();
		
		
		//요소 추가
		LinkedHashSet.add("Apple");
		LinkedHashSet.add("Banana");
		LinkedHashSet.add("Orange");
		LinkedHashSet.add("Apple");//중복이 허용되지 않음
		
		//출력
		System.out.println("HashSet : "+LinkedHashSet);

		
		
	}

}
