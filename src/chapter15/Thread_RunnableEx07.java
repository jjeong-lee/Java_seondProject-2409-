package chapter15;

public class Thread_RunnableEx07 implements Runnable{

	@Override
	public void run() {
		System.out.println("run()�޼��� ����");
		first();
	}
	
	public void first() {
		System.out.println("first()�޼��� ����");
		second();
	}

	public void second() {
		System.out.println("second()�޼��� ����");
	}
	
	public static void main(String[] args) {
		
		//�Ϲ� ����(���ν�����)
		System.out.println("���ν����� ����!");
		Thread_RunnableEx07 t1 = new Thread_RunnableEx07();
		t1.run();
		
		System.out.println("-----------------------------------");
		Thread mThread = new Thread(t1);  //t1��ü�� Thread ��ü�� ����ȯ
		mThread.start();
		System.out.println("���� Ŭ���� ����");   //������� ������ ���Ѽ� ������ ����! ���ᰡ �����庸�� ���� ��Ÿ��.
		
		
	}
	
}
