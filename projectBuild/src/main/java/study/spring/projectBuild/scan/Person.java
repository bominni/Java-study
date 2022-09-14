package study.spring.projectBuild.scan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    @Value("Mr.Smith")
    public void setName(String name) {
        this.name = name;
    }
}
