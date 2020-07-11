package BeanPostProcessorExample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldRunnerFile {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld drawTriangleOne=context.getBean("firstTriangle", HelloWorld.class);
        HelloWorld drawTriangleTwo=context.getBean("secondTriangle", HelloWorld.class);
        context.registerShutdownHook();
    }
}
