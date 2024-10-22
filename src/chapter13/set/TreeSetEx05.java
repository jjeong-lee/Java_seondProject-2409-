package chapter13.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx05 {

	public static void main(String[] args) {
	
		//in-order(�� �� ��)
		//pre-order(�� �� ��)
		//post-order(�� �� ��)
		//Ư¡: ���� Ž�� Ʈ���� ������� �����ϸ�, ��Ҹ� �ڵ����� �����Ͽ� �����Ѵ�.
		
		Set<String> treeSet = new TreeSet<>();

		// ��� �߰�
		treeSet.add("Apple");
		treeSet.add("Banana");
		treeSet.add("Orange");
		treeSet.add("Apple"); // �ߺ��� ������ ����

		// ���
		System.out.println("HashSet : " + treeSet);

		// ��� ���翩�� Ȯ��
		if (treeSet.contains("Banana")) {
			System.out.println("Banana is in the treeSet");
		}

		// ��� ����
		treeSet.remove("Orange");
		System.out.println("After removal: " + treeSet);

	}

}