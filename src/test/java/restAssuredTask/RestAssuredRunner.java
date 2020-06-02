package restAssuredTask;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RestAssuredRunner {

    RequestSpecification httpRequest;
    @BeforeMethod
    public void constructUrl() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        httpRequest = RestAssured.given();
    }

    @Test
    public void verifyStatus() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/users");
        String responseBody = response.getBody().asString();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void verifyStatusLine() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/users");
        String responseBody = response.getBody().asString();
        String statusLine = response.getStatusLine();
        System.out.println("---STATUS LINE---" + statusLine);
        Assert.assertEquals("HTTP/1.1 200 OK", statusLine);
    }

    @Test
    public void verifyContentTypeHeader() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/users");
        String responseBody = response.getBody().asString();
        String contentType = response.getHeader("Content-Type");
        Assert.assertEquals("application/json; charset=utf-8", contentType);
    }

    @Test
    public void verifyServerHeader() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/users");
        String responseBody = response.getBody().asString();
        String serverName = response.getHeader("Server");
        Assert.assertEquals("cloudflare", serverName);
    }

    @Test
    public void verifyCount() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/users").then().contentType(ContentType.JSON).
                extract().
                response();
        int sizeOfList = response.body().path("list.size()");
        Assert.assertEquals(10, sizeOfList);
    }

    @Test
    public void verifyCountWithBasic() {
        Response response = given().when().get("https://jsonplaceholder.typicode.com/users").then().contentType(ContentType.JSON).
                extract().
                response();
        int sizeOfList = response.body().path("list.size()");
        Assert.assertEquals(10, sizeOfList);
    }

    @Test
    public void verifyDeserialization() {
       // UserInformation userInformation= new UserInformation();
        Response response = given().when().get("https://jsonplaceholder.typicode.com/users").then().extract().response();


        UserInformation[] userInformation= response.getBody().as(UserInformation[].class);
        System.out.println("-----------"+userInformation);

        Assert.assertEquals("Bret", userInformation[0].getUsername());
    }
}
