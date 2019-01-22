package com.hyjx.business.spbqznsb.ocr.txocr;

import com.baidu.aip.util.Base64Util;
import com.ocr.utils.FileUtil;
import com.ocr.utils.HttpUtil;

import java.net.URLEncoder;

public class Main {
    public static void main(String[] args) {

        // 通用识别url 通用的https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic
        // 高精度的 https://aip.baidubce.com/rest/2.0/ocr/v1/accurate
        //网页图片 https://aip.baidubce.com/rest/2.0/ocr/v1/webimage
        String otherHost = "http://localhost:8081/znspxc_api/oil_distinguish/FlameRecognition";
        // 本地图片路径

        //接收base64
        try {
            byte[] imgData = FileUtil.readFileByBytes("E:\\work\\demo\\1.jpg");
            String imgStr = Base64Util.encode(imgData);
            String params = URLEncoder.encode("baseimage", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             * 24.58d223921654eb9038de1ee991423983.2592000.1541750030.282335-14244124           1
             * 24.c4a3a7b199fdd05bca078ca4270701ce.2592000.1540728678.282335-14244124           2
             * 24.5082968e3fe226b59739ea120cf6d9c7.2592000.1541752701.282335-11804724  1        3
             * 24.55cbe9c1db5b6bc42c74132467eeb923.2592000.1542183287.282335-14440192  1		4
             * aa现使用4
             */
            //取得的json字符串
            String result = HttpUtil.postGeneralUrl(otherHost,"application/x-www-form-urlencoded",params,"UTF-8");

            System.out.println(result);






            //          System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
