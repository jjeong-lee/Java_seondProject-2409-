package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		//�Ϲݰ�
		System.out.println("==========�Ϲݰ�==========");
		Customer choiCs = new Customer();
		choiCs.setCustomerName("����");
		
		//�����ε��� �����ڸ� �̿��� ��ü����
		Customer cs2 = new Customer(1004,"�����");
		
		int price = 10000;
		
		int choiCsPrice = choiCs.calePrice(3000);
		System.out.println(choiCs.customerName+"���� "+choiCsPrice+"���� ���� �߽��ϴ�.");
		System.out.println(choiCs.showCustomer());
		
		
		// VIP��
		System.out.println("--------------------VIP��---------------------");
		price=10000;
		
		VIPCustomer cs3 = new VIPCustomer(3000, "������", 999);
		int cs3Price = cs3.calePrice(price);
		System.out.println(cs3.customerName+"���� "+cs3Price+"���� ���� �߽��ϴ�.");
		System.out.println(cs3.showCustomer());
		
	}

}
