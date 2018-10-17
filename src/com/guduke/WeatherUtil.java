package com.guduke;/**
 * Created by yuxk on 2018-10-16
 */

import com.alibaba.fastjson.JSON;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author yuxk
 * @version V1.0
 * @Title:
 * @Description:
 * @date：2018-10-16 20:19
 */
public class WeatherUtil {
    public static NowApiWeather getNowAipWeather(String weaid,String appkey,String sign) throws IOException {
        String json = getJsonResult(weaid,appkey,sign);
        WeatherResult weatherResult = JSON.parseObject(json, WeatherResult.class);
        WeatherInfo info = weatherResult.getResult();
        if(info!=null) {
            NowApiWeather weather = new NowApiWeather(info.getCitynm(), info.getWeather_icon(), info.getTemperature_curr(), info.getWeather_curr());
            return weather;
        }
        return null;
    }

    public static String getJsonResult(String weaid,String appkey,String sign) throws IOException {
        URL u=new URL("http://api.k780.com/?app=weather.today&weaid="+weaid+"&appkey="+appkey+"&sign="+sign+"&format=json");
        InputStream in=u.openStream();
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            byte buf[]=new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        }  finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[]=out.toByteArray( );
        return new String(b,"utf-8");
    }
}
