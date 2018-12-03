package com.work.ocr.test;

import com.ocr.utils.ALYOCR;
import com.ocr.utils.Documentv2OCRRESTAPIDemo;
import com.ocr.utils.General;
import com.ocr.utils.TXOCR;
import com.ocr.utils.txutil.PicDispose;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\work\\OCR\\1130\\aaa2";

        File file1 = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\BATQOCR原图20181130.txt"));


        File[] files = file1.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            File[] files1 = file.listFiles();
            getInfo(file,files1,bufferedWriter);

        }
    }
    public static void getInfo(File file,File[] files, BufferedWriter bufferedWriter)throws IOException{




        bufferedWriter.write(file.getName());
        bufferedWriter.flush();
        bufferedWriter.newLine();
        bufferedWriter.flush();
        for (int i = 0; i < files.length; i++) {
            String picName = files[i].getName();
            //   for (int j = 0; j < 2; j++) {

            String picturePath =file.getAbsolutePath();

            picturePath = picturePath + "\\" + picName;
            picturePath = PicDispose.picDispose(picturePath);

            String bdOcr = "";
            /**
             * 百度OCR
             */
            try {
                bdOcr = General.getmessage(General.getMessage(picturePath));
            }catch (Exception e){
                e.getMessage();
            }

            /**
             * 阿里OCR
             */
            String alOcr = "";

            try {
                alOcr = ALYOCR.getMessage(ALYOCR.getBean(picturePath));
            }catch (Exception e){
                e.getMessage();
            }
            /**
             * 腾讯OCR
             */
            String txOcr = "";
            try {
                txOcr = TXOCR.getMessage(picturePath);
            }catch (Exception e){
                e.getMessage();
            }

            /**
             * 全能扫描王OCR
             */
            String qnOcr = "";
            try {
                 qnOcr = Documentv2OCRRESTAPIDemo.getMessage(Documentv2OCRRESTAPIDemo.DocumentOCR(picturePath));
            }catch (Exception e){
                e.getMessage();
            }

            System.out.println(qnOcr);
            bufferedWriter.write(picName);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.write("qnOcr: " + qnOcr);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();

            System.out.println(bdOcr);
            bufferedWriter.write("bdocr: " + bdOcr);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();

            System.out.println(alOcr);
            bufferedWriter.write("alOcr: " + alOcr);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();

            System.out.println(txOcr);
            bufferedWriter.write("txOcr: " + txOcr);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }
        bufferedWriter.flush();
        bufferedWriter.close();


    }



}
