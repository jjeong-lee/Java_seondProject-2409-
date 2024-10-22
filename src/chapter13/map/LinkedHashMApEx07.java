package chapter13.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMApEx07 {

	
	public static void main(String[] args) {
		
		//HashMap ��ü ���� �� ������ �߰�
		Map<String , String>hashMap = new HashMap<String, String>();
		hashMap.put("apple", "red");
		hashMap.put("banana", "yellow");
		hashMap.put("grape", "purple");
		hashMap.put("orange", "orange");
		
		//HashMap ���(���� ������� ����)
		for(Map.Entry<String, String> entry: hashMap.entrySet()) {
			System.out.println("[fruit: "+entry.getKey()+", color: "+entry.getValue()+"]"); 
		}
		
		//=================================================================
		// LinkedHashMap ��ü ���� �� ������ �߰�  //��������, ������, ������ ����Ҷ� ���
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple", "red");
        linkedHashMap.put("banana", "yellow");
        linkedHashMap.put("grape", "purple");
        linkedHashMap.put("orange", "orange");
		
        // LinkedHashMap ��� (�Է� ���� ����)
        System.out.println("\n== LinkedHashMap ��� (�Էµ� ����) ==");
        for(Map.Entry<String, String> entry2 : linkedHashMap.entrySet()) {
        	System.out.println(entry2.getKey() + ": "+ entry2.getValue());
        }
		
		}
}
