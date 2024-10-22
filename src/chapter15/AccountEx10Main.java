package chapter15;

import java.util.Scanner;

public class AccountEx10Main {

	public static void main(String[] args) {

		Account acc = new Account();
		Runnable r = new AccountThread(acc);

		// ������ȭ
		Thread t1 = new Thread(r);
		t1.setDaemon(true);
		t1.start();
		Scanner scan = new Scanner(System.in);
		// ������� ������� while��
		while (true) {
			// �ܾ��� 0 ������ ��츸 �Ա� ��û
			if (acc.balance <= 0) {
				System.out.print("�ܾ��� �����մϴ�. �Ա��� �ݾ��� �Է��ϼ���(0 �Է� �� ����): ");
				int n = scan.nextInt();
				if (n == 0) { // 0�� �Է��ϸ� ����
					break;
				}
				acc.deposit(n);
			} else {
				// �ܾ��� 0�� �ƴ� ��� ��� ���� �޽���
				System.out.println("��� �����մϴ�.");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
		}
		scan.close(); // ��ĳ�� �ݱ�
	
		System.out.println("���� �ܾ�: " + acc.balance);
		System.out.println("�̿��� ����˴ϴ�.");
	}
}
