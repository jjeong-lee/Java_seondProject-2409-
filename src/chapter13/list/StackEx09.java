package chapter13.list;

import java.util.Stack;

public class StackEx09 {

	/*
	 * Stack은 Vector를 상속받았기 때문에 동기화된 메서드를 제공한다.
	 * 즉, 멀티스레드 환경에서도 여러 스레드가 동시에 스택에 접근할 때
	 * 데이터 무결성을 보장할 수 있다.
	 * 하지만 단일 스레드 환경에서 사용 시 불필요한 성능 저하가 발생할 수 있다.
	 */
	
	public static void main(String[] args) {
		
		//Stack객체 생성
		Stack<Integer> stack = new Stack<>();  //<Integer>생략가능
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		//Stack의 맨 위 데이터 확인(peek)
		System.out.println("Stack의 맨 위 요소 : "+stack.peek());
		
		//Stack에서 데이터 출력(pop)
		System.out.println("꺼낸 데이터 : "+ stack.pop());
		
		System.out.println("Stack의 현재 요소 : "+stack.peek());
		System.out.println("꺼낸 데이터 : "+ stack.pop());
		
		System.out.println("Stack의 현재 요소 : "+stack.peek());
		
		//stack이 비어있는지 확인
		System.out.println("Stack이 비어 있나요? : "+stack.isEmpty()); //false
		
		//stack의 마지막 데이터 출력
		System.out.println("꺼낸 데이터 : "+ stack.pop());
		System.out.println("Stack이 비어 있나요? : "+stack.isEmpty()); //true
		
		
	}

}
