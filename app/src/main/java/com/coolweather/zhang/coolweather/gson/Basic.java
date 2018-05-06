package com.coolweather.zhang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhang on 2018/5/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }

}
