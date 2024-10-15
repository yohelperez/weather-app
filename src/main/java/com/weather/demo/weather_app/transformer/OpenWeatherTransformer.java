package com.weather.demo.weather_app.transformer;

import com.weather.demo.weather_app.domain.CityWeather;
import com.weather.demo.weather_app.entity.OpenWeatherResponseEntity;
import com.weather.demo.weather_app.entity.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenWeatherTransformer {
    @Value("${weather.icon.url}")
    private String iconBaseUrl;
    @Value("${weather.icon.size}")
    private String iconSize;
    public CityWeather transformToDomain(final OpenWeatherResponseEntity entity) {
        return CityWeather.builder()
                .weather(entity.getWeather()[0].getMain())
                .details(entity.getWeather()[0].getDescription())
                .temperature(entity.getMain().getTemp())
                .realFeel(entity.getMain().getFeelsLike())
                .icon(entity.getWeather()[0].getIcon())
                .build();
    }

    public WeatherResponse transformToEntity(final CityWeather cityWeather) {
        String iconUrl = String.format("%s%s%s", iconBaseUrl, cityWeather.getIcon(), iconSize);

        return WeatherResponse.builder()
                .weather(cityWeather.getWeather())
                .details(cityWeather.getDetails())
                .temperature(cityWeather.getTemperature())
                .realFeel(cityWeather.getRealFeel())
                .iconUrl(iconUrl)
                .build();
    }
}
