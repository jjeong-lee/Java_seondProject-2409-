package chapter13.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMessageEx11Main {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		//offer�� �Է�
		messageQueue.offer(new Message("�ֹ鼳","Mail"));
		messageQueue.offer(new Message("��Ƹ�","SMS"));
		messageQueue.offer(new Message("�ڼ���","Kakaotalk"));
		
		
		//poll�� ���
		while(!messageQueue.isEmpty()) {
			Message message =messageQueue.poll(); //message.to, message.command
			
			switch (message.to) {
			case "�ֹ鼳": 
				System.out.println(message.to+ "���� "+message.command+"�� �����߽��ϴ�.");
				break;
			case "��Ƹ�": 
				System.out.println(message.to+ "���� "+message.command+"�� �����߽��ϴ�.");
				break;
			case"�ڼ���":
				System.out.println(message.to+ "���� "+message.command+"�� �����߽��ϴ�.");
				break;
			
		}//switch
		}//while
		
		
		
	}//main
}//class
