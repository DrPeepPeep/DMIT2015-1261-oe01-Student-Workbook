package service;

import model.WeatherForecast;

import java.util.List;
import java.util.Optional;

public interface WeatherForecastService {

    WeatherForecast createWeatherForecast(WeatherForecast weatherForecast);

    Optional<WeatherForecast> getWeatherForecastById(String id);

    List<WeatherForecast> getAllWeatherForecasts();

    WeatherForecast updateWeatherForecast(WeatherForecast weatherForecast);

    void deleteWeatherForecastById(String id);
}