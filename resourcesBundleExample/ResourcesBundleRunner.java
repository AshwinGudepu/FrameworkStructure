package resourcesBundleExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourcesBundleRunner {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        StudentInformation studentInformation=context.getBean("studentRunner",StudentInformation.class);
        studentInformation.getMessageSource();
        System.out.println("***Testing Resource bundle***");
        System.out.println(context.getMessage("Student.name",null,"Student.hobby",null));
        System.out.println(context.getMessage("Student.hobby",new Object[]{studentInformation.getId()},"Student.name",null));
    }
}
