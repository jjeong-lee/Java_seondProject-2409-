package chapter13.generic;

public class GeneralEx02 <E>{ //E(Element)�� T(Type)�� K(key)�� ���� ��. �ƹ��ų� �������.

	public void printArr(E[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	
	
}
