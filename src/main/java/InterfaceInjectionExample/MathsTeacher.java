package InterfaceInjectionExample;

import org.springframework.stereotype.Component;

@Component
public class MathsTeacher implements SubjectTeacher{
    public void teacherName() {
        System.out.println("Teacher who teaches Maths");
        System.out.println("++ is Called Maths Teacher");
    }
}
