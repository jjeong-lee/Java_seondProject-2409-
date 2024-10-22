package chapter13.generic;

public class GenericContainerEx04Main {

	public static void main(String[] args) {
		// 문자열 데이터를 저장하는 Container
		GenericContainerEx04<String> stringContainer = new GenericContainerEx04<String>(5);

		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");
		System.out.print("String Container : ");
		stringContainer.printItems();

		// 타입제한으로 String 제한조건 적용
		// String[] StringArray= {"1","2","3","4","5"};
		// stringContainer.sum(StringArray);

		// 정수 데이터를 저장하는 Container
		System.out.println();

		GenericContainerEx04<Integer> integerContainer = new GenericContainerEx04<Integer>(5);

		integerContainer.addItem(10);
		integerContainer.addItem(20);
		integerContainer.addItem(30);
		System.out.print("Integer Container : ");
		integerContainer.printItems();
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of int array: " + integerContainer.sum(intArray));

		// 실수 데이터를 저장하는 Container
		GenericContainerEx04<Double> doubleContainer = new GenericContainerEx04<Double>(4);

		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		System.out.println("Sum of double array : " + doubleContainer.sum(doubleArray));

	}

}
