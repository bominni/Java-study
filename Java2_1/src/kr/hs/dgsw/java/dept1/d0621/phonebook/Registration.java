package kr.hs.dgsw.java.dept1.d0621.phonebook;

import java.util.List;
import java.util.Scanner;

public class Registration {
	
	static void registration(Scanner sc, List<NumberInfo> number) { // 등록하기
		String name;
		String phone;
		System.out.printf("이름 : ");
		name = sc.next();
		System.out.printf("전화번호 : ");
		phone = sc.next();
		number.add(new NumberInfo(name, phone));
		System.out.println();
		System.out.println("등록되었습니다.");
	}

}
