package kr.hs.dgsw.java.dept1;

public class Hello {
	
	public void sayHello() {
		//System.out.println("Hello World!"); // println은 줄바꿈을 자동으로 함
		// System.out은 모니터를 가르킴
		sayHello("World!");
	}
	
	public void sayHello(String name) {
		System.out.println("Hello " + name + "!");
	}

}