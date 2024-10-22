package chapter16.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerMainEx06 {

	public static void main(String[] args) {
		
		
		//가방
		List<TravelCustomer> customerList = new ArrayList<>();
		
		//객체생성
		TravelCustomer customerKim = new TravelCustomer("김우진", 20, 35000);
		TravelCustomer customerPark = new TravelCustomer("박진영", 40, 25000);
		
		//객체를 가방에 담기
		customerList.add(new TravelCustomer("이수정", 30, 28000));
		customerList.add(customerKim);
		customerList.add(customerPark);
		
		//순서대로 
		System.out.println("==고객 명단 추가된 순서대로 출력==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("==20세보다 나이가 많은 고객의 이름을 정렬하여 출력==");
		customerList.stream().filter(c->c.getAge()>20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
		System.out.println("==총수입==");
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총수입 : "+ total);
		
	}
}
