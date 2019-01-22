package com.ocr.ocrbeans.bd.ocr;

import com.baidu.aip.util.Base64Util;
import com.ocr.ocrbeans.bd.beans.Ocr_Bean;
import com.ocr.utils.FileUtil;
import com.ocr.utils.HttpUtil;
import com.ocr.utils.alutil.auth.AuthService;

import java.net.URLEncoder;

/**
 * OCR 通用识别
 */
public class General_spjyxkz {


    public static String getJson(String filePath) {

        String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/business_license";
        //接收base64
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8")
                    +"&"+ URLEncoder.encode("detect_direction", "UTF-8") + "=" + URLEncoder.encode("true", "UTF-8")
                    +"&"+ URLEncoder.encode("accuracy", "UTF-8") + "=" + URLEncoder.encode("high", "UTF-8");

            String accessToken = AuthService.getAuth();
            //取得的json字符串
            String result = HttpUtil.post(otherHost, accessToken, params).replaceAll("char","char1");

            return result;

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
