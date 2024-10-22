package chapter13.list;

import java.util.Vector;

public class VectorcapacityEx05 {

	/*
	 Vector�� ��Ƽ������ ȯ�濡�� ����غ���. 
	 ������ ���� ������ �ʿ����� �ʰų� ������ �߿��� ���� ������ ȯ�濡����, 
	 ArrayList ���� �񵿱�ȭ�� ����Ʈ�� ����ϴ� ���� �� ������ ȿ�����̴�.
	 */
	
	public static void main(String[] args) {
		
		//Vector ����(�⺻ �뷮 10)
		Vector<String> vector = new Vector<String>();
		
		//���� ũ��� �뷮
		System.out.println("�ʱ� ũ�� : "+ vector.size());
		System.out.println("�ʱ� �뷮 : "+ vector.capacity());
		
		//������ �߰�
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");
		
		//������ �߰� �� ũ��� �뷮 ���
		System.out.println("3���� ������ �߰� �� ũ��: "+vector.size());
		System.out.println("3���� ������ �߰� �� �뷮: "+vector.capacity());
		
		//10���� ������ �߰�
		for(int i=0;i<8;i++) {
			vector.add("Fruit"+i);
		}
		
		//������ �߰� �� ũ��� �뷮 ���
		System.out.println("11���� ������ �߰� �� ũ��: "+vector.size());
		System.out.println("11���� ������ �߰� �� �뷮: "+vector.capacity());
		
		
		
		

	}

}
