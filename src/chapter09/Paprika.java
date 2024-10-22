package chapter09;

public class Paprika extends Vegetable{

	private String color;
	private int price;
	private String name;
	/*
	String sort;
	String season;
	String name;
	*/
	
	//생성자
	
	//setter
	/*
	 * public void Set1(String sort, String season, String name) {
		this.sort=sort;
		this.season=season;
		this.name=name;
	}
	*/
	public void Set2(String a, int b, String c) {
		color=a;
		price=b;
		name=c;
	}
	
	public void Disp1() {
		System.out.println("====paprika====");
		System.out.println("분류: "+sort);
		System.out.println("계절: "+season);
		//부모클래스의 기본 생성자 (super)를 이용한 선언
		System.out.println("이름: "+super.name);
		System.out.println();
	}
	public void Disp2() {
		System.out.println("====paprika====");
		System.out.println("색깔: "+color);
		System.out.println("가격: "+price);
		System.out.println("이름: "+name);
		System.out.println();
	}
	
	
}
