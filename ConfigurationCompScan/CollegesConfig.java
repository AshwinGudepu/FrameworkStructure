package ConfigurationCompScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ConfigurationCompScan")
public class CollegesConfig {
    public void firstProgram(){
        System.out.println("Testing the First Program");
    }
}
