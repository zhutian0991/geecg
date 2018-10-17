package com.guduke;

/**
 * @author yuxk
 * @version V1.0
 * @Title:
 * @Description:
 * @date：2018-10-16 19:51
 */
public class WeatherResult {
    private String success;

    private WeatherInfo result;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public WeatherInfo getResult() {
        return result;
    }

    public void setResult(WeatherInfo result) {
        this.result = result;
    }
}
