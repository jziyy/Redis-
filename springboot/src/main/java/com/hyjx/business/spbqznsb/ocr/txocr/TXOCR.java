package com.hyjx.business.spbqznsb.ocr.txocr;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.util.Base64Util;
import com.ocr.utils.FileUtil;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class TXOCR {

    public static TxOcrBean  getMessage(String filePath) {
        String requestUrl = "https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic";
        requestUrl = "http://recognition.image.myqcloud.com/ocr/general";
        byte[] imgData = new byte[0];
        try {
            imgData = FileUtil.readFileByBytes(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String imgStr = Base64Util.encode(imgData);

        Map<String,String> map = new LinkedHashMap<>();
        map.put("appid","1258482909");
        map.put("image",imgStr);
       // map.put("url","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1542109655749&di=eebaf18fcf2c3566c07fdc74aa0c2dce&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fblog%2F201407%2F14%2F20140714192235_3djUX.thumb.700_0.jpeg");
        String json = JSON.toJSONString(map);
        String param = null;
//        try {
//            param = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8")
//                    ;
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        String result =DemoHttpUtil.doPost(requestUrl,json);
        System.out.println(result);
        TxOcrBean bean = JSON.parseObject(result, TxOcrBean.class);
        return bean;

    }
    public static String getMessage(TxOcrBean bean){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bean.getData().getItems().size(); i++) {
            for (int j = 0; j < bean.getData().getItems().get(i).getWords().size(); j++) {
                stringBuilder.append(bean.getData().getItems().get(i).getWords().get(j).getCharacter());
            }
        }

        return stringBuilder.toString();
    }
}
