package chapter13.list;

public class BookEx02 {

	
	private int bookId;
	private String bookTitle;
	
	
	public BookEx02() {
		
	}

	public BookEx02(int bookId, String bookTitle) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}
	
	
	//getter and setter
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	//toString 메서드의 정의
	
	@Override
	public String toString() {
		return "책제목: "+bookTitle+" (ID: "+getBookId()+")";
	}
	
}
