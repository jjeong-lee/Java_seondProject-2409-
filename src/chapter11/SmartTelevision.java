package chapter11;

public class SmartTelevision implements Remote, Searchable{

	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}
	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume =MAX_VOLUME;
			System.out.println("볼륨이 최대입니다");
		}else if(volume < MIN_VOLUME) {
			this.volume =MIN_VOLUME;
			System.out.println("볼륨이 최소입니다");
		}else {
			this.volume=volume;
			System.out.println("지금 VOLUME : "+volume);
		}
	}

	
	public void search(String url) {
		System.out.println(url+"을 검색합니다");
	}
	
	
	
}
