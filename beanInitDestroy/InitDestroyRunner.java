package beanInitDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyRunner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Hello helloObject=context.getBean("helloObjectTest",Hello.class);

        Hi hiObject=context.getBean("hiObjectTest",Hi.class);
        context.close();
    }
}
