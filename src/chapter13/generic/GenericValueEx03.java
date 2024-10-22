package chapter13.generic;

public class GenericValueEx03<T> {

	//필드
	T value;
	
	//생성자
	
	//메서드
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value=value;
	}
	
}
