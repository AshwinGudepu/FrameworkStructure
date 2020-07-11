package airtelAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        AirtelRunner helloTuneService=context.getBean("helloTuneService",AirtelRunner.class);
        helloTuneService.activatingService();

        AirtelRunner dataService=context.getBean("dataService",AirtelRunner.class);
        dataService.activatingService();
    }
}
