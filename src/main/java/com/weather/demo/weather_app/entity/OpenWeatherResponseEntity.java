package com.weather.demo.weather_app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.tools.javac.Main;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherResponseEntity {
    @JsonProperty("weather")
    private WeatherEntity[] weather;
    @JsonProperty("main")
    private MainEntity main;
}
