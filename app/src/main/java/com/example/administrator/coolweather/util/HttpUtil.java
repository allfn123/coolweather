package com.example.administrator.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;


/**
 * Created by Administrator on 2017/9/16.
 */

//Http请求工具类
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
