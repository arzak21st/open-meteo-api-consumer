package dev.arzak21st.openmeteoapiconsumer.models;

public class DailyUnits {

    private String time;
    private String temperature_2m_max;
    private String temperature_2m_min;
    private String precipitation_probability_max;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature_2m_max() {
        return temperature_2m_max;
    }

    public void setTemperature_2m_max(String temperature_2m_max) {
        this.temperature_2m_max = temperature_2m_max;
    }

    public String getTemperature_2m_min() {
        return temperature_2m_min;
    }

    public void setTemperature_2m_min(String temperature_2m_min) {
        this.temperature_2m_min = temperature_2m_min;
    }

    public String getPrecipitation_probability_max() {
        return precipitation_probability_max;
    }

    public void setPrecipitation_probability_max(String precipitation_probability_max) {
        this.precipitation_probability_max = precipitation_probability_max;
    }
}
