package chapter16.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListStreamMainEx03 {
	
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
		
		List<String> filterNames=names.stream().filter(name->name.length()>3)//길이가 3보다 큰 문자열 필터링
				.map(String::toUpperCase)//대문자로 변환
				.collect(Collectors.toList());//리스트로 다시 수집

		System.out.println(filterNames);
	
	}
}
