package RequiredValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentRunner {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student stud=context.getBean("studentInformation",Student.class);
        stud.displayInformation();
    }
}
