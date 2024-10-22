package chapter15;

class MyRunnable implements Runnable{
	//�������̽��� �̿��ϴ� ��� ex03�� ���ؼ� ����
	//runnable�� run���� ���ؼ� �����ϴ� �������̽�

@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread "+ Thread.currentThread().getName()+": "+i);
			try {
				Thread.sleep(500);//0.5�� ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//run

}//class

public class ThreadEx04 {

	public static void main(String[] args) {
		
		MyRunnable myrunnable = new MyRunnable();
		Thread thread1 = new Thread(myrunnable);
		Thread thread2 = new Thread(myrunnable);
		
		thread1.start(); //Thread.currentThread().getName() 0
		thread2.start(); //Thread.currentThread().getName() 1
		
	}
	
}
