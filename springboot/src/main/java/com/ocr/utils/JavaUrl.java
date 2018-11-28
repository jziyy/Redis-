package com.ocr.utils;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.util.Base64Util;
import com.ocr.ocrbeans.hy.beans.HyOcrBean;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class JavaUrl{

    public static HyOcrBean toBean(String path){
        String requestUrl = "http://106.38.62.166:7080/api";
        System.out.println("URL："+requestUrl);
        StringBuffer json = new StringBuffer();
        try {
            //实例一个url和URLConnection
            URL url = new URL(requestUrl);
            byte[] imgData = FileUtil.readFileByBytes(path);
            String imgStr = Base64Util.encode(imgData);
            String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8")
                    +"&"+ URLEncoder.encode("dir", "UTF-8") + "=" + URLEncoder.encode("false", "UTF-8");
            String contentType = "application/x-www-form-urlencoded";
            //打开链接
            URLConnection yc = url.openConnection();
            //设置通用属性
            yc.setRequestProperty("Content-Type", contentType);
            yc.setRequestProperty("Content-Type", contentType);
            yc.setRequestProperty("Connection", "Keep-Alive");
            yc.setUseCaches(false);
            yc.setDoOutput(true);
            yc.setDoInput(true);
            //得到请求的输出流对象
            DataOutputStream outputStream = new DataOutputStream(yc.getOutputStream());
            outputStream.write(params.getBytes("UTF-8"));
            outputStream.flush();
            outputStream.close();








            //输入流作参数传进InputStreamReader并用BufferedReader接受
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
            String inputLine = null;
            //一直读到空，并设置流编码是UTF8
            while ( (inputLine = in.readLine()) != null) {
                json.append(new String(inputLine.getBytes(),"GBK"));
            }
            //记得关闭连接
            in.close();
            System.out.println(json);
        } catch (Exception e)  {
            e.printStackTrace();
        }
        try {
            HyOcrBean bean = JSON.parseObject(json.toString().replaceAll("char","char1"),HyOcrBean.class);
            System.out.println(bean);

            return bean;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("连接超时！");
        }
        return null;
    }
    public static String toResultString(HyOcrBean bean){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bean.getRet().size(); i++) {
            sb.append(bean.getRet().get(i).getWord());
        }
        return sb.toString();
        
    }

}