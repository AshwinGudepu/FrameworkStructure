package JsonComparision;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static io.restassured.RestAssured.given;

public class CompareJson {
    @Test
    public void GetWeatherDetailsCondensed()
    {
        given().queryParam("CUSTOMER_ID","68195")
            .queryParam("PASSWORD","1234!")
            .queryParam("Account_No","1")
            .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
            .body();
    }

/*    Three ways for Comparing JSON Files
    1.Using JSONObject,with this Object Mapper is not reqiured
    2.Using Response Class.First step we have to extract to response,then use ObjectMapper Class for comparision
    3.Using JsonNode. Convert the JsonFile to String and then use ObjectMapper class for comparision*/

    //Comparing two JSON objects
    @Test
    public void comJson(){
        String s1="{\"name\": \"John\",\"score\": 5}";
        String s2="{\"name\": \"John\",\"score\": 5}";
       // String s2="{\"score\": 5,\"name\": \"John\"}";
        JSONObject js1=new JSONObject(s1);
        JSONObject js2=new JSONObject(s2);
        System.out.println(js1+"----------"+js2);
        System.out.println("-----------------"+js1.similar(js2));
        Assert.assertTrue(js1.similar(js2));
        //JSONObject-Order should be same when compare two Json;
    }

    @Test
    public void verifyDeserialization() throws IOException {
        // UserInformation userInformation= new UserInformation();
        Response response1 = given().when().get("https://jsonplaceholder.typicode.com/users/1").then().extract().response();
        Response response2 = given().when().get("https://jsonplaceholder.typicode.com/users/1").then().extract().response();
        System.out.println("Response 1-------------"+response1.asString());
        System.out.println("Response 2-------------"+response2.asString());
        ObjectMapper om=new ObjectMapper();
        Assert.assertEquals(om.readTree(response1.asString()),om.readTree(response2.asString()));
        //Order is not required
    }

    @Test
    public void verifyFileJsonNode() throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        JsonNode jsonNode1=mapper.readTree(new FileInputStream(Paths.get("E:\\TestData\\FirstJson.json").toString()));
        JsonNode jsonNode2=mapper.readTree(new FileInputStream(Paths.get("E:\\TestData\\ThirdJson.json").toString()));
        System.out.println("JsonNode 1-------------"+jsonNode1.get("address"));
        System.out.println("JsonNode 2-------------"+jsonNode2.get("address"));
        System.out.println("Compare Two Address Fields");
        Assert.assertEquals(jsonNode1.get("address"),jsonNode2.get("address"));
        System.out.println("**********************************************");
        Assert.assertEquals(jsonNode1,jsonNode2);
    }

    @Test
    public void verifyDeserializationWithClass() throws IOException {
        // UserInformation userInformation= new UserInformation();
        ObjectMapper mapper=new ObjectMapper();
        // Compare two json files
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        JsonPlaceHolder jph1=mapper.readValue(new FileInputStream(Paths.get("E:\\TestData\\FirstJson.json").toFile()), JsonPlaceHolder.class);
        /*mapper.disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);*/
        //JsonPlaceHolder jph2=mapper.readValue(new FileInputStream(Paths.get("E:\\TestData\\SecondJson.json").toFile()), JsonPlaceHolder.class);
        //Values are different and comparision should fail
        JsonPlaceHolder jph2=mapper.readValue(new FileInputStream(Paths.get("E:\\TestData\\ThirdJson.json").toFile()), JsonPlaceHolder.class);
        Assert.assertEquals(jph1.getId(),jph2.getId());
    }

    @Test
    public void testJsonPath(){
        Response response = given().when().get("https://jsonplaceholder.typicode.com/users/1").then().extract().response();
        JsonPath jsonPathValidator = response.jsonPath();
        System.out.println("ID : \n" + jsonPathValidator.get("address"));
        jsonPathValidator.setRootPath("");
    }

    @Test
    public void verifyDeserializationWithClassSoftAssertion() throws IOException {
        // UserInformation userInformation= new UserInformation();
        ObjectMapper mapper=new ObjectMapper();
        SoftAssert softAssert=new SoftAssert();
        // Compare two json files
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        JsonPlaceHolder jph1=mapper.readValue(new FileInputStream(Paths.get("E:\\TestData\\FirstJson.json").toFile()), JsonPlaceHolder.class);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        JsonPlaceHolder jph2=mapper.readValue(new FileInputStream(Paths.get("E:\\TestData\\ThirdJson.json").toFile()), JsonPlaceHolder.class);
        softAssert.assertEquals(jph1.getUsername(),jph2.getUsername(),"Compare UserName");
        softAssert.assertEquals(jph1.getName(),jph2.getName(),"Compare Name");
        softAssert.assertEquals(jph1.getId(),jph2.getId(),"Compare ID");
        softAssert.assertAll();
    }
}