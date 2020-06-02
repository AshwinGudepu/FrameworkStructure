package restAssuredTask.restPostService;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import restAssuredTask.UserInformation;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RestPostService extends UserValues {
    @BeforeTest
    public void setBaseUrl() {
        RestAssured.baseURI = "http://restapi.demoqa.com";
        RestAssured.basePath="customer";
    }

    public RequestSpecBuilder requestSpecBuilder;
    public RequestSpecification requestSpecification;

    public ResponseSpecBuilder responseSpecBuilder;
    public ResponseSpecification responseSpecification;

    @BeforeClass
    public void registerCustomer() {
        Map<String, String> userData = new HashMap<>();
        userData.put("FirstName", "Hello");
        userData.put("LastName", "LastName");
        userData.put("UserName", "Sachin");
        userData.put("Password", "Tendulkar");
        userData.put("Email", "postrest@gmail.com");

        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setContentType("application/json");
        requestSpecBuilder.setBody(userData);
    }

    @Test
    public void Test001_RequestSpecification() {
       requestSpecification = requestSpecBuilder.build();
       given().spec(requestSpecification).when().post("/customer/register").then().assertThat().statusCode(200);
       //following are the difference hamcrest Matchers
        /*given().spec(requestSpecification).when().post("/customer/register").then().assertThat().
                body("",equalTo("")).
                body("",hasSize(9)).
                body("",not(equalTo(""))).
                body("",hasItem(""));*/
    }

    @Test
    public void Test002_RequestSpecification() {
        Response responseValidation;
        //UserRegistration userRegistration=new UserRegistration();
   /*     userRegistration.setEmailId("Testing");
        userRegistration.setFirstName("OneName");
        userRegistration.setLastName("Last");
        userRegistration.setPassword("Password");
        userRegistration.setUserName("HelloUser");*/

     //   userRegistration.userData.forEach((k,v)->System.out.println(k+"------------"+v));

        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setContentType("application/json");
        UserValues userValues=new UserValues();
        userValues.setUserValues();
        requestSpecBuilder.setBody(userRegistration);

        requestSpecification = requestSpecBuilder.build();
        responseValidation =given().spec(requestSpecification).when().post("/register").then().extract().response();
        JsonPath jsonPathValidation = responseValidation.jsonPath();

        String responseBody=jsonPathValidation.getString("FaultId");
        Assert.assertEquals(responseBody,"Invalid post data, please correct the requests");

        ResponseSpecBuilder builder = new ResponseSpecBuilder();
        builder.expectBody("FaultId", equalTo("Invalid post data, please correct the request"));
        builder.expectBody("fault", equalTo("FAULT_INVALID_POST_REQUEST"));

       given(requestSpecification,builder.build()).post("/register");
       System.out.println();
    }

    @Test
    public void verifyDeserialization() {
        Response response = given().when().get("http://restapi.demoqa.com/customer/register").then().extract().response();
        ResponseDeserialization userInformation= response.getBody().as(ResponseDeserialization.class);
        System.out.println("-----------"+userInformation);
        //Assert.assertEquals("Bret", userInformation[0].getUsername());
    }
}
