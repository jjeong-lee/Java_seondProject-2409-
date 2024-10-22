package chapter16.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayEx01 {

	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,5};
		
		//int => IntStream ����ȯ
		
		IntStream stream  = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		System.out.println();
		//count()�� Integer�� ��ȯ�ǹǷ� unBox�Ͽ� ���
		int sumVal =  Arrays.stream(arr).sum(); //������
		int count = (int)Arrays.stream(arr).count(); //�����
		
		System.out.println(sumVal);
		System.out.println(count);
		System.out.println();
		
		/*
		//ERROR :�ѹ� ���� stream �������� ������ �ȵ�.
		count=(int)stream.count(); //�Ҹ�� stream
		System.out.println(count);
		 */
		
		int count2 = (int)Arrays.stream(arr).count();
		System.out.println(count2);
		System.out.println();
		
		//reduce
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
		
		
		
}
}