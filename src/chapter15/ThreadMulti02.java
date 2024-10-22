package chapter15;

public class ThreadMulti02 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(2);
		}
	}

}
