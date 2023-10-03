package sa.edu.kau.fcit.cpit252.weather;


public interface WeatherCity {
    // Get weather data by the city name.

    /*
    This class will take a string City name and return weatherInfo
     */

    WeatherInfo getWeatherInfo(String cityName);
}
