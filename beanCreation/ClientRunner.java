package beanCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientRunner {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(CollegesConfig.class);
        CollegeNameCreation newCollegeNames=context.getBean("collegeName", CollegeNameCreation.class);
        newCollegeNames.getCollegeName();
    }
}
