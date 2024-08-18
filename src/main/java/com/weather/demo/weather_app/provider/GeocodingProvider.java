package com.weather.demo.weather_app.provider;

import com.weather.demo.weather_app.domain.WeatherRequestDetails;
import com.weather.demo.weather_app.entity.GeocodingCoordinatesEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class GeocodingProvider {
    @Value("${api.key}")
    private String apiKey;

    @Value("${geocoding.url}")
    private String geocodingUrl;

    public GeocodingCoordinatesEntity getCoordinates(final WeatherRequestDetails weatherRequestDetails) throws Exception {
        //geocoding API call

        RestTemplate restTemplate = new RestTemplate();
        final ResponseEntity<GeocodingCoordinatesEntity[]> responseEntity;

        HttpEntity<String> requestEntity = new HttpEntity<>(null, null);

        //build URL
        UriComponents uriBuilder = UriComponentsBuilder.fromHttpUrl(geocodingUrl)
                .queryParam("q", weatherRequestDetails.getCity())
                .queryParam("limit", "1")
                .queryParam("appid", apiKey).build();

        System.out.println("Request URL: " + uriBuilder.toString());
        try {
            responseEntity = restTemplate.exchange(uriBuilder.toString(),
                    HttpMethod.GET,
                    requestEntity,
                    GeocodingCoordinatesEntity[].class);
        } catch (HttpStatusCodeException e) {
            throw new Exception(e.getMessage());
        }

        return responseEntity.getBody()[0];
    }
}
