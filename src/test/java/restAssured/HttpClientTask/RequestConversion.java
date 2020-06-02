package restAssured.HttpClientTask;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Map;

public class RequestConversion {
    public static HttpResponse response;
    public static Map<Object, Object> responeMap;
    public static String jsonRawResponse;

    public String getWeatherReportWithoutObjectMapper() throws ParseException, IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet("http://restapi.demoqa.com/utilities/weather/city/Hyderabad");
        getRequest.addHeader("accept", "application/xml");
        response = httpClient.execute(getRequest);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != 200) {
            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
        }
        HttpEntity httpEntity = response.getEntity();
        String apiOutput = EntityUtils.toString(httpEntity);
        return apiOutput;
    }

    public String getWeatherReportWithObjectMapper() throws ParseException, IOException {

        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet("http://restapi.demoqa.com/utilities/weather/city/Hyderabad");
        getRequest.addHeader("accept", "application/xml");
        response = httpClient.execute(getRequest);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != 200) {
            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        HttpEntity httpEntity = response.getEntity();

        JsonNode rootNode = objectMapper.readTree(httpEntity.getContent());
        return String.valueOf(rootNode.get(WeatherConstants.CITY));
    }

    public String getWeatherReportWithPojo() throws ParseException, IOException {

        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet("http://restapi.demoqa.com/utilities/weather/city/Hyderabad");
        getRequest.addHeader("accept", "application/xml");
        response = httpClient.execute(getRequest);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != 200) {
            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
        }
        HttpEntity httpEntity = response.getEntity();
        String apiOutput = EntityUtils.toString(httpEntity);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(apiOutput);

        // Writing to Pojos
        Weather weatherValues = objectMapper.readValue(apiOutput, Weather.class);
        return weatherValues.getWeatherDescription();
    }
}
