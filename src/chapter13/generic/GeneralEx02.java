package chapter13.generic;

public class GeneralEx02 <E>{ //E(Element)나 T(Type)나 K(key)를 많이 씀. 아무거나 상관없음.

	public void printArr(E[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	
	
}
