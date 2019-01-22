package com.esdemo;

import com.baidu.aip.util.Base64Util;
import com.ocr.utils.FileUtil;
import com.oil.SocketClient;

public class Demo {
    //    public static String postGeneralUrl(String generalUrl, String contentType, String params, String encoding)
    public static void main(String[] args) throws Exception {
        String url = "http://172.22.0.200:4104?baseimage=";
        byte[] imgData = FileUtil.readFileByBytes("E:\\work\\demo\\616eaa4f06cf5b4e84d576f391e1bc26_1535300.jpg");
        String imgStr = Base64Util.encode(imgData);;

        String s= SocketClient.sendBySocket(imgStr,"172.22.0.200",4103);

        System.out.println(s);
    }
}
