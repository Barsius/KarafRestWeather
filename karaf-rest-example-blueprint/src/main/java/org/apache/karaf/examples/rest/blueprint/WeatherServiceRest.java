package org.apache.karaf.examples.rest.blueprint;

import org.apache.karaf.examples.rest.api.Weather;
import org.apache.karaf.examples.rest.api.WeatherService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class WeatherServiceRest implements WeatherService {
    @Override
    @Path("/{city}")
    @Produces("application/json")
    @GET
    public Weather getWeatherByCity(String city) {
        return new Weather(111);
    }
}
