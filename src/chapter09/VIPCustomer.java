package chapter09;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	//�����ڸ� �̿��ؼ� customerID, customerName,agentID
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
		return super.showCustomer()+"\n���������� "+agentID+"�Դϴ�.";
	}

	@Override
	public int getAgentID() {
		return agentID;
	}


	
}
