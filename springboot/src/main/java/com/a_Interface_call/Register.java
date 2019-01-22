package com.a_Interface_call;

import com.ocr.utils.HttpUtil;

import java.net.URLEncoder;

/**
 * 是否注册接口调用
 */
public class Register {


    public static String getJson(String number) {

        String otherHost = "http://localhost:9090/aaa/aaa";
        // 本地图片路径

        //接收base64
        try {
            String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(number, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             * 24.58d223921654eb9038de1ee991423983.2592000.1541750030.282335-14244124           1
             * 24.c4a3a7b199fdd05bca078ca4270701ce.2592000.1540728678.282335-14244124           2
             * 24.5082968e3fe226b59739ea120cf6d9c7.2592000.1541752701.282335-11804724  1        3
             * 24.55cbe9c1db5b6bc42c74132467eeb923.2592000.1542183287.282335-14440192  1		4
             * aa现使用4
             */
            //取得的json字符串
            String contentType = "application/x-www-form-urlencoded";

            String result = HttpUtil.postGeneralUrl(otherHost, contentType, params, "UTF-8");




            return result;






        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
