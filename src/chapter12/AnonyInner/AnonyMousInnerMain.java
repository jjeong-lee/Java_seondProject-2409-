package chapter12.AnonyInner;

class Outter{
	Runnable getRunnable(int i) {
		int num=100;
		return new Runnable() {
			
			@Override
			public void run() {
				//������ �ȵ� **�߿�**
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
		//��
		Outter out = new Outter();
		Runnable runable=out.getRunnable(10);
		runable.run();
		//���2
		out.getRunnable(50).run();

	}

}
