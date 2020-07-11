package setCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetCollectionFlipCartRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        context.registerShutdownHook();
        Flipcart flipcart=context.getBean("mapCollections", Flipcart.class);
        flipcart.getUser();

        Flipcart flipcart2=context.getBean("mapCollections", Flipcart.class);
        flipcart2.getUser();
    }
}
