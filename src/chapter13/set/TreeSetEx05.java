package chapter13.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx05 {

	public static void main(String[] args) {
	
		//in-order(왼 나 오)
		//pre-order(나 왼 오)
		//post-order(왼 오 나)
		//특징: 이진 탐색 트리를 기반으로 동작하며, 요소를 자동으로 정렬하여 저장한다.
		
		Set<String> treeSet = new TreeSet<>();

		// 요소 추가
		treeSet.add("Apple");
		treeSet.add("Banana");
		treeSet.add("Orange");
		treeSet.add("Apple"); // 중복이 허용되지 않음

		// 출력
		System.out.println("HashSet : " + treeSet);

		// 요소 존재여부 확인
		if (treeSet.contains("Banana")) {
			System.out.println("Banana is in the treeSet");
		}

		// 요소 삭제
		treeSet.remove("Orange");
		System.out.println("After removal: " + treeSet);

	}

}
