package chapter11;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(10);
		tv.search("www.naver.com");
		tv.turnOff();
		System.out.println("-----------------------------");
		
		Remote rc =tv;
		rc.turnOn();
		rc.setVolume(-5);
		rc.turnOff();
		
		Searchable searchable = tv;
		searchable.search("www.naver.com");
		/*이건 불가능함.
		searchable.turnOn();
		searchable.setVolume(10);
		searchable.turnOff();
		*/
		
		
	}
	
}
