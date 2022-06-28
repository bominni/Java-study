package kr.hs.dgsw.java.dept1.d0627.rockscissorspaper;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		boolean num = true;
		System.out.println("--------------------------------------");
		System.out.println("           가위 바위 보 게임 시작!           ");
		System.out.println("--------------------------------------");
		String[] str = { "가위", "바위", "보" };
		int win = 0, tie = 0, lose = 0;
		
		while(num) {
			System.out.println("가위 바위 보 중에 하나를 선택하세요. quit를 입력하면 종료입니다.");
			System.out.printf("무엇을 내시겠습니까? - ");
			String user = sc.next();
			int computer = ran.nextInt(3);
			String Computer = str[computer];
			
            if(user.equals("가위")) {
            	if(Computer == str[0]) {
            		System.out.println("가위 vs 가위 : 무승부입니다.");
            		tie++;
            	}
            	else if(Computer == str[1]) {
            		System.out.println("가위 vs 바위 : 당신이 졌습니다.");
            		lose++;
            	}
            	else {
            		System.out.println("가위 vs 보 : 당신이 이겼습니다.");
            		win++;
            	}
            	System.out.println("전적 : " + win + "승 " + tie + "무 " + lose + "패");
        		System.out.println();
            }
            else if(user.equals("바위")) { // 가위 바위 보
            	if(Computer == str[0]) {
            		System.out.println("바위 vs 가위 : 당신이 이겼습니다.");
            		win++;
            	}
            	else if(Computer == str[1]) {
            		System.out.println("바위 vs 바위 : 무승부입니다.");
            		tie++;
            	}
            	else {
            		System.out.println("바위 vs 보 : 당신이 졌습니다.");
            		lose++;
            	}
            	System.out.println("전적 : " + win + "승 " + tie + "무 " + lose + "패");
        		System.out.println();
            }
	        else if(user.equals("보")){ // 가위 바위 보
	        	if(Computer == str[0]) {
            		System.out.println("보 vs 가위 : 당신이 졌습니다.");
	        		lose++;
	        	}
	        	else if(Computer == str[1]) {
            		System.out.println("보 vs 바위 : 당신이 이겼습니다.");
	        		win++;
	        	}
	        	else {
            		System.out.println("보 vs 보 : 무승부입니다.");
	        		tie++;
	        	}
            	System.out.println("전적 : " + win + "승 " + tie + "무 " + lose + "패");
        		System.out.println();
	        }
	        else if(user.equals("quit")){
	        	System.out.println("프로그램을 종료합니다.");
	        	num = false;
	        }
        }
	}
}
