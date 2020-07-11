package InterfaceInjectionExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Value("Rahul Dravid")
    private String famousCricketer;

    private Principal principal;

    private SubjectTeacher subjectTeacher;

    @Autowired
    @Qualifier("mathsTeacher")
    public void setSubjectTeacher(SubjectTeacher subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    @Autowired
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void collegeName(){
        System.out.println("College Name is SSR Degree College");
        principal.getPrincipalName();
        System.out.println("Famous Cricketer is "+famousCricketer);
    }
}
