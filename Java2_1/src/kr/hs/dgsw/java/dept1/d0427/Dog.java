package kr.hs.dgsw.java.dept1.d0427;

public class Dog extends Animal {

	@Override
	public String makeSound() {
		//return super.makeSound();
		return "멍멍";
	}
	
	@Override
	public String getName() {
		return "강아지";
	}
	
}
