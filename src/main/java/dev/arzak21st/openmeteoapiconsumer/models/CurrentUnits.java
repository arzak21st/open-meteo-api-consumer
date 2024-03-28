package dev.arzak21st.openmeteoapiconsumer.models;

public class CurrentUnits {

    private String time;
    private String interval;
    private String temperature_2m;
    private String relative_humidity_2m;
    private String is_day;
    private String precipitation;
    private String cloud_cover;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getTemperature_2m() {
        return temperature_2m;
    }

    public void setTemperature_2m(String temperature_2m) {
        this.temperature_2m = temperature_2m;
    }

    public String getRelative_humidity_2m() {
        return relative_humidity_2m;
    }

    public void setRelative_humidity_2m(String relative_humidity_2m) {
        this.relative_humidity_2m = relative_humidity_2m;
    }

    public String getIs_day() {
        return is_day;
    }

    public void setIs_day(String is_day) {
        this.is_day = is_day;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getCloud_cover() {
        return cloud_cover;
    }

    public void setCloud_cover(String cloud_cover) {
        this.cloud_cover = cloud_cover;
    }
}
