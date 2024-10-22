package chapter11;

public class InterMenuMain implements Inter_Menu3{

	
	public static void main(String[] args) {
		
		InterMenuMain im = new InterMenuMain();
		System.out.println("===¿ì¸®°¡°Ô ¸Þ´ºÆÇ===");
		Inter_Menu1 im1 = im;//¾÷ Ä³½ºÆÃ
		Inter_Menu2 im2 = im;//¾÷ Ä³½ºÆÃ
		Inter_Menu3 im3 = im;//¾÷ Ä³½ºÆÃ
		System.out.println("=====Inter_Menu1=====");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
		im1.show();
		
		System.out.println("=====Inter_Menu2=====");
		System.out.println(im2.tangsuyuck());
		
		System.out.println("=====Inter_Menu3=====");
		System.out.println(im3.boggembab());
		
		
	}

	@Override
	public String jajang() {
		return "¿¾³¯ Â¥Àå";
	}

	@Override
	public String jjambbong() {
		return "µ¹¹®¾î Â«»Í";
	}

	@Override
	public String tangsuyuck() {
		return "Âý½Ò ÅÁ¼öÀ°";
	}

	@Override
	public String boggembab() {
		return "»çÃµ½Ä ººÀ½¹ä";
	}
}
