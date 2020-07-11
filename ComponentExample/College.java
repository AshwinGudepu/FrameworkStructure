package ComponentExample;

import org.springframework.stereotype.Component;

@Component("collegeTest")
public class College {

    public void collegeName(){
        System.out.println("EPAM Degree College");
    }
}
