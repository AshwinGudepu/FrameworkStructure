package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Student win=context.getBean("studentObject",Student.class);
        win.displayStudentInfo();
    }
}
