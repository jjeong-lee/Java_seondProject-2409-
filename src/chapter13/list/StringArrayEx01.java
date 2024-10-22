package chapter13.list;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayEx01 {

	public static void main(String[] args) {
		
		//���ڿ� �����͸� ��� ArrayList 
		ArrayList<String> stringList = new ArrayList<String>();
		System.out.println("Initial size of stringList: "+ stringList.size());

		// ���ڿ� �����͸� �߰��Ѵ�.
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Cherry");

		System.out.println("Size of stringList after adding elements: " + stringList.size());

		// ����Ʈ�� ��ҵ��� ���
		System.out.println("\nAccessing element using index: ");
		for (int i = 0; i < stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}

		// �ݺ��ڸ� ����Ͽ� ����Ʈ ���
		System.out.println("\nAccessing elements using Iterator: ");
		Iterator<String> it=stringList.iterator();
		
		while(it.hasNext()) { //������ ���� ���� Ȯ��
			String fruit=it.next(); //������ ������ ������
			System.out.println(fruit);
		}
		
	}
	
}
