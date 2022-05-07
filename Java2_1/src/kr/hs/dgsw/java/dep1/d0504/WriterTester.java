package kr.hs.dgsw.java.dep1.d0504;

public class WriterTester {
	
protected final Writer writer;
	
	public WriterTester() {
		this.writer = new FileWriter("C:\\add.txt");
	}
	
	public void add(int value1, int value2) {
		int result = value1 + value2;
		String output = String.format("%d + %d = %d", value1, value2, result);
		
		writer.write(output);
	}
	

	public static void main(String[] args) {
		WriterTester tester = new WriterTester();
		tester.add(5, 6);
		/*
		String value = "예외가 없는 법칙은 없다.";
		
		Writer simpleWriter = new SimpleWriter();
		simpleWriter.write(null);
		
		Writer fileWriter = new FileWriter("C:\\may.txt");
		fileWriter.write(value);
		*/
	}
}
