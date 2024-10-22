package chapter13.list;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArrayListEx02 {

	//ArrayList  booklist ����
	private ArrayList<BookEx02> bookList;
	
	public BookArrayListEx02() {
		bookList=new ArrayList<BookEx02>();
	}
	
	//å �߰� �޼���
	public void addBook(BookEx02 book) {
		bookList.add(book);
	}
	
	//å ���� �޼���
	public boolean removeBook(int bookId) {
		Iterator<BookEx02> it = bookList.iterator();
		
		while(it.hasNext()) {
			BookEx02 book = it.next();
			int tempId=book.getBookId();
			if(tempId == bookId) {
				bookList.remove(book);
				System.out.println("ID "+bookId+"�� å�� ���� �Ǿ����ϴ�.");
				return true;
			} //����ó��
		}//while
		System.out.println("ID "+ bookId+"�� å�� �������� �ʽ��ϴ�.");
		return false;
	}//removeBook
	
	//��� å ���� ��� �޼���
	public void showAllBooks() {
		
		for(BookEx02 book:bookList) {
			System.out.println(book);
		}System.out.println();
		
		
	}
	
	
	
	
}
