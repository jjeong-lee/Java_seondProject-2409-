package chapter13.collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx02 {

	
	public static void main(String[] args) {
		//Set : �ߺ�����
		//HashSet ���� : �ߺ����� + ���� ����
		Set<String> fruits = new HashSet<String>();
		
		//���� �߰�
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple"); //�ߺ��߰�
		
		//���� ��� ���
		System.out.println("Fruits int the set");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//Ư�� ��������
		fruits.remove("Banana");
		
		//������ ���� ��� ���
		System.out.println("\nAfter removing Bananan:");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
	}
}
