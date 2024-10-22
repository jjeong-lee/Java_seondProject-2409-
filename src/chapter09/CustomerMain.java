package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		//일반고객
		System.out.println("==========일반고객==========");
		Customer choiCs = new Customer();
		choiCs.setCustomerName("진혁");
		
		//오버로딩된 생성자를 이용한 객체생성
		Customer cs2 = new Customer(1004,"김우진");
		
		int price = 10000;
		
		int choiCsPrice = choiCs.calePrice(3000);
		System.out.println(choiCs.customerName+"님이 "+choiCsPrice+"원을 지불 했습니다.");
		System.out.println(choiCs.showCustomer());
		
		
		// VIP고객
		System.out.println("--------------------VIP고객---------------------");
		price=10000;
		
		VIPCustomer cs3 = new VIPCustomer(3000, "정성희", 999);
		int cs3Price = cs3.calePrice(price);
		System.out.println(cs3.customerName+"님이 "+cs3Price+"원을 지불 했습니다.");
		System.out.println(cs3.showCustomer());
		
	}

}
