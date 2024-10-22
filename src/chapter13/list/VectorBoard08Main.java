package chapter13.list;

import java.util.List;
import java.util.Vector;

public class VectorBoard08Main {

	public static void main(String[] args) {
		
		// Vector 리스트 생성(동기화된 리스트)
		List<Board> list = new Vector<Board>();
		
		
		//첫번째 스레드 : 데이터를 추가하는 작업
		Thread thread1 = new Thread(()  -> {
				for (int i = 1; i <= 5; i++) {
	                 list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
	                 System.out.println(Thread.currentThread().getName() + " - 데이터 추가: 제목" + i);
	                 try {
	                     Thread.sleep(50); // 추가 후 대기
	                 } catch (InterruptedException e) {
	                     e.printStackTrace();
	                 }
	             }

      	},"Thread1");
		
		
		//첫번째 스레드 : 데이터를 삭제하는 작업
		Thread thread2 = new Thread(()  -> {
			
			try {
				Thread.sleep(100);//처음부터 삭제하지 않도록 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for (int i = 0; i < 2; i++) {
                if (list.size() > 0) {
                    Board board = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + " - 데이터 삭제: " + board.subject);
                }
                try {
                    Thread.sleep(100); // 삭제 후 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
		
		},"Thread2");
		
		//두 스레드 실행
		thread1.start();
		thread2.start();
		
		//스레드 완료 대기
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//최종 리스트 출력
		System.out.println("\n최종 리스트 상태:");
        for (Board board : list) {
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
        }
	}
}
