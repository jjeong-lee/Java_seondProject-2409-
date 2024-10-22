package chapter15;

import java.util.Scanner;

public class AccountEx10Main {

	public static void main(String[] args) {

		Account acc = new Account();
		Runnable r = new AccountThread(acc);

		// 스레드화
		Thread t1 = new Thread(r);
		t1.setDaemon(true);
		t1.start();
		Scanner scan = new Scanner(System.in);
		// 스레드와 상관없는 while문
		while (true) {
			// 잔액이 0 이하일 경우만 입금 요청
			if (acc.balance <= 0) {
				System.out.print("잔액이 부족합니다. 입금할 금액을 입력하세요(0 입력 시 종료): ");
				int n = scan.nextInt();
				if (n == 0) { // 0을 입력하면 종료
					break;
				}
				acc.deposit(n);
			} else {
				// 잔액이 0이 아닐 경우 출금 가능 메시지
				System.out.println("출금 가능합니다.");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
		}
		scan.close(); // 스캐너 닫기
	
		System.out.println("최종 잔액: " + acc.balance);
		System.out.println("이용이 종료됩니다.");
	}
}
