package chapter11;

public interface Remote  {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 10;
	
	//추상메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
}
