package AutoWiredSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientHuman {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Human humanInfo=context.getBean("testHeart", Human.class);
        humanInfo.startPumping();
    }
}
