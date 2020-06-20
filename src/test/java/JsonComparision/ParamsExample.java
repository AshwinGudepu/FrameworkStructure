package JsonComparision;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ParamsExample {

   @Test
    public void test001_param(){
       //params understanding
        Response response=given().
                params("FirstName", "Hello","LastName","LastName",
                "UserName", "Sachin",
                "Password", "Tendulkar",
                "Email", "postrest@gmail.com")
                .post("http://restapi.demoqa.com/customer/register").then().extract().response();
        System.out.println("----------"+response);
    }

    @Test
    public void test001_getPathParam(){
        //path Param
        Response response=given().when().pathParams("nameId",1)
                .get("https://jsonplaceholder.typicode.com/users/{nameId}").then().extract().response();
        System.out.println("----------"+response.statusCode());
        System.out.println("----------"+response.statusLine());
        System.out.println("----------"+response.contentType());
        System.out.println("----------"+response.asString());
    }

    @Test
    public void test003_getSearchQueryParam(){
        //Query Param
        //q=London,uk&appid=2b1fd2d7f77ccf1b7de9b441571b39b8
        Response response=given().
                queryParam("q","London,uk")
                .queryParam("appid","2b1fd2d7f77ccf1b7de9b441571b39b8")
                .get("https://samples.openweathermap.org/data/2.5/weather/").then().extract().response();
        System.out.println("----------"+response.statusCode());
        System.out.println("----------"+response.statusLine());
        System.out.println("----------"+response.contentType());
        System.out.println("----------"+response.asString());
    }

    @Test
    public void test004_specBuilder(){
        Map<String,String> keyWord=new HashMap<>();
        keyWord.put("FirstName", "Hello");
        keyWord.put("LastName","LastName");
        keyWord.put("UserName", "Sachin");
        keyWord.put("Password", "Tendulkar");
        keyWord.put("Email", "postrest@gmail.com");
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
        requestSpecBuilder.setBody(keyWord);

        RequestSpecification requestSpecification=requestSpecBuilder.build();
        Response response=given().
                spec(requestSpecification).post("http://restapi.demoqa.com/customer/register").then().extract().response();
        System.out.println("----------"+response);
        System.out.println("----------"+response.statusCode());
        System.out.println("----------"+response.statusLine());
        System.out.println("----------"+response.contentType());
        System.out.println("----------"+response.asString());
    }

    @Test
    public void test005_usingParamMapToString(){
        Map<String,String> keyWord=new HashMap<>();
        keyWord.put("FirstName", "Hello");
        keyWord.put("LastName","LastName");
        keyWord.put("UserName", "Sachin");
        keyWord.put("Password", "Tendulkar");
        keyWord.put("Email", "postrest@gmail.com");

        Response response=given().
                param(keyWord.toString()).post("http://restapi.demoqa.com/customer/register").then().extract().response();
        System.out.println("----------"+response.statusCode());
        System.out.println("----------"+response.statusLine());
        System.out.println("----------"+response.contentType());
        System.out.println("----------"+response.asString());

        String responseString=given().
                param(keyWord.toString()).post("http://restapi.demoqa.com/customer/register").then().toString();
    }
}
