package kr.hs.dgsw.java.dept1.d0420;

public class Child extends Parent {
	
	protected int age;

	public static void main(String[] args) {
		
		Child child = new Child();
		child.name = "홍길동";
		child.age = 18;
		//child.weight = 50;
		child.sayHello();
		
		Parent parent = new Parent();
		parent.name = "손민";
		//parent.age = 18;
		parent.sayHello();
	}
	
}
