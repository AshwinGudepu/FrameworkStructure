package restAssured.HttpClientTask;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class RequestConversionWithMap {

    public static HttpResponse response;
    public static Map<Object, Object> responeMap;
    public static String jsonRawResponse;

    public void getWeatherReportMap() throws ParseException, IOException {

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

        RequestConversionWithMap.jsonRawResponse = apiOutput;
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader objectReader = objectMapper.reader(HashMap.class);
        responeMap = objectReader.with(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)
                .readValue(jsonRawResponse);
		if (responeMap.containsKey(WeatherConstants.CITY)) {
			System.out.println("--->>"+responeMap.get(WeatherConstants.CITY)+"\n"+"====>Size of the Map"+responeMap.size());
		}
	}
}
