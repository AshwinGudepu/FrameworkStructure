package springFrameworkTutorial2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListRunnerFile {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Triangle drawTriangle=context.getBean("triangle", Triangle.class);
        drawTriangle.draw();
    }
}
