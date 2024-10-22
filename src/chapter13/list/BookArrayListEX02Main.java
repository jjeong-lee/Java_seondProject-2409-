package chapter13.list;

public class BookArrayListEX02Main {

	public static void main(String[] args) {
		
		/*
		 • 특징: ArrayList는 내부적으로 동적 배열을 사용하여 데이터를 저장한다.
		  		랜덤 액세스 속도가 빠르며, 인덱스를 통해 요소에 빠르게 접근할 수 있다.
		   		삽입이나 삭제가 빈번하지 않은 경우 사용하기 적합하다.
		 • 장점: 요소 접근이 빠름.
		 • 단점: 중간에 요소를 삽입하거나 삭제하는 경우 성능이 저하될 수 있음.
		 */
		
		//BookArrayListEx02 객체 생성
		BookArrayListEx02 bookArrayList = new BookArrayListEx02();
		
		// 책 생성
		BookEx02 book1 = new BookEx02(1001, "자바의 이해");
		BookEx02 book2 = new BookEx02(1002, "SolDesk Python");
		BookEx02 book3 = new BookEx02(1003, "SolDesk Java");
		BookEx02 book4 = new BookEx02(1004, "클린 코드");

		// 책추가
		bookArrayList.addBook(book1);
		bookArrayList.addBook(book2);
		bookArrayList.addBook(book3);
		bookArrayList.addBook(book4);
		
		//모든 책 정보 출력
		System.out.println("===전체 책 목록===");
		bookArrayList.showAllBooks();
		
		//책 삭제
		System.out.println("===클린코드 책 삭제===");
		bookArrayList.removeBook(book4.getBookId());
		
		//삭제 후 책정보
		bookArrayList.showAllBooks();
		
		
		
		
	}

}
