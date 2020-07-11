package automWiredUsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        StudentInformation studInfo=context.getBean("student", StudentInformation.class);
        studInfo.studentMarks();
       /* StudentInformation studentInformation=new StudentInformation(new MathsMarks());
        studentInformation.studentMarks();*/

    }
}
