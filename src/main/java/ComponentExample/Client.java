package ComponentExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        College collegeExample=context.getBean("collegeTest",College.class);
        collegeExample.collegeName();
    }
}
