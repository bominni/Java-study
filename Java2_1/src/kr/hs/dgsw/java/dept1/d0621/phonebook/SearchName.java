package kr.hs.dgsw.java.dept1.d0621.phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SearchName {
	
	static void searchname(Scanner sc, List<NumberInfo> number, String str) { // 이름으로 검색하기
		List<NumberInfo> temp = new ArrayList<>(); // 임의의 temp라는 리스트를 만든다.
		for(int i=0; i<number.size(); i++) { // number의 size만큼 for문을 돈다.
			NumberInfo searchnumber = (NumberInfo) number.get(i); // number라는 list안에 i번째의 값을 들고온다.
			if(searchnumber.getName().contains(str)) { // 사용자가 입력한 이름이 i번째 값에 포함되는지 확인
				temp.add(searchnumber); // 포함되면 임시 list에 저장
			}
		}
		if(temp.size() == 0) { // 한개도 없다면
			System.out.println("존재하지 않습니다."); // 존재하지 않는다고 출력한다.
		}
		else if(temp.size() == 1) { // 한개라면
			System.out.println(temp.toString()); // 출력
		}
		else { // 2개 이상이라면
			Collections.sort(temp, new Comparator<NumberInfo>() { // temp를 sort를 활용해 정렬
    			@Override
    		    public int compare(NumberInfo num1, NumberInfo num2) {
    		        return num1.getName().compareTo(num2.getName()); // num1과 num2를 비교해서 return 해준다.
    		    }
    		});
			for(int i=0; i<temp.size(); i++) {
				System.out.println(i+1 + ". " + temp.get(i).getName() + " " + temp.get(i).getPhone());
			}
		}
	}

}
