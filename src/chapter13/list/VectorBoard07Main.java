package chapter13.list;

import java.util.List;
import java.util.Vector;

public class VectorBoard07Main {

	public static void main(String[] args) {
		
		List<Board> list= new Vector<Board>();
		
		
		//내용추가 
		Board b = new Board("제목1","내용1","글쓴이1");
		
		list.add(b);
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
		//내용 삭제
		list.remove(2);
		System.out.println();
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
	
		
		
	}

}
