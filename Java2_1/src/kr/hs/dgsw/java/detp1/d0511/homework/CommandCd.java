package kr.hs.dgsw.java.detp1.d0511.homework;

import java.io.File;

public class CommandCd extends AbstractCommand {

	public CommandCd(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine); // currentDirectory는 현재 내가 있는 파일의 위치 / commandLine은 내가 입력한 명령어
	}

	@Override
	public File executeCommand() {
		File currentfile = currentDirectory; // 현재 내가 있는 파일위치
		if(commandLine.contains("..")) { // 만약 ..을 입력하면
			if(currentfile.getParentFile().exists()) { // 만약 상위 폴더가 있을경우
				currentfile = new File(currentfile.getParent()); // 상위 폴더로 이동
				return currentfile;
			}
			else { // 만약 상위 폴더가 없으면
				System.out.println("cannot find the path"); // cannot find the path를 출력
				return currentDirectory;
			}
		}
		else { // 아니면
			currentfile = new File(currentfile.getAbsolutePath()+"/"+commandLine.substring(3)); // 입력한 파일로 이동하는데 앞에 cd 는 필요없으니까 앞에 3자리는 없앤다.
			if(currentfile.exists()) { // 만약 그 파일이 존재하면
				if(currentfile.isDirectory()) { // 그 파일로 이동
					return currentfile; // 그 파일을 리턴
				}
				else { // 아니면
					System.out.println("cannot find the path"); // cannot find the path를 출력
					return currentDirectory; // 현재 경로를 리턴
				}
			}
			else {
				System.out.println("cannot find the path"); // cannot find the path를 출력
				return currentDirectory; // 현재 경로를 리턴
			}
		}
	}
	
}
