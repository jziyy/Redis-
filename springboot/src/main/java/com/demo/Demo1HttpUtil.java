package com.demo;


import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


/**
 * apache HttpClient3.1
 */
public class Demo1HttpUtil {
    public static String doGet(String url) {
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        String result = null;
        //创建httpClient实例
        HttpClient httpClient = new HttpClient();
        //
        //
        httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(15000);
        //
        GetMethod getMethod =new GetMethod(url);
        //
        getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler(3,true));

        try {
            //
            int statusCode = httpClient.executeMethod(getMethod);
            //
            if (statusCode!= HttpStatus.SC_OK){
                //
                System.err.println("Method faild: " + getMethod.getStatusLine());;
            }else {
                //
                inputStream = getMethod.getResponseBodyAsStream();
                //
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
                StringBuffer stringBuffer = new StringBuffer();
                //
                String temp = null;
                while ((temp=bufferedReader.readLine())!= null){
                    stringBuffer.append(temp).append("\r\n");

                }
                result =stringBuffer.toString();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (null != bufferedReader){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != inputStream){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //
            getMethod.releaseConnection();
        }
         return result;

    }
    public static String doPost(String url, Map<String,Object> paramMap){
       //
        String result = null;
       InputStream inputStream = null;
       BufferedReader bufferedReader =null;
       //
        HttpClient httpClient = new HttpClient();
        //
        httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(15000);
        //
        PostMethod postMethod = new PostMethod(url);
        //
        postMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT,60000);
        NameValuePair [] nameValuePairs = null;
        //
        if (null != paramMap && paramMap.size()>0){
            //
            nameValuePairs = new NameValuePair[paramMap.size()];
            //
            Set<Entry<String,Object>> entrySet = paramMap.entrySet();
            //
            Iterator<Entry<String,Object>> iterator =entrySet.iterator();

            int index = 0;
            while (iterator.hasNext()){
                Entry<String,Object> mapEntry = iterator.next();
                //
                try {
                    nameValuePairs[index] = new NameValuePair(mapEntry.getKey(), new String(mapEntry.getValue().toString().getBytes("UTF-8"),"UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                index++;
            }
        }
        //
        if (null !=nameValuePairs && nameValuePairs.length > 0){
            //
            postMethod.setRequestBody(nameValuePairs);
        }
        //
        try {
            int statusCode = httpClient.executeMethod(postMethod);
            //
            if (statusCode != HttpStatus.SC_OK){
                System.err.println("Method faild :" + postMethod.getStatusLine());
            }
            //
            inputStream = postMethod.getResponseBodyAsStream();
            //
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));

            StringBuffer stringBuffer = new StringBuffer();
            String temp =null;
            while ((temp= bufferedReader.readLine())!=null){
                stringBuffer.append(temp).append("\r\n");
            }
            result = stringBuffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //
            if (null != bufferedReader){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != inputStream){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            postMethod.releaseConnection();
        }
        return  result;
    }



}