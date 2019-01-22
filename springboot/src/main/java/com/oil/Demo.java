package com.oil;

import com.baidu.aip.util.Base64Util;
import com.ocr.utils.FileUtil;
import com.ocr.utils.HttpUtil;

import java.net.URLEncoder;

public class Demo {
    public static void main(String[] args) throws Exception {
        String url = "http://172.22.0.200:4102/znspxc/oil/imageai/staffMemberInterface";
        byte[] imgData = FileUtil.readFileByBytes("E:\\work\\demo\\616eaa4f06cf5b4e84d576f391e1bc26_1535300.jpg");
        String imgStr = Base64Util.encode(imgData);
        //url += imgStr;


        String params = URLEncoder.encode("baseimage", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");

       String s = HttpUtil.postGeneralUrl(url,"application/x-www-form-urlencoded",params,"UTF-8");
        System.out.println(s);
    }
}
