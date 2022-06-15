package kr.hs.dgsw.java.dept1.d0613.phonebook;

import java.util.Map;
import java.util.Scanner;

public class Search { // 검색하기
	
	private Scanner sc;
	private Map<String, Registration> phoneBookMap;
	
	// 이름으로 전화번호 검색하기
	private void search() {
		System.out.println();
		System.out.println("이름의 일부분을 입력하세요.");
		System.out.println("이름 : ");
		
		String name = sc.next();
		
		Registration registration = phoneBookMap.get(name);
		
		if(registration == null) {
			System.out.println(name + " 가 포함된 이름은 없습니다.");
		} else {
			System.out.println(name + " 가 포함된 이름의 전화번호 목록");
			System.out.println(registration.getName() + "전화번호 : " + registration.getPhone());
		}
		System.out.println("검색 작업 완료....");
	}
	
}
