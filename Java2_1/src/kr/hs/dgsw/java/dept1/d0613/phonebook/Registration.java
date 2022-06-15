package kr.hs.dgsw.java.dept1.d0613.phonebook;

public class Registration { // 등록하기
	
	private int num;
	private String name;
	private String phone;
	
	public Registration(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void displayInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
	}

}
