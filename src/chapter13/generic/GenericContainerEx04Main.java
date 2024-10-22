package chapter13.generic;

public class GenericContainerEx04Main {

	public static void main(String[] args) {
		// ���ڿ� �����͸� �����ϴ� Container
		GenericContainerEx04<String> stringContainer = new GenericContainerEx04<String>(5);

		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");
		System.out.print("String Container : ");
		stringContainer.printItems();

		// Ÿ���������� String �������� ����
		// String[] StringArray= {"1","2","3","4","5"};
		// stringContainer.sum(StringArray);

		// ���� �����͸� �����ϴ� Container
		System.out.println();

		GenericContainerEx04<Integer> integerContainer = new GenericContainerEx04<Integer>(5);

		integerContainer.addItem(10);
		integerContainer.addItem(20);
		integerContainer.addItem(30);
		System.out.print("Integer Container : ");
		integerContainer.printItems();
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of int array: " + integerContainer.sum(intArray));

		// �Ǽ� �����͸� �����ϴ� Container
		GenericContainerEx04<Double> doubleContainer = new GenericContainerEx04<Double>(4);

		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		System.out.println("Sum of double array : " + doubleContainer.sum(doubleArray));

	}

}
