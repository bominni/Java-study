package ex0824;

import java.util.HashMap;
import java.util.Map;

public class SayHello extends NameJob {

    public SayHello() {
        super();
    }

    @Override
    protected void doJob(String name) {
        System.out.printf("안녕하세요. %s님\n", name);
    }

    public static void main(String[] args) {
        SayHello sayHello = new SayHello();
        sayHello.execute();
    }
}

/*
// 내 코드
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("quit를 입력하면 종료합니다.\n");
        while(true) {
            System.out.printf("이름을 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            if(("quit").equals(name)) {
                System.out.println("종료합니다.");
                break;
            }
            System.out.println("안녕하세요. " + name + "님!\n");
        }
    }
}
*/