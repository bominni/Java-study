package study.spring.projectBuild;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {

    @Bean
    public Hello hello() {
        System.out.printf("hello() called");
        Hello hello = new Hello();
        hello.setPerson(mary());

        return hello;
    }

    @Bean
    public Person smith() {
        Person person = new Person();
        person.setName("Mr.Smith");

        return person;
    }

    @Bean
    public Person mary() {
        Person person = new Person();
        person.setName("Ms.Mary");

        return person;
    }
}
