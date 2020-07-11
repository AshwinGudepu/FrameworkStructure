package iocExample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Sim simVodaPhone=context.getBean("vodaPhoneObject",Sim.class);
        simVodaPhone.calling();
        simVodaPhone.data();

        Sim simAirtel=context.getBean("airtelPhoneObject",Sim.class);
        simAirtel.calling();
        simAirtel.data();
    }
}
