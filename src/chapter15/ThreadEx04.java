package chapter15;

class MyRunnable implements Runnable{
	//인터페이스를 이용하는 방법 ex03과 비교해서 보기
	//runnable은 run만을 위해서 존재하는 인터페이스

@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread "+ Thread.currentThread().getName()+": "+i);
			try {
				Thread.sleep(500);//0.5초 대기
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
