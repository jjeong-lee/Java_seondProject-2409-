package chapter15;

public class Account {

	int balance = 100000; //잔액

	// 출금메서드
	public synchronized void withDraw(int money) {
		
		while (balance < money) {
			try {
				wait(); // 스레드가 일시적으로 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.println("출금액: " + money + ", 잔액: " + balance);
		notify();
	}

	// 입금메서드
	public synchronized void deposit(int money) {

		balance += money;
		System.out.println("입금액: " + money + ", 잔액: " + balance);
		notify();// 대기중인 스레드 깨움

	}

}
