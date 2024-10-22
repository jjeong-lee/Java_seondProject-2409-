package chapter13.list;

public class Message {
	//Linked List랑 같이 비교하며 보기  (이건 Linked Queue임)
	public String command;
	public String to;
	
	
	
	public Message(String to,String command) {
		this.command = command;
		this.to = to;
	}
	
	
}
