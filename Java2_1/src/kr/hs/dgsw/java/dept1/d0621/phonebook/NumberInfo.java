package kr.hs.dgsw.java.dept1.d0621.phonebook;

public class NumberInfo {
	private String name;
	private String phone;
	
	public NumberInfo(String name, String phone) {
		this.name = name;
		this.phone = phone;
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
	
	public void showInfo() {
		System.out.printf("%s\t%s\n", name, phone);
	}
	
	public String toString() {
		String result = String.format("%s\t%s", name, phone);
		return result;
	}
	
}
