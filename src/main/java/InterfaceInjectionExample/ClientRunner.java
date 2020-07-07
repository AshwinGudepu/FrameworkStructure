package InterfaceInjectionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientRunner {
    public static void main(String[] args) {
        System.out.println("----------"+System.getProperty("user.dir"));
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
        College collegeInformation=context.getBean("college",College.class);
        collegeInformation.collegeName();
    }
}
