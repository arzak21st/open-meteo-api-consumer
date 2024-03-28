package dev.arzak21st.openmeteoapiconsumer.services;

import dev.arzak21st.openmeteoapiconsumer.models.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WeatherService {

    public Weather getWeather(double latitude, double longitude) {

        String apiUrl = buildApiUrl(latitude, longitude);

        WebClient webClient = WebClient.create();
        Weather weather = webClient
                .get()
                .uri(apiUrl)
                .retrieve()
                .bodyToMono(Weather.class) // Specifies the type to which the response body should be converted (Weather)
                .block(); // Waits for the response (non-reactive context)
        System.out.println(weather);

        return weather;
    }

    private String buildApiUrl(double latitude, double longitude) {

        String apiUrl
                = "https://api.open-meteo.com"
                + "/v1/forecast"
                + "?latitude=" + latitude
                + "&longitude=" + longitude
                + "&current=temperature_2m,relative_humidity_2m,is_day,precipitation,cloud_cover"
                + "&hourly=temperature_2m,relative_humidity_2m,precipitation_probability,cloud_cover"
                + "&daily=temperature_2m_max,temperature_2m_min,precipitation_probability_max"
                + "&timezone=auto"
                + "&forecast_days=6";
        return apiUrl;
    }
}
