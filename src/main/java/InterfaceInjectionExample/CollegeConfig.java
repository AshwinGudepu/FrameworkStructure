package InterfaceInjectionExample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "InterfaceInjectionExample")
@PropertySource("classPath:/famousCricketer.properties")
public class CollegeConfig {

}
