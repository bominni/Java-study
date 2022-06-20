package kr.hs.dgsw.java.dept1.d0621.phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PhoneBookMain {
	static final String rootPath = System.getProperty("user.dir") + "\\test\\";
	static final String address = rootPath + "DBmanager.txt";
	private static String searchstr;
	private static String searchstr2;
	
	public static void main(String[] args) {
		List<NumberInfo> number = new ArrayList<>();
		run(number);
	}
	
	private static void run(List<NumberInfo> number) {
		boolean answer = true;
		int num = 0;
		System.out.println("----------------------------------------------------------------------");
		System.out.println("                             전화번호부 프로그램                             ");
		System.out.println("----------------------------------------------------------------------");
		
		while(answer) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 목록보기 | 2. 등록하기 | 3. 이름으로 검색하기 | 4. 전화번호로 검색하기 | 5. 삭제하기");
			System.out.printf("실행시킬 메뉴 선택 - ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println();
				System.out.println("목록보기를 실행하겠습니다.");
				showInfo(number);
				break;
			case 2:
				System.out.println();
				System.out.println("등록하기를 실행하겠습니다.");
				registration(sc, number);
				break;
			case 3:
				System.out.println();
				System.out.println("검색하기를 실행하겠습니다.");
				System.out.printf("이름의 일부분을 입력하세요 : ");
				searchstr = sc.next();
				searchname(sc, number, searchstr);
				break;
			case 4:
				System.out.println();
				System.out.println("검색하기를 실행하겠습니다.");
				System.out.printf("전호번호의 일부분을 입력하세요 : ");
				searchstr2 = sc.next();
				searchphone(sc, number, searchstr2);
				break;
			case 5:
				System.out.println("삭제하기를 실행하겠습니다.");
				System.out.printf("삭제할 사람을 입력하세요 : ");
				delete(sc, number);
				break;
			}
		}
	}

	private static void searchname(Scanner sc, List<NumberInfo> number, String str) { // 이름으로 검색하기
		List<NumberInfo> temp = new ArrayList<>();
		for(int i=0; i<number.size(); i++) {
			NumberInfo serchnumber = (NumberInfo) number.get(i);
			if(serchnumber.getName().contains(str)) {
				temp.add(serchnumber);
			}
		}
		if(temp.size() == 0) {
			System.out.println("존재하지 않습니다.");
		}
		else if(temp.size() == 1) {
			System.out.println(temp.toString());
		}
		else {
			Collections.sort(temp, new Comparator<NumberInfo>() {
    			@Override
    		    public int compare(NumberInfo num1, NumberInfo num2) {
    		        return num1.getName().compareTo(num2.getName());
    		    }
    		});
			for(int i=0; i<temp.size(); i++) {
				System.out.println(i+1 + ". " + temp.get(i).getName() + " " + temp.get(i).getPhone());
			}
		}
	}
	
	private static void searchphone(Scanner sc, List<NumberInfo> number, String str) { // 전화번호로 검색하기
		List<NumberInfo> temp = new ArrayList<>();
		for(int i=0; i<number.size(); i++) {
			NumberInfo serchnumber = (NumberInfo) number.get(i);
			if(serchnumber.getPhone().contains(str)) {
				temp.add(serchnumber);
			}
		}
		if(temp.size() == 0) {
			System.out.println("존재하지 않습니다.");
		}
		else if(temp.size() == 1) {
			System.out.println(temp.toString());
		}
		else {
			Collections.sort(temp, new Comparator<NumberInfo>() {
    			@Override
    		    public int compare(NumberInfo num1, NumberInfo num2) {
    		        return num1.getName().compareTo(num2.getName());
    		    }
    		});
			for(int i=0; i<temp.size(); i++) {
				System.out.println(i+1 + ". " + temp.get(i).getName() + " " + temp.get(i).getPhone());
			}
		}
	}
	
	private static void delete(Scanner sc, List<NumberInfo> number) { // 삭제하기
		String delete = sc.next();
		List<NumberInfo> tempList = new ArrayList<NumberInfo>(); 
        for(int i=0; i < number.size(); i++) {
            if(number.get(i).getName().equals(delete)) {
            		tempList.add(number.get(i));
            }
        }
		if(tempList.size() == 0) {
			System.out.println("존재하지 않습니다.");
			return;
		}
		else if(tempList.size() == 1) {
			number.remove(tempList.get(0));
		}
		else {
			for(int i=0;i < tempList.size(); i++) {
				System.out.println(i+1 + ". " + tempList.get(i).getName() + " " + tempList.get(i).getPhone());
			}
			
			System.out.printf("중복된 이름이 있습니다. 전화번호를 입력하세요 : ");
			String Phonedelete = sc.next();
			for(int i=0; i < tempList.size(); i++) {
	            if(tempList.get(i).getPhone().equals(Phonedelete)) {
	            	number.remove(tempList.get(i));
	        		System.out.println("삭제되었습니다.");
	            	return;
	            }
			}
			System.out.println("전화번호가 존재하지 않습니다.");
		}
	}
	
	private static void showInfo(List<NumberInfo> number) { // 목록보기
		Collections.sort(number, new Comparator<NumberInfo>() {
			@Override
		    public int compare(NumberInfo num1, NumberInfo num2) {
		        return num1.getName().compareTo(num2.getName());
		    }
		});
		for(int i=0; i<number.size(); i++) {
			System.out.println(i+1 + ". " + number.get(i).getName() + " " + number.get(i).getPhone());			
		}
	}
	
	private static void registration(Scanner sc, List<NumberInfo> number) { // 등록하기
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
