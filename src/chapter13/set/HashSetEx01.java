package chapter13.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx01 {

	/*
	• HashSet은 해시 테이블을 기반으로 하여 요소를 저장하며, 요소의 순서를 보장하지 않는다. 
	  가장 많이 사용되는 Set 구현체 중 하나로, 빠른 검색과 삽입이 특징이다. //중복을 막아준다!!***
    */
	
	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		
		//요소 추가
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Apple"); //중복이 허용되지 않음
		
		//출력
		System.out.println("HashSet : "+hashSet);
		
		//요소 존재여부 확인
		if(hashSet.contains("Banana")) {
			System.out.println("Banana is in the HashSet");
		}
		
		//요소 삭제
		hashSet.remove("Orange");
		System.out.println("After removal: "+hashSet);
		
		
		
		
		
	}
}
