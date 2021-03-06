package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    //舒适度
    @SerializedName("comf")
    public Comfort comfort;

    //适宜洗车
    @SerializedName("cw")
    public CarWash carWash;

    //适宜运动
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
