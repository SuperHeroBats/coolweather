package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    //引用实体类
    public String status;   //对返回天气数据的处理结果
    public Basic basic;   //城市天气基本信息
    public AQI aqi;   //空气质量
    public Now now;   //当前天气
    public Suggestion suggestion;   //天气建议

    //预报天气信息
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
