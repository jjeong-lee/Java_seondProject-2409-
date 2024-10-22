package chapter09;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	//생성자를 이용해서 customerID, customerName,agentID
	public VIPCustomer (int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID=agentID;
		customergrade ="VIP";
		bonusRatio = 0.15;
		this.saleRatio=0.1;
	}
	//5000-(5000*0.15)
	@Override
	public int calePrice(int price) {
		bonusPoint += bonusRatio * (price-(int)(price*saleRatio));
		return price-(int)(price*saleRatio);
	}
	
	@Override
	public String showCustomer() {
		return super.showCustomer()+"\n전문상담원은 "+agentID+"입니다.";
	}

	@Override
	public int getAgentID() {
		return agentID;
	}


	
}
