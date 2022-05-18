package kr.hs.dgsw.java.detp1.d0511.homework;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class CommandLs extends AbstractCommand {
	
	 public CommandLs(File currentDirectory, String commandLine) {
	      super(currentDirectory, commandLine);
	 }

	 public String Date(Date date) { // 파일을 만든 날짜를 출력하는 코드
	      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	      return dateFormat.format(date);
	   }
	 
	 public Date makeDate(long unixTime) {
		 return new Date(unixTime);
	 }

	   @Override
	   public File executeCommand() {
	      File use = new File(this.currentDirectory.getAbsolutePath()); // 현재 내가 있는 파일 위치

	      if (use.exists()) {
	         File[] dir = use.listFiles();
	         for (File file : dir) {
	            long time = file.lastModified();
	            System.out.printf("%s", Date(makeDate(time)));
	            
	            if (file.exists()) { 
	               if (file.isDirectory()) { // 파일인지 디렉토리인지 구분
	                  System.out.printf("  <dir>");
	                  System.out.printf("         %s\n", file.getName());
	                  continue;
	               } else if (file.isFile()) { // 디렉토리가 아니고 파일이면
	                  System.out.printf("        ");
	               }
	            } else { // 둘다 아니면
	               System.out.println(" ");
	            }

	            long unit = file.length(); // 파일의 크기
	            long kilo = unit / 1024; // 킬로바이트
	            long mega = kilo / 1024; // 메가바이트
	            long giga = mega / 1024; // 기가바이트

	            if (unit < 1024)
	               System.out.printf("%7d", unit);
	            else if (kilo < 1024)
	               System.out.printf("%6dK", kilo);
	            else if (mega < 1024)
	               System.out.printf("%6dM", mega);
	            else if (giga < 1024)
	               System.out.printf("%6dG", giga);

	            System.out.printf(" %s\n", file.getName());
	         }
	      }

	      return currentDirectory;
	   }

}
