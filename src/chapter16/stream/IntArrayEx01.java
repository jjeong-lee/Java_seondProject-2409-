package chapter16.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayEx01 {

	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,5};
		
		//int => IntStream 형변환
		
		IntStream stream  = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		System.out.println();
		//count()은 Integer로 반환되므로 unBox하여 사용
		int sumVal =  Arrays.stream(arr).sum(); //묵시적
		int count = (int)Arrays.stream(arr).count(); //명시적
		
		System.out.println(sumVal);
		System.out.println(count);
		System.out.println();
		
		/*
		//ERROR :한번 사용된 stream 변수방은 재사용이 안됨.
		count=(int)stream.count(); //소멸된 stream
		System.out.println(count);
		 */
		
		int count2 = (int)Arrays.stream(arr).count();
		System.out.println(count2);
		System.out.println();
		
		//reduce
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
		
		
		
}
}