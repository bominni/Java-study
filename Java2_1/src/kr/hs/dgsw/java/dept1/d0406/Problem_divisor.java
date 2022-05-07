package kr.hs.dgsw.java.dept1.d0406;
import java.util.*;

public class Problem_divisor {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		System.out.printf("%d의 약수는 ", num1);
		for(int i = 1; i<num1; i++) {
			if(num1 % i == 0) {
				System.out.printf("%d,", i);
			}
		}
		System.out.printf("%d 입니다.\n", num1);
		
		scanner.close();
	}
}
