package com.ocr.test;

import com.ocr.utils.Documentv2OCRRESTAPIDemo;

import java.io.*;

public class OcrTest4 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Administrator\\Desktop\\新建文件夹";
        File file =new File(path);
        File [] files = file.listFiles();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\BATOCRDemo.txt"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\测试1.txt"));
        for (int i = 0; i < files.length; i++) {
            String picturePath =files [i].getAbsolutePath();

            /**
             * 全能扫描王OCR
             */
            String qnOcr = Documentv2OCRRESTAPIDemo.getMessage(Documentv2OCRRESTAPIDemo.DocumentOCR(picturePath));

            /**
             * 百度OCR
             */
            String bdOcr =bufferedReader.readLine();


//  String hyOcr = JavaUrl.toResultString(JavaUrl.toBean(picturePath));
            /**
             * 阿里OCR
             */
            String alOcr = bufferedReader.readLine();

            /**
             * 腾讯OCR
             */
            String txOcr = bufferedReader.readLine();

            bufferedWriter.write("qnOcr: " + qnOcr);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();


            bufferedWriter.write(bdOcr);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();

            bufferedWriter.write(alOcr);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();

            bufferedWriter.write(txOcr);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();

            bufferedReader.readLine();
//            bufferedWriter.write("hyocr: " + hyOcr);
//            bufferedWriter.flush();
//            bufferedWriter.newLine();
//            bufferedWriter.flush();
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }


}
