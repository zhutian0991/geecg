package com.guduke;

/**
 * @author yuxk
 * @version V1.0
 * @Title:
 * @Description:
 * @date：2018-10-16 20:12
 */
public class NowApiWeather {
    private String citynm;
    private String weather_icon;
    private String temperature_curr;
    private String weather_curr;

    public String getWeather_curr() {
        return weather_curr;
    }

    public void setWeather_curr(String weather_curr) {
        this.weather_curr = weather_curr;
    }

    public NowApiWeather() {
    }

    public NowApiWeather(String citynm, String weather_icon, String temperature_curr,String weather_curr) {
        this.citynm = citynm;
        this.weather_icon = weather_icon;
        this.temperature_curr = temperature_curr;
        this.weather_curr=weather_curr;
    }

    public String getCitynm() {
        return citynm;
    }

    public void setCitynm(String citynm) {
        this.citynm = citynm;
    }

    public String getWeather_icon() {
        return weather_icon;
    }

    public void setWeather_icon(String weather_icon) {
        this.weather_icon = weather_icon;
    }

    public String getTemperature_curr() {
        return temperature_curr;
    }

    public void setTemperature_curr(String temperature_curr) {
        this.temperature_curr = temperature_curr;
    }

    @Override
    public String toString() {
        return "NowApiWeather{" +
                "citynm='" + citynm + '\'' +
                ", weather_icon='" + weather_icon + '\'' +
                ", temperature_curr='" + temperature_curr + '\'' +
                ", weather_curr='" + weather_curr + '\'' +
                '}';
    }
}
