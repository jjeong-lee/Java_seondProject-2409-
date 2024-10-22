package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속 받은 필드
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);

		//DmbCellPhone의 필드
		System.out.println("채널 : "+ dmbCellPhone.channel);
		
		//Cellphone으로부터 상속받은 메서드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 솔데스크입니다.");
		dmbCellPhone.sendVoice("프로젝트 발표가 언제인가요?");
		dmbCellPhone.hangup();
		
		
		//DmbCellPhone의 메서드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(15);
		dmbCellPhone.turnOffDmb();
		
		
	}

}
