package chapter11;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		System.out.println("----Buy----");
		Buy buyer = customer;
		buyer.buy(); //Ãß»ó
		buyer.order();
		
		System.out.println("----Sell----");
		Sell seller = customer;
		seller.sell();
		seller.sellorder();
	
		//=======================================================
		if(seller instanceof Customer) {
			System.out.println("===Down Chasting===");
			Customer cs = (Customer)seller;
			cs.buy();
			cs.sell();
			cs.sellorder();
		}
		System.out.println("===customer===");
		customer.order();
		
	}
	
}
