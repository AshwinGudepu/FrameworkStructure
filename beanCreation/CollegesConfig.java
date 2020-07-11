package beanCreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegesConfig {
    public void firstProgram(){
        System.out.println("Testing the First Program");
    }

    @Bean
    public Sports sports(){
        Sports volleyBall=new Sports();
        return volleyBall;
    }

    @Bean
    public CollegeNameCreation collegeName(){
        CollegeNameCreation createCollegeName=new CollegeNameCreation(sports());
        return createCollegeName;
    }
}
