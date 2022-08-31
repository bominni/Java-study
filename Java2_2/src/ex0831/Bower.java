package ex0831;

import java.util.Scanner;

public class Bower {

    protected Scanner scanner;

    public Bower() {
        scanner = new Scanner(System.in);
    }

    public void execute() {
        HelloIF hello = new EnglishHello();

        while (true) {
            // 이름을 입력 받는다.
            String name = inputName();

            // 이름이 'quit'라면 반복문을 종료한다.
            if ("quit".equals(name)) {
                break;
            }

            // 인사를 한다.
            hello.setName(name);
            hello.sayHello();
        }

        scanner.close();
    }

    public void execute(HelloIF hello) {

        while (true) {
            // 이름을 입력 받는다.
            String name = inputName();

            // 이름이 'quit'라면 반복문을 종료한다.
            if ("quit".equals(name)) {
                break;
            }

            // 인사를 한다.
            hello.setName(name);
            hello.sayHello();
        }
    }

    protected String inputName() {
        System.out.println("이름을 입력하세요.");
        return scanner.nextLine();
    }

}