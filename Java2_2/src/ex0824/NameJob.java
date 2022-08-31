package ex0824;

import java.util.Scanner;

public abstract class NameJob {
    protected Scanner scanner;

    public NameJob() {
        scanner = new Scanner(System.in);
    }

    public void execute() {
        while (true) {
            // 이름을 입력 받는다.
            String name = inputName();

            // 'quit' 가 입력되었다면 종료한다.
            if ("quit".equals(name)) {
                break;
            }

            doJob(name);
        }

        scanner.close();
    }

    protected abstract void doJob(String name);

    protected String inputName() {
        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();
        return name;
    }
}