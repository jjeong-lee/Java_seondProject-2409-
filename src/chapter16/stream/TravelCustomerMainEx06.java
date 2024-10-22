package chapter16.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerMainEx06 {

	public static void main(String[] args) {
		
		
		//����
		List<TravelCustomer> customerList = new ArrayList<>();
		
		//��ü����
		TravelCustomer customerKim = new TravelCustomer("�����", 20, 35000);
		TravelCustomer customerPark = new TravelCustomer("������", 40, 25000);
		
		//��ü�� ���濡 ���
		customerList.add(new TravelCustomer("�̼���", 30, 28000));
		customerList.add(customerKim);
		customerList.add(customerPark);
		
		//������� 
		System.out.println("==�� ��� �߰��� ������� ���==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("==20������ ���̰� ���� ���� �̸��� �����Ͽ� ���==");
		customerList.stream().filter(c->c.getAge()>20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
		System.out.println("==�Ѽ���==");
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("�Ѽ��� : "+ total);
		
	}
}
