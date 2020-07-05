package looselyCoupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student mathsMarks=context.getBean("maths",Student.class);
        mathsMarks.studentMarks();

        Student scienceMarks=context.getBean("science",Student.class);
        scienceMarks.studentMarks();
    }
}
