package dev.arzak21st.openmeteoapiconsumer.models;

public class Current {

    private String time;
    private int interval;
    private double temperature_2m;
    private int relative_humidity_2m;
    private int is_day;
    private double precipitation;
    private int cloud_cover;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public double getTemperature_2m() {
        return temperature_2m;
    }

    public void setTemperature_2m(double temperature_2m) {
        this.temperature_2m = temperature_2m;
    }

    public int getRelative_humidity_2m() {
        return relative_humidity_2m;
    }

    public void setRelative_humidity_2m(int relative_humidity_2m) {
        this.relative_humidity_2m = relative_humidity_2m;
    }

    public int getIs_day() {
        return is_day;
    }

    public void setIs_day(int is_day) {
        this.is_day = is_day;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public int getCloud_cover() {
        return cloud_cover;
    }

    public void setCloud_cover(int cloud_cover) {
        this.cloud_cover = cloud_cover;
    }

    @Override
    public String toString() {
        return "Current{" + "time=" + time + ", interval=" + interval + ", temperature_2m=" + temperature_2m + ", relative_humidity_2m=" + relative_humidity_2m + ", is_day=" + is_day + ", precipitation=" + precipitation + ", cloud_cover=" + cloud_cover + '}';
    }
}
