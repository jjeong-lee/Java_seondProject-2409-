package chapter13.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMessageEx11Main {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		//offer로 입력
		messageQueue.offer(new Message("최백설","Mail"));
		messageQueue.offer(new Message("김아리","SMS"));
		messageQueue.offer(new Message("박수석","Kakaotalk"));
		
		
		//poll로 출력
		while(!messageQueue.isEmpty()) {
			Message message =messageQueue.poll(); //message.to, message.command
			
			switch (message.to) {
			case "최백설": 
				System.out.println(message.to+ "님의 "+message.command+"이 도착했습니다.");
				break;
			case "김아리": 
				System.out.println(message.to+ "님의 "+message.command+"가 도착했습니다.");
				break;
			case"박수석":
				System.out.println(message.to+ "님의 "+message.command+"이 도착했습니다.");
				break;
			
		}//switch
		}//while
		
		
		
	}//main
}//class
