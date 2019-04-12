package com.ideepmind.joy.sdk.weather;

import java.io.Serializable;

/**
 * 实体
 * Created by LH on 2017/3/4.
 */
public class ChatWeatherInfoEntities implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String city;        //城市
    private String date;        //日期
    private String week;        //星期
    private String lunarCalendar;//农历
    private String pm2Info;     //PM2.5
    private int weatherImg;  //天气图片
    private String temperatureRealtime; //实时温度
    private String temperature; //温度
    private String windpower;   //风力
    private String windDirection; // 风向
    private String dayWeather;  //天气 晴

    public String getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public String getDayWeather() {
        return dayWeather;
    }

    public void setDayWeather(String dayWeather) {
        this.dayWeather = dayWeather;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPm2Info() {
        return pm2Info;
    }

    public void setPm2Info(String pm2Info) {
        this.pm2Info = pm2Info;
    }

    public int getWeatherImg() {
        return weatherImg;
    }

    public void setWeatherImg(int weatherImg) {
        this.weatherImg = weatherImg;
    }

    public String getTemperatureRealtime() {
        return temperatureRealtime;
    }

    public void setTemperatureRealtime(String temperatureRealtime) {
        this.temperatureRealtime = temperatureRealtime;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindpower() {
        return windpower;
    }

    public void setWindpower(String windpower) {
        this.windpower = windpower;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getLunarCalendar() {
        return lunarCalendar;
    }

    public void setLunarCalendar(String lunarCalendar) {
        this.lunarCalendar = lunarCalendar;
    }
}
