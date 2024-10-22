package chapter10;

public class AnimalMain {

	
	public static void main(String[] args) {
		
		System.out.println("====곰====");
		Bear b = new Bear();
		System.out.println("눈 : "+b.getEye());
		System.out.println("다리 : "+b.getLeg());
		System.out.println("특이사항 : "+b.woong);
		
		System.out.println("====사자====");
		Lion lion = new Lion();
		System.out.println("눈 : "+lion.getEye());
		System.out.println("다리 : "+lion.getLeg());
		System.out.println("특이사항 : "+lion.galgi);
		
		
		System.out.println("====거미====");
		Spider sp = new Spider();
		System.out.println("눈 : "+sp.getEye());
		System.out.println("다리 : "+sp.getLeg());
		System.out.println("특이사항 : "+sp.web);
		
		
		
		
	}
	
}
