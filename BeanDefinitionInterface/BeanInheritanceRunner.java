package BeanDefinitionInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceRunner {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Triangle triangle=context.getBean("beanInheritance", Triangle.class);
        triangle.drawShape();
    }
}
