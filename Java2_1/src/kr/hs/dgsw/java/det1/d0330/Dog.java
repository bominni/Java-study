package kr.hs.dgsw.java.det1.d0330;

public class Dog {
	private final String name;
	private int age;
	
//	public Dog(String name ,int age) {
//		init(name);
//		this.age = age;
//	}
//	
	public Dog(String name) {
		//Dog(name ,0);
		this.name = name;
		System.out.println("생성자가 호출되었습니다.");
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("생성자가 호출되었습니다.");
	}
	
	public void print() {
		System.out.printf("%s는 나이가 %d살입니다.\n", this.name, this.age);
	}
	
	public String getName() {
		return this.name;
	}
	
//	public String getName(String dummy) {
//		return this.age +"";
//	}
//	
//	public String getName(int hi) {
//		return this.age +"";
//	}
	
	public static void main(String[] args) {
		
		//System.out.println("해피 만들기 전");
		Dog happy = new Dog("해피", 5);
		happy.print();
		//happy.getName("abc");
		//System.out.println("해피 생성됨");
		//System.out.println("해피 만들기 후");
		Dog puppy = new Dog("퍼피", 0);
		
		System.out.println("Count of args : " + args.length);
		for(int i = 0; i < args.length ; i++) {
			System.out.printf("%d - %s\n", i, args[i]);
		}
		
		//final int value = 3;
	}
}
