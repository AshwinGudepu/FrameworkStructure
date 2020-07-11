package SetterInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawRunner {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Triangle triangle=context.getBean("triangleObject",Triangle.class);
        triangle.drawShape();
    }
}
