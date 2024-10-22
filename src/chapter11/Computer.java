package chapter11;

public abstract class Computer {

	public abstract void display(); //추상메서드(body가 없는 메서드)
	public abstract void typing(); //추상메서드(body가 없는 메서드)
	
	
	//일반 메서드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
