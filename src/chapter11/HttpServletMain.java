package chapter11;

public class HttpServletMain {

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
	
	
	public static void main(String[] args) {
		
		
		
		method(new LoginServlet());
		method(new FileDownloadServlet());
		
	}
	
}
