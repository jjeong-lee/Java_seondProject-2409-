package chapter13.generic;

public class GeneralNoGenericMainEx01 {

	
	public static void main(String[] args) {
	
		GeneralNoGenericEX01 general = new GeneralNoGenericEX01();
		
		//정수형 배열
		Integer[] iArr = {10,20,30,40,50};
		general.printIntArr(iArr);
		
		Double[] dArr = {10.1,20.2,30.3,40.4,50.5};
		general.printDoubleArr(dArr);
		
		Character[] CArr = {'A','B','C','D','E'};
		general.printCharArr(CArr);
		
	}
}
