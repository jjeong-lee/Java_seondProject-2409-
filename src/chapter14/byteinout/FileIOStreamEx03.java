package chapter14.byteinout;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStreamEx03 {

	public static void main(String[] args) {

		String data = "Hello, this is a test of FileInputStream and FileOutputStream.";
		String filePath = "IOStream.txt";
		
		
		//FileOutputStream을 사용하여 파일에 데이터 쓰기
		try (FileOutputStream out = new FileOutputStream(new File(filePath))){
			out.write(data.getBytes());
			System.out.println("파일 내용 입력이 완료되었습니다.");
			
		} catch (Exception e) {
			System.out.println("파일 입력 오류: "+e.getMessage());
		}
		System.out.println("=============================================");
		
		// FileInputStream을 사용하여 파일에서 데이터 읽기
		try (FileInputStream in = new FileInputStream(filePath)){
			System.out.println("파일 읽어오기");
			int dataread;
	
			while((dataread=in.read()) != -1) {
				System.out.print((char)dataread);
			}
		} catch (Exception e) {
			System.out.println("파일 입력 오류: "+e.getMessage());
		}
		
		
	}
}
