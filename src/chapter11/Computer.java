package chapter11;

public abstract class Computer {

	public abstract void display(); //�߻�޼���(body�� ���� �޼���)
	public abstract void typing(); //�߻�޼���(body�� ���� �޼���)
	
	
	//�Ϲ� �޼���
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
