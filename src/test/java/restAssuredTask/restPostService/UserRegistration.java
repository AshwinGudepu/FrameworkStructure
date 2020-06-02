package restAssuredTask.restPostService;

import java.util.HashMap;
import java.util.Map;

public class UserRegistration {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;

    public Map<String, String> userData = new HashMap<>();

    public String getFistName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        userData.put("FirstName",firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        userData.put("LastName", lastName);
    }

    public String getUseName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        userData.put("UserName", userName);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        userData.put("Password", password);
    }

    public String getEmailId() {
        return emailId;
    }

    public  void setEmailId(String emailId) {
        this.emailId = emailId;
        userData.put("Email", emailId);
    }

   // public static Map<String,String> getUserData(){
     //   return userData;
    
}
