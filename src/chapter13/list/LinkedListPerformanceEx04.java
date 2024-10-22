package chapter13.list;

import java.util.LinkedList;

public class LinkedListPerformanceEx04 {

	/*
	• 특징: LinkedList는 이중 연결 리스트 구조로 데이터를 저장한다. 
	        요소를 삽입하거나 삭제하는 작업이 빈번할 때 적합하다.
	• 장점: 중간에 요소를 삽입하거나 삭제하는 것이 빠름.
	• 단점: 인덱스를 통한 요소 접근 속도가 느림.
    */
	
	public static void main(String[] args) {
		//LinkedList 생성
		LinkedList<String> fruitList = new LinkedList<String>();
		
		//데이터 추가
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Cherry");
		
		
		//초기 리스트 출력
		System.out.println("초기 리스트: "+ fruitList);
	
		
		//리스트의 맨 앞에 데이터 추가
		fruitList.addFirst("Grapes");
		System.out.println("맨 앞에 추가: "+fruitList);
		
		//리스트의 맨 마지막 데이터 제거
		System.out.println("마지막 데이터 제거: "+fruitList.removeLast()); 
		System.out.println("마지막 데이터 제거 후: "+fruitList);
		
		//리스트의 맨 뒤에 데이터 추가
		fruitList.addLast("Mango");
		System.out.println("맨 뒤에 Mango 추가 후: "+fruitList);
		
	
	}
	
	
	
}