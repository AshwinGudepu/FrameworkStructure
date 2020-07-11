package ConfigurationCompScan;

import org.springframework.stereotype.Component;

@Component("collegeNameObject")
public class CollegeName {
    public void getCollegeName(){
        System.out.println("Vivekanada Degree College");
    }
}
