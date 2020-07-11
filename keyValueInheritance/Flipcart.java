package keyValueInheritance;

import java.util.List;
import java.util.Map;

public class Flipcart {

    private String user;
    private Map<String,String> studentInfo;

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public Map<String, String> getStudentInfo() {
        studentInfo.forEach((key,value)->System.out.println("Key--->"+key+"--"+"Value-->"+value));
        return studentInfo;
    }

    public void setStudentInfo(Map<String, String> studentInfo) {
        this.studentInfo = studentInfo;
    }
}
