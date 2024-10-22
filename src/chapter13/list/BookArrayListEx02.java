package chapter13.list;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArrayListEx02 {

	//ArrayList  booklist 선언
	private ArrayList<BookEx02> bookList;
	
	public BookArrayListEx02() {
		bookList=new ArrayList<BookEx02>();
	}
	
	//책 추가 메서드
	public void addBook(BookEx02 book) {
		bookList.add(book);
	}
	
	//책 삭제 메서드
	public boolean removeBook(int bookId) {
		Iterator<BookEx02> it = bookList.iterator();
		
		while(it.hasNext()) {
			BookEx02 book = it.next();
			int tempId=book.getBookId();
			if(tempId == bookId) {
				bookList.remove(book);
				System.out.println("ID "+bookId+"번 책이 삭제 되었습니다.");
				return true;
			} //예외처리
		}//while
		System.out.println("ID "+ bookId+"번 책이 존재하지 않습니다.");
		return false;
	}//removeBook
	
	//모든 책 정보 출력 메서드
	public void showAllBooks() {
		
		for(BookEx02 book:bookList) {
			System.out.println(book);
		}System.out.println();
		
		
	}
	
	
	
	
}
