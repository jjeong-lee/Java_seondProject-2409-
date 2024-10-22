package chapter15;

public class NonDaemonThreadEx09Main implements Runnable{

	static boolean autoSave = false;

	public static void main(String[] args) {

		NonDaemonThreadEx09Main dm = new NonDaemonThreadEx09Main();
		Thread t = new Thread(dm); // run()�� start()�� ���� ��, ������ȭ ��Ŵ
		//���ν����尡 ����Ǹ� ���� �����Ű�� ���� _����
		t.setDaemon(true);  //���� �۵�
		t.start(); //�ڵ����� �޼��尡 ����

		for (int i = 0; i <= 15; i++) {
			// ���ν�����
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if (i == 3) {
				autoSave = true;
			}
		} // for
		/*
		//���� ������ ���� ���� ��� ���
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		System.out.println("���� �����带 �����մϴ�.");
		
		
	}// main

	// 3�ʸ��� �����ϱ�
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000); //3�ʴ��
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (autoSave) {
				System.out.println("�ڵ����� �˴ϴ�."); // 0 1 2 3 �ڵ�����˴ϴ�.
			}
		}

	}

}
