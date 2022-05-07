package kr.hs.dgsw.java.det1.d0330;

public class Cat {
	private String name;
	private String color;
	private double weight;
	
	public Cat(String name) {
		this(name, "검정", 8.0);
	}
	
	public Cat(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	public void print() {
		System.out.printf("%s는 색깔은 %s이고 몸무게는 %.1f입니다.\n", this.name, this.color, this.weight);
	}
	
	public static void main(String[] args) {
		Cat bbo = new Cat("뽀", "흰색", 7.2);
		bbo.print();
		Cat ddo = new Cat("뚜");
		ddo.print();
	}
}
