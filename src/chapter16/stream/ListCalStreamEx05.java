package chapter16.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ListCalStreamEx05 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		//합계 구하기
		int sum = numbers.stream()
				.mapToInt(Integer::intValue)
				.sum();
		//평균 구하기
		OptionalDouble average = numbers.stream()
				.mapToInt(Integer::intValue)
				.average();
		
		
		System.out.println("Sum: "+sum);
		average.ifPresent(avg->System.out.println("Average : "+avg));
	}
}
