package chapter11;

public class Customer implements Buy, Sell {
	@Override
	public void sell() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub

	}
	
	//같은 이름의 디폴트 메서드가 존재하면 반드시 재정의 하여야 한다.
	/*
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
	 */
}
