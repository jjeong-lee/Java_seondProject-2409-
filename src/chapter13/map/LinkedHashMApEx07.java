package chapter13.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMApEx07 {

	
	public static void main(String[] args) {
		
		//HashMap 객체 생성 및 데이터 추가
		Map<String , String>hashMap = new HashMap<String, String>();
		hashMap.put("apple", "red");
		hashMap.put("banana", "yellow");
		hashMap.put("grape", "purple");
		hashMap.put("orange", "orange");
		
		//HashMap 출력(순서 보장되지 않음)
		for(Map.Entry<String, String> entry: hashMap.entrySet()) {
			System.out.println("[fruit: "+entry.getKey()+", color: "+entry.getValue()+"]"); 
		}
		
		//=================================================================
		// LinkedHashMap 객체 생성 및 데이터 추가  //순서보장, 유동적, 삽입이 빈번할때 사용
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple", "red");
        linkedHashMap.put("banana", "yellow");
        linkedHashMap.put("grape", "purple");
        linkedHashMap.put("orange", "orange");
		
        // LinkedHashMap 출력 (입력 순서 보장)
        System.out.println("\n== LinkedHashMap 출력 (입력된 순서) ==");
        for(Map.Entry<String, String> entry2 : linkedHashMap.entrySet()) {
        	System.out.println(entry2.getKey() + ": "+ entry2.getValue());
        }
		
		}
}
