package chapter15;

public class Account {

	int balance = 100000; //�ܾ�

	// ��ݸ޼���
	public synchronized void withDraw(int money) {
		
		while (balance < money) {
			try {
				wait(); // �����尡 �Ͻ������� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.println("��ݾ�: " + money + ", �ܾ�: " + balance);
		notify();
	}

	// �Աݸ޼���
	public synchronized void deposit(int money) {

		balance += money;
		System.out.println("�Աݾ�: " + money + ", �ܾ�: " + balance);
		notify();// ������� ������ ����

	}

}
