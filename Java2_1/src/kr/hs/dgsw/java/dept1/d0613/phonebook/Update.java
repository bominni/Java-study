package kr.hs.dgsw.java.dept1.d0613.phonebook;

import java.util.Map;
import java.util.Scanner;

public class Update { // 수정하기
	
	private Scanner sc;
	private Map<String, Registration> phoneBookMap;
	
	private void update() {
		System.out.println();
		System.out.println("새롭게 수정할 전화번호 정보를 입력하세요");
		System.out.print("이름 : ");
		String name = sc.next();
		
		// 수정할 자료가 있는지 검사
		if(phoneBookMap.get(name) == null) {
			System.out.println(name + " 씨는 전화번호 정보가 없습니다.");
			return; //메서드 종료
		}
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		Registration registration = new Registration(name, phone);
		phoneBookMap.put(name, registration);

		System.out.println(name + " 씨 수정 완료...");
		
	}

}
