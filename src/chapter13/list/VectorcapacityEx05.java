package chapter13.list;

import java.util.Vector;

public class VectorcapacityEx05 {

	/*
	 Vector를 멀티스레드 환경에서 사용해보자. 
	 하지만 동시 접근이 필요하지 않거나 성능이 중요한 단일 스레드 환경에서는, 
	 ArrayList 같은 비동기화된 리스트를 사용하는 것이 더 빠르고 효율적이다.
	 */
	
	public static void main(String[] args) {
		
		//Vector 생성(기본 용량 10)
		Vector<String> vector = new Vector<String>();
		
		//현재 크기와 용량
		System.out.println("초기 크기 : "+ vector.size());
		System.out.println("초기 용량 : "+ vector.capacity());
		
		//데이터 추가
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");
		
		//데이터 추가 후 크기와 용량 출력
		System.out.println("3개의 데이터 추가 후 크기: "+vector.size());
		System.out.println("3개의 데이터 추가 후 용량: "+vector.capacity());
		
		//10개의 데이터 추가
		for(int i=0;i<8;i++) {
			vector.add("Fruit"+i);
		}
		
		//데이터 추가 후 크기와 용량 출력
		System.out.println("11개의 데이터 추가 후 크기: "+vector.size());
		System.out.println("11개의 데이터 추가 후 용량: "+vector.capacity());
		
		
		
		

	}

}
