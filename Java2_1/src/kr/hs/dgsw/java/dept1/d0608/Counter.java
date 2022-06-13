package kr.hs.dgsw.java.dept1.d0608;

import java.util.LinkedList;
import java.util.Queue;

public class Counter {
	
	private Queue<String> list = new LinkedList<String>();

	public void hireEnginners() {
		for(int i=0; i<10; i++) {
			Engineer engineer = new Engineer(this);
			new Thread(engineer).start();
		}
	}
	
	public void acceptRequirement(String problem) {
		list.add(problem);
		
		synchronized(this) {
			this.notify();
		}
	}
	
	public String getProblem() {
		return list.poll();
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("서비스센터를 개설합니다.");
		Counter counter = new Counter();
		counter.hireEnginners();
		
		System.out.println("고객을 기다립니다.");
		
		Thread.sleep(1000);
		System.out.println("첫번째 고객");
		counter.acceptRequirement("충전이 안되어요.");
		
		Thread.sleep(200);
		System.out.println("두번째 고객");
		counter.acceptRequirement("액정이 꺠졌어요");

		System.out.println("세번째 고객");
		counter.acceptRequirement("핸드폰이 변기에 빠졌어요.");
	}
}
