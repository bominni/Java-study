package kr.hs.dgsw.java.dept1.d0406;

import java.util.Scanner;

public class Problem_divisor2 {
	
private final Scanner scanner;
	
	public Problem_divisor2() {
		this.scanner = new Scanner(System.in);
	}

	public String findAliquots(int value) {
		StringBuilder buffer = new StringBuilder();
		
		for (int i = 1 ; i <= (value / 2) ; i++) {
			if (value % i == 0) {
				buffer.append(i).append(", ");
			}
		}
		
		buffer.append(value);
		
		return buffer.toString();
	}
	
	public int inputValue() {
		System.out.println("정수를 입력하세요.");
		return scanner.nextInt();
	}
	
	public void printResult(int value, String valuesStr) {
		System.out.printf("%d의 약수는 %s 입니다.", value, valuesStr);
	}
	
	public void close() {
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		
		Problem_divisor2 problem_divisor2 = new Problem_divisor2();
		int value = problem_divisor2.inputValue();
		String findingValues = problem_divisor2.findAliquots(value);
		problem_divisor2.printResult(value, findingValues);
	
	}
}
