package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {//处理类区服务器请求信息处理类区服务器请求信息
    public static void sendOKHttpRequest(String adress, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(adress).build();//发出http要求
        client.newCall(request).enqueue(callback);
    }
}