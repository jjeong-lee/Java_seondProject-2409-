package chapter12.AnonyInner;

class Outter2{
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable�� ������ �͸��� Ŭ����");
		}
	};
}


public class AnonyMousInner2Main {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		out.runner.run();

	}

}
