package kr.hs.dgsw.java.dept1.d0330;

import java.util.Scanner;

public class ScannerStudy {
	
	private final Scanner scanner;
	
	public ScannerStudy() {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		
		String input = null;
		int value = 0;
		
		//while (true) 
		{
			System.out.println("딘어를 입력하세요.");
			input = this.scanner.next();
			System.out.printf("당신은 '%s'을 입력하셨습니다.\n\n", input);
			
			System.out.println("정수를 입력하세요.");
			value = this.scanner.nextInt();
			System.out.printf("%d의 제곱은 %d입니다.\n\n", value, (value * value));

//			System.out.println(" 정수를 입력하세요.");
//			String input1 = this.scanner.next();
//			
//			System.out.println(" 정수를 입력하세요.");
//			String input2 = this.scanner.next();
//			
//			String result = input1 + input2;
//			System.out.println("결과 : " + result);
		}
		this.scanner.close();
	}
	
	public static void main(String[] args) {
		ScannerStudy scannerStudy = new ScannerStudy();
		scannerStudy.execute();
	}
}
