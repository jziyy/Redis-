package com.ocr.test;

import com.ocr.utils.ALYOCR;
import com.ocr.utils.Documentv2OCRRESTAPIDemo;
import com.ocr.utils.General;
import com.ocr.utils.TXOCR;
import com.ocr.utils.txutil.PicDispose;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HyCompareBdTest {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Administrator\\Desktop\\新建文件夹2";
        File file =new File(path);
        File [] files = file.listFiles();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\BATQOCRDemo1127.txt"));

        for (int i = 0; i < files.length; i++) {
            String picturePath =files [i].getAbsolutePath();
            picturePath = PicDispose.picDispose(picturePath);

            /**
             * 百度OCR
              */
            String bdOcr =General.getmessage(General.getMessage(picturePath));


//  String hyOcr = JavaUrl.toResultString(JavaUrl.toBean(picturePath));
            /**
             * 阿里OCR
             */
            String alOcr = ALYOCR.getMessage(ALYOCR.getBean(picturePath));

            /**
             * 腾讯OCR
             */
            String txOcr = TXOCR.getMessage(picturePath);

            /**
             * 全能扫描王OCR
             */
            String qnOcr = Documentv2OCRRESTAPIDemo.getMessage(Documentv2OCRRESTAPIDemo.DocumentOCR(picturePath));

            System.out.println(qnOcr);
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


//            bufferedWriter.write("hyocr: " + hyOcr);
//            bufferedWriter.flush();
//            bufferedWriter.newLine();
//            bufferedWriter.flush();
        }
        bufferedWriter.flush();
        bufferedWriter.close();

    }


}
