package InterfaceInjectionExample;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements SubjectTeacher {
    public void teacherName() {
        System.out.println("Teacher who teaches SCIENCE");
        System.out.println("++ is Called SCIENCE Teacher");
    }
}
