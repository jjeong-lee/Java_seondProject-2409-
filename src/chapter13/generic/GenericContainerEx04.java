package chapter13.generic;

public class GenericContainerEx04<T> {

	private T[] items; //int[] i;
	private int count; 
	
	//기본생성자 생략
	
	public GenericContainerEx04(int size) {
		items=(T[])new Object[size];
		count = 0;
		
	}
	
	//아이템을 추가하는 제네릭 메서드
	public void addItem(T item) {
		
		if(count<items.length) {
			//items[count]=item;
			//count++;
			items[count++]=item; //줄인 코드
		}else {
			System.out.println("Container is full.");
		}
	}//additem
	
	public void printItems() {
		for(int i=0; i<count; i++) {
			System.out.print(items[i]+" ");
		}
		System.out.println();
	}
	//타입 제한을 사용하여 숫자형 데이터에 대한 합계를 구할 수 있음
	public <E extends Number> double sum(E[] numbers) {
		double total =0;
		for(E number : numbers) {
			total+=number.doubleValue();
		}
		return total;		
	}//sum
	
	
}
