package chapter11;

public interface Sell {

	
	void sell();
	/*
	default void order() {
		System.out.println("Sell 판매 주문");
	}*/
	
	default void sellorder() {
		System.out.println("판매 주문");
	}
	
	
}
