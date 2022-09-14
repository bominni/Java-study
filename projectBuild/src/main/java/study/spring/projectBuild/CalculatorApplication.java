package study.spring.projectBuild;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.projectBuild.calculator.Machine;

public class CalculatorApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(ConfigurationCalculator.class);

        Machine machine = context.getBean("machine", Machine.class);
        machine.execute();
    }
}
