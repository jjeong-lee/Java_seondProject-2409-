package chapter11;

public interface Sell {

	
	void sell();
	/*
	default void order() {
		System.out.println("Sell �Ǹ� �ֹ�");
	}*/
	
	default void sellorder() {
		System.out.println("�Ǹ� �ֹ�");
	}
	
	
}
