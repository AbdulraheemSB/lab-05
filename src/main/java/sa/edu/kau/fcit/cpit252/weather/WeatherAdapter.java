package sa.edu.kau.fcit.cpit252.weather;

import sa.edu.kau.fcit.cpit252.geoLocation.GeoLocationService;
import sa.edu.kau.fcit.cpit252.geoLocation.Location;


/* This is the adapter class, WeatherAdapter, which takes a geographic coordinates of a city and returns the daily weather forecasts.
 * The adapter is a class used as an intermediary between the client and the adaptee.
 *
 */

/*
we shouldn't be referencing the concrete implementation
 */

public class WeatherAdapter implements WeatherCity{

    //We should create an instance variable of type weatherGEO
    private WeatherGeo weatherGeo;
    private GeoLocationService geoLocationService;

    //Lets write our constructor that will take WeatherGeo
    public WeatherAdapter(WeatherGeo weatherGeo){
        this.weatherGeo = weatherGeo;
        this.geoLocationService = new GeoLocationService();
    }

    //we will override
    public WeatherInfo getWeatherInfo(String cityName){
        Location geoLocation = this.geoLocationService.search(cityName);
        WeatherInfo weatherInfo = this.weatherGeo.getWeatherInfo(geoLocation.getLatitude(), geoLocation.getLongitude());
        weatherInfo.setCity(cityName);
        return weatherInfo;

    }
}
