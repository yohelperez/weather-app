package com.weather.demo.weather_app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodingCoordinatesEntity {
    @JsonProperty("lat")
    private String latitude;
    @JsonProperty("lon")
    private String longitude;
}
