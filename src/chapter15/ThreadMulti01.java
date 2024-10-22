package chapter15;

public class ThreadMulti01 extends Thread {

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(1);
		}

	}

}
