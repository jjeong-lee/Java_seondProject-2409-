package chapter14.standard;

import java.util.Scanner;

public class AverageCalculatorEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int num;
		
		
		System.out.println("숫자를 입력하세요(종료하려면 -1 입력)");
				
		while(true) {
			num = scan.nextInt();
			if(num ==-1) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			sum+=num;
			count++;
		}
			
			
		if(count>0) {
			double avg = sum/count;
			System.out.println("입력한 숫자의 평균은 "+Math.round(avg)+ "입니다.");
		}else {
			System.out.println("숫자가 입력되지 않았습니다.");
		}
		
		
	
		scan.close();
	
	}
	
	
	
	
	
	
	
	
}
