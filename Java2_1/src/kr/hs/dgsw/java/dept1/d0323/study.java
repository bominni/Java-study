package kr.hs.dgsw.java.dept1.d0323;

public class study {
	public void studyNumber() {
		int a = 11;
		int b = 3;
		
		System.out.printf("a + b = %d\n", a+b);
		System.out.printf("a * b = %d\n", a*b);
		System.out.printf("a - b = %d\n", a-b);
		System.out.printf("a / b = %f\n", (float)a/b);
	}
	
	public static void main(String[] args) {
		study number = new study();
		number.studyNumber();
	}
}
