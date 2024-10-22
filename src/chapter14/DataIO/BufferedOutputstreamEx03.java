package chapter14.DataIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputstreamEx03 {

	public static void main(String[] args) {
		
		String filePath = "buffered_output.dat"; // ������ ���� ���

        // BufferedOutputStream�� ����Ͽ� ������ ����
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            bos.write("Buffered Output Example".getBytes());  //.getBytes():���̳ʸ� ���Ϸ� ����ȯ
            bos.flush(); // ������ ������ ������ ���
        } catch (IOException e) {
            e.printStackTrace();
        }       
        System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
		
	}
}
