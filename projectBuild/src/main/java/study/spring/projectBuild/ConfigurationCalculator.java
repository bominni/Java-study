package study.spring.projectBuild;

import org.springframework.context.annotation.Bean;
import study.spring.projectBuild.calculator.Machine;

public class ConfigurationCalculator {

    @Bean
    public Machine machine() {
        Machine machine = new Machine();
        machine.setCalculator(calculator());
    }
}
