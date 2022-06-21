package kr.hs.dgsw.java.dept1.d0621.phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PhoneBookMain {
	static final String rootPath = System.getProperty("user.dir") + "\\test\\"; // 지금 내가 사용하고 있는 폴더 안에있는 test폴터
	static final String address = rootPath + "DBmanager.txt"; // DBmanager.txt안에 저장
	private static String searchstr;
	private static String searchstr2;
	
	public static void main(String[] args) {
		List<NumberInfo> number = new ArrayList<>(); // number이라는 리스트를 만든다.
		run(number); // run에 number을 보낸다.
	}
	
	private static void run(List<NumberInfo> number) {
		boolean answer = true; // answer을 처음엔 true로 둔다.
		int num = 0; // num을 0으로 초기화 시킨다.
		System.out.println("----------------------------------------------------------------------");
		System.out.println("                             전화번호부 프로그램                             ");
		System.out.println("----------------------------------------------------------------------");
		
		while(answer) { // answer가 true이면
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 목록보기 | 2. 등록하기 | 3. 이름으로 검색하기 | 4. 전화번호로 검색하기 | 5. 삭제하기");
			System.out.printf("실행시킬 메뉴 선택 - ");
			num = sc.nextInt(); // 숫자를 입력한다. 1이면 목록 2면 등록 3이면 이름으로 검색 4면 전화번호로 검색 5는 삭제
			
			switch(num) { // num을 넘겨준다.
			case 1: // num이 1이면
				System.out.println();
				System.out.println("목록보기를 실행하겠습니다.");
				showInfo(number); // showInfo에 number을 넘긴다.
				break;
			case 2: // num이 2이면
				System.out.println();
				System.out.println("등록하기를 실행하겠습니다.");
				Registration.registration(sc, number); // registration에 sc랑 number을 넘긴다.
				break;
			case 3: // num이 3이면
				System.out.println();
				System.out.println("검색하기를 실행하겠습니다.");
				System.out.printf("이름의 일부분을 입력하세요 : ");
				searchstr = sc.next(); // searchstr을 스캔
				SearchName.searchname(sc, number, searchstr); // searchname에 sc랑 number랑 위에서 받은 searchstr을 넘긴다.
				break;
			case 4: // num이 4이면
				System.out.println();
				System.out.println("검색하기를 실행하겠습니다.");
				System.out.printf("전호번호의 일부분을 입력하세요 : ");
				searchstr2 = sc.next(); // searchstr2를 스캔
				SearchPhone.searchphone(sc, number, searchstr2); // searchphone에 sc랑 number랑 위에서 받은 searchstr2를 넘긴다.
				break;
			case 5: // num이 5이면
				System.out.println("삭제하기를 실행하겠습니다.");
				System.out.printf("삭제할 사람을 입력하세요 : ");
				Delete.delete(sc, number); // delete에 sc랑 number을 넘긴다.
				break;
			}
		}
	}
	
	private static void showInfo(List<NumberInfo> number) { // 목록보기
		Collections.sort(number, new Comparator<NumberInfo>() { // temp를 sort를 활용해 정렬
			@Override
		    public int compare(NumberInfo num1, NumberInfo num2) {
		        return num1.getName().compareTo(num2.getName()); // num1과 num2를 비교해서 return 해준다.
		    }
		});
		for(int i=0; i<number.size(); i++) {
			System.out.println(i+1 + ". " + number.get(i).getName() + " " + number.get(i).getPhone());			
		}
	}
}
