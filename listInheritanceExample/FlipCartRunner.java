package listInheritanceExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FlipCartRunner {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Flipcart flipcart=context.getBean("mapCollections", Flipcart.class);
        flipcart.getUser();
    }
}
