package chapter15;

public class ThreadMultiEx06Main {
	
	public static void main(String[] args) {
		// Multi Thread
		ThreadMulti01 t1 = new ThreadMulti01();
		ThreadMulti02 t2 = new ThreadMulti02();

		t1.start();
		t2.start();

	}
}
