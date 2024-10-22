package chapter12.AnonyInner;

class Outter{
	Runnable getRunnable(int i) {
		int num=100;
		return new Runnable() {
			
			@Override
			public void run() {
				//재정의 안됨 **중요**
				//num=200;
				//i=10;
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
}

public class AnonyMousInnerMain {

	public static void main(String[] args) {
		//방
		Outter out = new Outter();
		Runnable runable=out.getRunnable(10);
		runable.run();
		//방법2
		out.getRunnable(50).run();

	}

}
