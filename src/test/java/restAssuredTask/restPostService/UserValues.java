package restAssuredTask.restPostService;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserValues {

	UserRegistration userRegistration=null;
    @BeforeClass
    public void setUserValues(){
        userRegistration=new UserRegistration();
        System.out.println("-----------------------------------");

        userRegistration.setEmailId("Testing");
        userRegistration.setFirstName("OneName");
        userRegistration.setLastName("Last");
        userRegistration.setPassword("Password");
        userRegistration.setUserName("HelloUser");
        System.out.println("-----------------------------------");
    }
}


