package restAssured.HttpClientTask;

import java.io.IOException;
import org.apache.http.ParseException;

public class WeatherRunner {

	public static void main(String args[]) throws ParseException {
		
		RequestConversion runner=new RequestConversion();
		try {
			String getResponse=runner.getWeatherReportWithoutObjectMapper();
			System.out.println("----->>"+getResponse+"\n");

			String getResponseWithObjectMapper=runner.getWeatherReportWithObjectMapper();
			System.out.println("===With Object Mapper===\n"+getResponseWithObjectMapper);

			String getResponseUsingPojo=runner.getWeatherReportWithPojo();
			System.out.println("====Using Pojo====\n"+getResponseUsingPojo);

			System.out.println("==USING MAP==");
			RequestConversionWithMap requestConversionWithMap=new RequestConversionWithMap();
			requestConversionWithMap.getWeatherReportMap();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
