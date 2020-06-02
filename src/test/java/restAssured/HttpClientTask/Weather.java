package restAssured.HttpClientTask;

public class Weather {

 //   @JsonIgnoreProperties
    public String City;
    public String Temperature;
    public String Humidity;
    public String WindSpeed;
    public String WeatherDescription;
    public String WindDirectionDegree;

    /*public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
*/
    public String getTemperature() {
        return Temperature;
    }

    public String getHumidity() {
        return Humidity;
    }

    public String getWindSpeed() {
        return WindSpeed;
    }

    public String getWeatherDescription() {
        return WeatherDescription;
    }

    public String getWindDirectionDegree() {
        return WindDirectionDegree;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    public void setHumidity(String humidity) {
        Humidity = humidity;
    }

    public void setWindSpeed(String windSpeed) {
        WindSpeed = windSpeed;
    }

    public void setWeatherDescription(String weatherDescription) {
        WeatherDescription = weatherDescription;
    }

    public void setWindDirectionDegree(String windDirectionDegree) {
        WindDirectionDegree = windDirectionDegree;
    }
}
