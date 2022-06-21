package kr.hs.dgsw.java.dept1.d0621.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Delete {
	
	static void delete(Scanner sc, List<NumberInfo> number) { // 삭제하기
		String delete = sc.next();
		List<NumberInfo> tempList = new ArrayList<NumberInfo>(); // tempList라는 리스트를 만든다.
        for(int i=0; i < number.size(); i++) { // number의 size만큼 for문을 돈다.
            if(number.get(i).getName().equals(delete)) { // 사용자가 입력한 이름이 i번째 값에 있는지 학인
            		tempList.add(number.get(i)); // 있으면 출력
            }
        }
		if(tempList.size() == 0) { // 한개도 없다면
			System.out.println("존재하지 않습니다."); // 존재하지 않는다고 출력한다.
			return;
		}
		else if(tempList.size() == 1) { // 한개라면
			number.remove(tempList.get(0)); // 출력
		}
		else { // 아니면
			for(int i=0;i < tempList.size(); i++) { // tempList의 size만큼 for문을 돈다.
				System.out.println(i+1 + ". " + tempList.get(i).getName() + " " + tempList.get(i).getPhone());
			}
			System.out.printf("중복된 이름이 있습니다. 전화번호를 입력하세요 : ");
			String Phonedelete = sc.next();
			for(int i=0; i < tempList.size(); i++) { // tempList의 size만큼 for문을 돈다.
	            if(tempList.get(i).getPhone().equals(Phonedelete)) { // 사용자가 입력한 폰번호가 i번째 있는지 확인
	            	number.remove(tempList.get(i)); // 있다면 삭제
	        		System.out.println("삭제되었습니다.");
	            	return;
	            }
			}
			System.out.println("전화번호가 존재하지 않습니다.");
		}
	}

}
