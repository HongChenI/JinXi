package com.coolweather.zhang.coolweather.gson;

/**
 * Created by zhang on 2018/5/6.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
