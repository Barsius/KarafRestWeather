package org.apache.karaf.examples.rest.api;

public interface WeatherService {
    public Weather getWeatherByCity(String city);
}
