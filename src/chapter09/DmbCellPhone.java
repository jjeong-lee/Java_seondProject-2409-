package chapter09;

public class DmbCellPhone extends CellPhone{

	//멤버변수
	int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;	
		this.channel = channel;
	}
	
	//메서드
	void turnOnDmb() {
		System.out.println("채널 "+ channel + "번 DMB방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
	
	
	
}
