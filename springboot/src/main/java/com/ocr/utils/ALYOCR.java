package com.ocr.utils;


import com.ocr.ocrbeans.ali.beans.AlOcrBean;
import com.baidu.aip.util.Base64Util;
import com.google.gson.Gson;
import com.ocr.utils.alutil.HttpUtils;
import com.ocr.utils.txutil.PicDispose;
import org.apache.http.HttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ALYOCR {
    public static AlOcrBean getBean(String picPath) throws IOException {
        picPath = PicDispose.picDispose(picPath);
        String host = "https://ocrapi-ugc.taobao.com";
        String path = "/ocrservice/ugc";
        String method = "POST";
        String appcode = "e3b31739abf34a68ae69d4df6368c1a0";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);


        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/json; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();

        byte[] imgData = FileUtil.readFileByBytes(picPath);
        String imgStr = Base64Util.encode(imgData);

        String bodys = "{\"img\":\""+ imgStr +"\"," +
                "\"prob\":true}";

        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            //获取response的body
            String jsonStr = inputStreamToString(response.getEntity().getContent());
            AlOcrBean bean = new Gson().fromJson(jsonStr, AlOcrBean.class);
            return  bean;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getMessage(AlOcrBean bean){
       try {


        StringBuilder stringBuilder = new StringBuilder();
        int state = 1;
           if (bean.getPrism_wordsInfo().get(0).getCharInfo()!=null){
               state = 0;
           }
        for (int i = 0; i < bean.getPrism_wordsInfo().size(); i++) {
            if (state==0){

                for (int j = 0; j < bean.getPrism_wordsInfo().get(i).getCharInfo().size(); j++) {
                    stringBuilder.append(bean.getPrism_wordsInfo().get(i).getCharInfo().get(j).getWord());
                }
            }
            else {
                stringBuilder.append(bean.getPrism_wordsInfo().get(i).getWord());
            }
        }
        return stringBuilder.toString();
       }catch (NullPointerException e){
           System.out.println(e.getMessage());
       }
       return null;
    }
    private static String inputStreamToString(InputStream is) {

        String line = "";
        StringBuilder total = new StringBuilder();

        // Wrap a BufferedReader around the InputStream
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));

        try {
            // Read response until the end
            while ((line = rd.readLine()) != null) {
                total.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Return full string
        return total.toString();
    }
}
