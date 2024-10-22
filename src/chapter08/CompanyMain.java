package chapter08;

public class CompanyMain {

	public static void main(String[] args) {
		
		
		//heap¿¡ °´Ã¼ »ý¼º
		Company company1 = new Company();
		Company company2 = new Company();
		
		System.out.println(company1);
		System.out.println(company2);
		
		System.out.println("----------singleton----------");
		
		//Data
		Company mycompany1=Company.getInstance();
		Company mycompany2=Company.getInstance();
		
		System.out.println(mycompany1);
		System.out.println(mycompany2);
		System.out.println(mycompany1==mycompany2);

	}

}
