package RequiredValues;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("${Student.name}")
    private String studentName;
    @Value("${Student.interestedCourse}")
    private String interestedCourse;
    @Value("Playing Cricket")
    private String hobby;
    @Value("VolleyBall")
    private String externalSport;


    @Value("Chess")
    private String internalSport;

    public String getExternalSport() {
        return externalSport;
    }

    @Required
    public String getInternalSport() {
        return internalSport;
    }

    public String getStudentName() {
        return studentName;
    }


    public String getInterestedCourse() {
        return interestedCourse;
    }

    public String getHobby() {
        return hobby;
    }

    public void displayInformation(){
        System.out.println("Student Name-->" +getStudentName());
        System.out.println("Student Interested Course-->" +getInterestedCourse());
        System.out.println("Student Hobby-->" +getHobby());
        System.out.println("External Sport-->" +getExternalSport());
        System.out.println("internal Sport-->" +getInternalSport());
    }
}
