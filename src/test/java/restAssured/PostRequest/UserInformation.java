package restAssured.PostRequest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class UserInformation {

    public String firstName;
    public String lastName;
    public String userName;
    public String password;
    public String email;

    public Map<String, String> registration = new HashMap<>();

    public void createUser() throws UnsupportedEncodingException {
        registration.put("FirstName", "Software");
        registration.put("LastName", "Testing");
        registration.put("UserName", "Json");
        registration.put("Password", "Great");
        registration.put("Email", "testing@gmail.com");
        PostRequest postRequest = new PostRequest();
        String url = "http://restapi.demoqa.com/customer/register";
    
        try {
            postRequest.createUserUsingApi(registration, url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        UserInformation userInformation = new UserInformation();
        userInformation.createUser();

    }
}
