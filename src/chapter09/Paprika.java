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
	
	//������
	
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
		System.out.println("�з�: "+sort);
		System.out.println("����: "+season);
		//�θ�Ŭ������ �⺻ ������ (super)�� �̿��� ����
		System.out.println("�̸�: "+super.name);
		System.out.println();
	}
	public void Disp2() {
		System.out.println("====paprika====");
		System.out.println("����: "+color);
		System.out.println("����: "+price);
		System.out.println("�̸�: "+name);
		System.out.println();
	}
	
	
}
