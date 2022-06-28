package kr.hs.dgsw.java.dept1.d0627.cmd2;

import java.io.File;
import java.util.Scanner;

public class CommandRm extends AbstractCommand {
	
	public CommandRm(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine); // currentDirectory는 현재 내가 있는 파일의 위치 / commandLine은 내가 입력한 명령어
	}

	@Override
	public File executeCommand() {
		Scanner sc = new Scanner(System.in);
		String answer;
		File currentfile = currentDirectory; // 현재 내가 있는 파일위치
		if(commandLine.contains("rm")) { // 만약 rm을 입력하면
			File removeFile = new File(currentDirectory+"/"+commandLine.substring(3));
			if(!removeFile.exists()) {
				System.out.println("파일을 찾을 수 없습니다. 다시 입력해 주세요.");
				return currentDirectory;
			}
			if(removeFile.isDirectory()) {
				File[] removeList = removeFile.listFiles();
				
				for (int i = 0; i < removeList.length; i++) {
					removeList[i].delete();
				}
				
				if(removeList.length == 0 && removeFile.isDirectory()){
					System.out.println("정말로 삭제하시겠습니까? (Y or y : 삭제 / N or n : 취소)");
					answer = sc.next();
					if(answer.equals("Y") || answer.equals("y")) {
						removeFile.delete();
						System.out.println("삭제되었습니다.");
						return currentDirectory;
					}
					else if(answer.equals("N") || answer.equals("n")){
						System.out.println("삭제를 하지 못했습니다.");
						return currentfile;
					}
				}
			}
			System.out.println("정말로 삭제하시겠습니까? (Y or y : 삭제 / N or n : 취소)");
			answer = sc.next();
			if(answer.equals("Y") || answer.equals("y")) {
				removeFile.delete();
				System.out.println("삭제되었습니다.");
				return currentDirectory;
			}
		}
		System.out.println("삭제를 하지 못했습니다.");
		return currentfile;
	}
}
