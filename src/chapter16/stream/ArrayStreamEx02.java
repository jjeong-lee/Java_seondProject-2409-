package chapter16.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStreamEx02 {

	public static void main(String[] args) {
		
	
	int [] arr = {1,2,3,4,5};
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	//람다식+스트림
	System.out.println("\n===람다식+스트림===");
	Arrays.stream(arr).forEach(n->System.out.print(n+" "));
	System.out.println();
	System.out.println("===스트림을 이용하여 합계===");
	System.out.println(Arrays.stream(arr).sum());
	
	System.out.println("\n===컬렉션의 스트림 활용===");
	List<Integer> list = new ArrayList<Integer>();
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	
	int total = list.stream().mapToInt(n->n.intValue()).sum();
	System.out.println(total);
	
	
	}
}
