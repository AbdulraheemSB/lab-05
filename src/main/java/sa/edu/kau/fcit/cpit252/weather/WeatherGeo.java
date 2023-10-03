package sa.edu.kau.fcit.cpit252.weather;

public interface WeatherGeo {
    // Get weather data by the geographical coordinates (latitude, longitude).
/*
write a method that will return our info and its called getWeatherInfo that
will take latitude and longitude as double values
*/
    WeatherInfo getWeatherInfo(double latitude, double longitude);

}
