package com.guduke;

import java.io.IOException;

/**
 * Created by yuxk on 2018-10-10
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*String a = "{\"success\":\"1\",\"result\":{\"weaid\":\"180\",\"days\":\"2018-10-16\",\"week\":\"星期二\",\"cityno\":\"gdzhongshan\",\"citynm\":\"中山\",\"cityid\":\"101281701\",\"temperature\":\"26℃/21℃\",\"temperature_curr\":\"23℃\",\"humidity\":\"85%\",\"aqi\":\"44\",\"weather\":\"中雨转小雨\",\"weather_curr\":\"阴\",\"weather_icon\":\"http://api.k780.com/upload/weather/d/2.gif\",\"weather_icon1\":\"\",\"wind\":\"东北风\",\"winp\":\"1级\",\"temp_high\":\"26\",\"temp_low\":\"21\",\"temp_curr\":\"23\",\"humi_high\":\"0\",\"humi_low\":\"0\",\"weatid\":\"3\",\"weatid1\":\"\",\"windid\":\"13\",\"winpid\":\"201\",\"weather_iconid\":\"2\"}}";
        WeatherResult weatherResult = JSON.parseObject(a, WeatherResult.class);
        WeatherInfo info = weatherResult.getResult();
        NowApiWeather weather = new NowApiWeather();
        weather.setCitynm(info.getCitynm());
        weather.setTemperature_curr(info.getTemperature_curr());
        weather.setWeather_icon(info.getWeather_icon());
        System.out.println(weather);*/
        NowApiWeather nowAipWeather = WeatherUtil.getNowAipWeather("2", "37304", "c0c89fd4c13dfe5816186052fd0a185c");
        System.out.println(nowAipWeather);
        System.out.println("Test.main");
    }
}
