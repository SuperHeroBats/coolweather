package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    //当前天气
    @SerializedName("tmp")
    public String temperature;   //温度

    @SerializedName("cond")
    public More more;   //天气情况

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
