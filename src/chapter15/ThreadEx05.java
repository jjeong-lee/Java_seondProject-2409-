package chapter15;

class Counter{
	private int count = 0;
	
	//synchronized : 여러 스레드가 공유되고 있는 자원에 동시에 접근할때 일관성을 보장하기 위해 사용
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}


public class ThreadEx05 {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		//Thread run
		Runnable task=()->{
			for(int i=0;i<1000;i++) {
				counter.increment();
			}
		};
		
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		
		thread1.start();
		thread2.start();
		
		//join 메인코드가 자식스레드인 thread1.start(); thread2.start(); 가 종료될 때까지 기다림
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Final count : "+counter.getCount());
		
		
		
	}//main
}
