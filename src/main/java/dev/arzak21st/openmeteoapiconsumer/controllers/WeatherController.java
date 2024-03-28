package dev.arzak21st.openmeteoapiconsumer.controllers;

import dev.arzak21st.openmeteoapiconsumer.models.Weather;
import dev.arzak21st.openmeteoapiconsumer.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/weather")
    public String weather(@RequestParam(defaultValue = "") String country, @RequestParam(defaultValue = "") String city, @RequestParam(defaultValue = "0") double latitude, @RequestParam(defaultValue = "0") double longitude, Model model) {

        if(latitude != 0.0 && longitude != 0.0){

            Weather weather = weatherService.getWeather(latitude, longitude);

            // Weather
            model.addAttribute("weather", weather);

            // Current
            model.addAttribute("current", weather.getCurrent());
            model.addAttribute("currentUnits", weather.getCurrent_units());

            // Hourly
            int hourlyListsSize = weather.getHourly().getTime().size();
            model.addAttribute("hourlyListsSize", hourlyListsSize); // All lists of the 'Hourly' object have the same size

            model.addAttribute("hourly", weather.getHourly());
            model.addAttribute("hourlyUnits", weather.getHourly_units());

            // Dialy
            int dailyListsSize = weather.getDaily().getTime().size(); // All lists of the 'Daily' object have the same size
            model.addAttribute("dailyListsSize", dailyListsSize);

            model.addAttribute("daily", weather.getDaily());
            model.addAttribute("dailyUnits", weather.getDaily_units());

            // Address
            model.addAttribute("selectedCountry", country);
            model.addAttribute("selectedCity", city);
        }
        else{

            // Address
            model.addAttribute("selectedCountry", "");
            model.addAttribute("selectedCity", "");
        }

        return "weather";
    }
}
