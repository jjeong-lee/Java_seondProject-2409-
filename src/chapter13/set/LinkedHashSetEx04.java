package chapter13.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx04 {

	public static void main(String[] args) {

		/*
		 * Ư¡ : HashSet�� ����������, ��Ұ� ���Ե� ������ �����Ѵ�.
		 */

		Set<String> LinkedHashSet = new LinkedHashSet<String>();
		
		
		//��� �߰�
		LinkedHashSet.add("Apple");
		LinkedHashSet.add("Banana");
		LinkedHashSet.add("Orange");
		LinkedHashSet.add("Apple");//�ߺ��� ������ ����
		
		//���
		System.out.println("HashSet : "+LinkedHashSet);

		
		
	}

}
