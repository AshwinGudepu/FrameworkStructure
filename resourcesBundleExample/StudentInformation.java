package resourcesBundleExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;

public class StudentInformation {

    private int id=100;

    @Autowired
    private MessageSource messageSource;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Student Name------------>"+name);
        this.name = name;
    }

    @Value("${Student.name}")
    private String name;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void totalStudentInformation(){
        System.out.println("Complete Student Information");
        System.out.println("Roll Number-->" +getId());
        System.out.println("Student Name from the Property File-->" +getName());
    }
}
