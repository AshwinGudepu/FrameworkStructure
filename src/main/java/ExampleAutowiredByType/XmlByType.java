package ExampleAutowiredByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlByType {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Human humanInfo=context.getBean("heartTest", Human.class);
        humanInfo.startPumping();
    }
}
