package chapter11;

public class SmartTelevision implements Remote, Searchable{

	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
		
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
		
	}
	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume =MAX_VOLUME;
			System.out.println("������ �ִ��Դϴ�");
		}else if(volume < MIN_VOLUME) {
			this.volume =MIN_VOLUME;
			System.out.println("������ �ּ��Դϴ�");
		}else {
			this.volume=volume;
			System.out.println("���� VOLUME : "+volume);
		}
	}

	
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�");
	}
	
	
	
}
