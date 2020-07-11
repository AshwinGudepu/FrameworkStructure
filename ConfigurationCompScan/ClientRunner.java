package ConfigurationCompScan;

import ComponentExample.College;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientRunner {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(CollegesConfig.class);
        CollegeName newCollegeNames=context.getBean("collegeNameObject", CollegeName.class);
        newCollegeNames.getCollegeName();
    }
}
