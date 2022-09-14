package study.spring.projectBuild;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application1 {
    public static void main(String[] args) {
        /* Hello hello = new Hello();
        hello.sayHello(); */
        ApplicationContext context = new ClassPathXmlApplicationContext("application1-context.xml");

        // Hello hello = (Hello)context.getBean("hello");
        Hello hello = context.getBean("hello", Hello.class);
        hello.sayHello();
    }
}
