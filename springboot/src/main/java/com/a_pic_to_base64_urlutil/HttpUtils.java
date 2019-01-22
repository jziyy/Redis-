package com.a_pic_to_base64_urlutil;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {



    public static String postGeneralUrl(String generalUrl,String contentType,String params,String encoding)
    throws Exception{
        URL url =new URL(generalUrl);
        //打开和URL之间的链接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //设置请求方法
        connection.setRequestMethod("POST");
        //设置通用的请求属性
        connection.setRequestProperty("Content-Type",contentType);
        connection.setRequestProperty("Connection","Keep-Alive");
        //post 请求不能使用缓存
        connection.setUseCaches(false);

return "";
    }
}
