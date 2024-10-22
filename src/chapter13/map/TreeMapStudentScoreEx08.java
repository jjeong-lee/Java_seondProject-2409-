package chapter13.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudentScoreEx08 {

	public static void main(String[] args) {
		
		/*
		• 이진 탐색 트리를 기반으로 동작하며, 키를 자동으로 정렬하여 저장한다.
	    */
		
		//TreeMap  객체 생성
		TreeMap<String, Integer>studentScores = new TreeMap<>();  //<>생략
		
		// 학생의 이름을 키로, 점수를 값으로 TreeMap에 추가
        studentScores.put("Alice", 85);
        studentScores.put("David", 95);
        studentScores.put("Charlie", 78);
        studentScores.put("Bob", 92);
		
        // TreeMap에 저장된 항목 출력 (이름순으로 자동 정렬됨)
        System.out.println("== 학생 성적 출력 (이름순 정렬) ==");
        
        for(Map.Entry<String, Integer>entry : studentScores.entrySet()) {
        	System.out.println(entry.getKey()+", "+entry.getValue()+"점");
        }
        System.out.println();
        //특정 학생의 이름으로 조회
        String studentName = "Bob";
        System.out.println(studentName+"의 성적: "+studentScores.get(studentName)+"점");
        
	}
	
}
