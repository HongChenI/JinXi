package com.coolweather.zhang.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhang on 2018/5/4.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build(); //通过url()设置目标的网络地址
        client.newCall(request).enqueue(callback); //调用enqueue()方法发送请求（异步）
    }
}
