package chapter14.standard;

import java.util.Scanner;

public class AverageCalculatorEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int num;
		
		
		System.out.println("���ڸ� �Է��ϼ���(�����Ϸ��� -1 �Է�)");
				
		while(true) {
			num = scan.nextInt();
			if(num ==-1) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			sum+=num;
			count++;
		}
			
			
		if(count>0) {
			double avg = sum/count;
			System.out.println("�Է��� ������ ����� "+Math.round(avg)+ "�Դϴ�.");
		}else {
			System.out.println("���ڰ� �Էµ��� �ʾҽ��ϴ�.");
		}
		
		
	
		scan.close();
	
	}
	
	
	
	
	
	
	
	
}
