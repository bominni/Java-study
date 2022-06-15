package kr.hs.dgsw.java.dept1.d0613.phonebook;

import java.util.Map;
import java.util.Scanner;

public class Delete { // 삭제하기
	
	private Scanner sc;
	private Map<String, Registration> phoneBookMap;
	
	private void delete() {
		System.out.println();
		System.out.println("삭제할 전화번호 정보를 입력하세요");
		System.out.print("이 름 : ");
		String name = sc.next();
		
		// remove(key) => 삭제 성공하면 삭제된 value값만 반환하고, 실패하면 null 반환
		if(phoneBookMap.remove(name) == null) {
			System.out.println(name + " 씨는 등록된 사람이 아닙니다.");
		} else {
			System.out.println(name + " 씨의 정보를 삭제했습니다.");
		}
		System.out.println("삭제 작업 완료...");
	}

}
