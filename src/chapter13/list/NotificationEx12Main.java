package chapter13.list;

import java.util.LinkedList;

public class NotificationEx12Main {

	
	public static void main(String[] args) { //톡, 이메일, 문자 등 사용하기
		//LinkedList를 큐로 사용 notificationQueue
		LinkedList<Notification> notificationQueue = new LinkedList<Notification>();
		
		//큐에 데이터 추가(offer)
		notificationQueue.offer(new Notification("Email","Alex"));
		notificationQueue.offer(new Notification("DM","Robert"));
		notificationQueue.offer(new Notification("KakaoTalk","Rita"));
		
		
		//큐에서 데이터 꺼내기 (poll)   
		while(!notificationQueue.isEmpty()) {
			Notification notification = notificationQueue.poll();
			
			switch (notification.action) { //속도가 빨라서 switch를 사용함.
			case "Email": 
				System.out.println(notification.name+"에게 "+notification.action +"이 도착했습니다.");
				break;
			case "DM": 
				System.out.println(notification.name+"에게 "+notification.action +"이 도착했습니다.");
				break;
			case "KakaoTalk": 
				System.out.println(notification.name+"에게 "+notification.action +"이 도착했습니다.");
				break;		
			}
		}
		
	}
}
