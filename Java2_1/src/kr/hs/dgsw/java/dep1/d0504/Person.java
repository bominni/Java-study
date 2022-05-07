package kr.hs.dgsw.java.dep1.d0504;

public class Person implements  Printer {
	protected String name;
	
	public void sayHello() {
		System.out.println(name + "님 안녕하세요.");
	}
	
	@Override
	public void print() {
		System.out.println("나의 이름은 " + name + "입니다.");
	}
	
	@Override
	public void print(String value) {
		this.print();
		System.out.println("나의 친구의 이름은 " + value + "입니다.");
	}
	
	public static void main(String[] ars) {
		Person person = new Person();
		person.name = "유재석";
		person.sayHello();
		person.print();
		person.print("강호동");
		
		Printer person1 = new Person();
		// person1.name = "이효리"; //person이라는 함수안에는 name이라는게 없어서 오류남.
		// person1.sayHello(); //person이라는 함수안에는 sayHello라는게 없어서 오류남.
		person1.print();
		person1.print("아이유");
	}
}
