package chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김우진", 85);
		map.put("이수정", 90);
		map.put("박진영", 98);
		map.put("정하나", 75);
		System.out.println("총 Entry 수 :"+map.size());
		
		
		//객체 찾기
		System.out.println("\n이수정: "+map.get("이수정"));
		System.out.println();
		
		//객체 키 모두 받기
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator=keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next(); //키받기
			Integer value=map.get(key);	
			System.out.println(key+": "+value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: "+map.size());
		
		
		
	}//main
	
}
