package com.weather.demo.weather_app.entity;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class WeatherResponse {
    private String weather;
    private String details;
    private Double temperature;
    private Double realFeel;

}
