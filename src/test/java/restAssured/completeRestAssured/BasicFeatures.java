package restAssured.completeRestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class BasicFeatures {

    @Test
    public void test001(){
        given().get("https://jsonplaceholder.typicode.com/users/1").then().statusCode(200);
    }

    @Test
    public void test002_logAll(){
        given().get("https://jsonplaceholder.typicode.com/users/1").then().statusCode(200).log().all();
    }

    @Test
    public void test003_EqualFunction(){
        given().get("https://jsonplaceholder.typicode.com/users/1").then().body("address.street",equalTo("Kulas Light"));
    }

    @Test
    public void test004_hasItems(){
        given().get("https://jsonplaceholder.typicode.com/users/1").then().body("address.street",hasItems("Kulas Light"));
    }
}
