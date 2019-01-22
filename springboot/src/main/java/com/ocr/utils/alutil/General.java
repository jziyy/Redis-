package com.ocr.utils.alutil;

import com.baidu.aip.util.Base64Util;
import com.ocr.ocrbeans.bd.beans.Ocr_Bean;
import com.google.gson.Gson;
import com.ocr.utils.FileUtil;
import com.ocr.utils.HttpUtil;
import com.ocr.utils.alutil.auth.AuthService;

import java.net.URLEncoder;

/**
 * OCR 通用识别
 */
public class General {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public static Ocr_Bean getMessage(String filePath) {
        // 通用识别url 通用的https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic
        // 高精度的 https://aip.baidubce.com/rest/2.0/ocr/v1/accurate
        //网页图片 https://aip.baidubce.com/rest/2.0/ocr/v1/webimage
        String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/accurate";
        // 本地图片路径

        //接收base64
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8")
                    +"&"+ URLEncoder.encode("recognize_granularity", "UTF-8") + "=" + URLEncoder.encode("small", "UTF-8")
                    +"&"+ URLEncoder.encode("detect_direction", "UTF-8") + "=" + URLEncoder.encode("true", "UTF-8")
                    +"&"+ URLEncoder.encode("vertexes_location", "UTF-8") + "=" + URLEncoder.encode("true", "UTF-8")
                    +"&"+ URLEncoder.encode("probability", "UTF-8") + "=" + URLEncoder.encode("true", "UTF-8");
            /**
              * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
              * 24.58d223921654eb9038de1ee991423983.2592000.1541750030.282335-14244124           1
              * 24.c4a3a7b199fdd05bca078ca4270701ce.2592000.1540728678.282335-14244124           2
              * 24.5082968e3fe226b59739ea120cf6d9c7.2592000.1541752701.282335-11804724  1        3
              * 24.55cbe9c1db5b6bc42c74132467eeb923.2592000.1542183287.282335-14440192  1		4
              * aa现使用4
              */
            String accessToken = AuthService.getAuth();
            //取得的json字符串
            String result = HttpUtil.post(otherHost, accessToken, params).replaceAll("char","char1");

            Ocr_Bean ocr_bean = new Gson().fromJson(result, Ocr_Bean.class);


            return ocr_bean;






            //          System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String getmessage(Ocr_Bean ocr_bean){
        String sb = "";
        for (int i = 0; i < ocr_bean.getWords_result_num(); i++) {
            if (!ocr_bean.getWords_result().get(i).getWords().equals("背景图片仅供参考")) {
                sb +=ocr_bean.getWords_result().get(i).getWords();
            }

        }
        //清除空格
        sb = sb.replaceAll(" ", "");
        return sb;
    }
}
