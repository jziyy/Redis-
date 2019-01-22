package com.ocr.utils.alutil;

import com.alibaba.fastjson.JSON;
import com.ocr.ocrbeans.hh.beans.beans.HHBean;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Documentv2OCRRESTAPIDemo {
//	public static final String TAG = Documentv2OCRRESTAPIDemo.class.getSimpleName();


	public static String getMessage(String json){
		HHBean bean = JSON.parseObject(json,HHBean.class);
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < bean.getLinesText().size(); i++) {
			stringBuilder.append(bean.getLinesText().get(i));
		}
			return  stringBuilder.toString();
	}
	public static String DocumentOCR(String filepath){
//		filepath = PicDispose.picDispose(filepath);

		try {
			//filepath = "D:/java/6.jpg";
			File file = new File(filepath);
			URL url = new URL("https://imgs-sandbox.intsig.net/icr/recognize_document?user=hangyjx&password=aHzbURm0ogd1");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setRequestMethod("POST");
			OutputStream out = con.getOutputStream();
			FileInputStream inputStream = new FileInputStream(file);
			byte[] data = new byte[2048];
			int len = 0;
			int sum = 0;
			while ((len = inputStream.read(data))!= -1) {
				out.write(data, 0, len);
				sum = len + sum;
			}
			out.flush();
			inputStream.close();
			out.close();
			
			int code = con.getResponseCode();
			if (code==200) {
				InputStream inputStream2 = con.getInputStream();
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				while ((len = inputStream2.read(data))!= -1) {
					bos.write(data, 0, len);					
				}
				inputStream2.close();
				bos.close();
				return bos.toString();

			}
			con.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
