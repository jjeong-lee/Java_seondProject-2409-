package chapter15;

class MyThread extends Thread{
//�����带 ��ӹ޾Ƽ� �ϴ� ��� ex04�� ��

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

public class ThreadEx03 {

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		thread1.start(); //Thread.currentThread().getName() 0
		thread2.start(); //Thread.currentThread().getName() 1
		
	}
	
}
