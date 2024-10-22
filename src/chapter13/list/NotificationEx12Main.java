package chapter13.list;

import java.util.LinkedList;

public class NotificationEx12Main {

	
	public static void main(String[] args) { //��, �̸���, ���� �� ����ϱ�
		//LinkedList�� ť�� ��� notificationQueue
		LinkedList<Notification> notificationQueue = new LinkedList<Notification>();
		
		//ť�� ������ �߰�(offer)
		notificationQueue.offer(new Notification("Email","Alex"));
		notificationQueue.offer(new Notification("DM","Robert"));
		notificationQueue.offer(new Notification("KakaoTalk","Rita"));
		
		
		//ť���� ������ ������ (poll)   
		while(!notificationQueue.isEmpty()) {
			Notification notification = notificationQueue.poll();
			
			switch (notification.action) { //�ӵ��� ���� switch�� �����.
			case "Email": 
				System.out.println(notification.name+"���� "+notification.action +"�� �����߽��ϴ�.");
				break;
			case "DM": 
				System.out.println(notification.name+"���� "+notification.action +"�� �����߽��ϴ�.");
				break;
			case "KakaoTalk": 
				System.out.println(notification.name+"���� "+notification.action +"�� �����߽��ϴ�.");
				break;		
			}
		}
		
	}
}
