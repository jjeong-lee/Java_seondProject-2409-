package chapter09;

public class Customer {

	
	//멤버변수
	//protected : 동일 패키지와 상속이 성립된 클래스에서 사용가능
	protected int customerID;
	protected String customerName;
	protected String customergrade;
	public double bonusPoint;
	protected double bonusRatio;
	
	//디폴트 생성자
	public Customer() {
		customergrade="SILVER";
		bonusRatio=0.1;
	}
	
	//오버로딩된 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customergrade="SILVER";
		bonusRatio=0.1;
	}
	
	//포인트와 가격(등급에 따라 다름)
	public int calePrice(int price) {
		bonusPoint += bonusRatio * price;
		return price;
	}

	public String showCustomer() {

		return customerName + "님의 등급은 " + customergrade + "이며 보너스 포인트는 " + bonusPoint + "원 입니다";

	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomergrade() {
		return customergrade;
	}

	public void setCustomergrade(String customergrade) {
		this.customergrade = customergrade;
	}
	
	//전문 상담원
	public int getAgentID() {
		return -1;
	}
	
	
	
	
	
}
