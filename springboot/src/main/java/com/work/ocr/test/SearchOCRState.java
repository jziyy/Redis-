package com.work.ocr.test;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class SearchOCRState {
    public static void main(String[] args) throws IOException {
      //  BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\aaaa.txt"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\项目\\springboot\\src\\main\\resources\\static\\newbatqOCRsum.txt"));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\aaaa2.txt"));
        double bdOCRGoodCount = 0;
        double alOCRGoodCount = 0;
        double txOCRGoodCount = 0;
        double qnOCRGoodCount = 0;

        double bdOCRErrorCount = 0;
        double alOCRErrorCount = 0;
        double txOCRErrorCount = 0;
        double qnOCRErrorCount = 0;
        StringBuilder bdstringBuilder =new StringBuilder(240);
        StringBuilder alstringBuilder =new StringBuilder(240);
        StringBuilder txstringBuilder =new StringBuilder(240);
        StringBuilder qnstringBuilder =new StringBuilder(240);
        String str1;
        while ((str1=bufferedReader.readLine())!=null) {
            //System.out.println(str1);
            //String str2 = bufferedReader.readLine();
            //System.out.println(str2);
            str1 =str1.trim();
            //str2 =str2.trim();
            /**
             * 百度
              */
            if (str1.startsWith("bdocr")) {
                bdOCRGoodCount++;
                bdstringBuilder.append(1);
                bdstringBuilder.append(" ");
            }
            if (str1.startsWith("0bdocr")) {
                bdOCRErrorCount++;
                bdstringBuilder.append(0);
                bdstringBuilder.append(" ");
            }

            /**
             * 阿里
             */
            if (str1.startsWith("alOcr")) {
                alOCRGoodCount++;
                alstringBuilder.append(1);
                alstringBuilder.append(" ");
            }
            if (str1.startsWith("0alOcr")) {
                alOCRErrorCount++;
                alstringBuilder.append(0);
                alstringBuilder.append(" ");
            }


            /**
             * 腾讯
             */
            if (str1.startsWith("txOcr")) {
                txOCRGoodCount++;
                txstringBuilder.append(1);
                txstringBuilder.append(" ");
            }
            if (str1.startsWith("0txOcr")) {
                txOCRErrorCount++;
                txstringBuilder.append(0);
                txstringBuilder.append(" ");
            }

            /**
             * qn
             */
            if (str1.startsWith("qnOcr")) {
                qnOCRGoodCount++;
                qnstringBuilder.append(1);
                qnstringBuilder.append(" ");
            }
            if (str1.startsWith("0qnOcr")) {
                qnOCRErrorCount++;
                qnstringBuilder.append(0);
                qnstringBuilder.append(" ");
            }


          // List<String> list = AligningStr(str1, str2);
          // List<String> list1 = AligningStr(list.get(1), list.get(0));
//            bufferedWriter.write(str1);
//            bufferedWriter.newLine();
//            bufferedWriter.write(str2);
//            bufferedWriter.newLine();
//            bufferedWriter.newLine();
//            bufferedWriter.flush();
        }

        DecimalFormat decimalFormat = new DecimalFormat("00.00");
        String baccuracy = decimalFormat.format(100*(bdOCRGoodCount/(bdOCRGoodCount + bdOCRErrorCount))) + "%";
        String aaccuracy = decimalFormat.format(100*(alOCRGoodCount/(alOCRGoodCount + alOCRErrorCount))) + "%";
        String taccuracy = decimalFormat.format(100*(txOCRGoodCount/(txOCRGoodCount + txOCRErrorCount))) + "%";
        String qaccuracy = decimalFormat.format(100*(qnOCRGoodCount/(qnOCRGoodCount + qnOCRErrorCount))) + "%";

        System.out.println("百度识别准确率 ： " + baccuracy);
        System.out.println("阿里识别准确率 ： " + aaccuracy);
        System.out.println("腾讯识别准确率 ： " + taccuracy);
        System.out.println("全能识别准确率 ： " + qaccuracy);

        System.out.println("百度OCR优秀数量： " + bdOCRGoodCount);
        System.out.println("阿里OCR优秀数量： " + alOCRGoodCount);
        System.out.println("腾讯OCR优秀数量： " + txOCRGoodCount);
        System.out.println("全能OCR优秀数量： " + qnOCRGoodCount);

        System.out.println("百度OCR不优秀数量： " + bdOCRErrorCount);
        System.out.println("阿里OCR不优秀数量： " + alOCRErrorCount);
        System.out.println("腾讯OCR不优秀数量： " + txOCRErrorCount);
        System.out.println("全能OCR不优秀数量： " + qnOCRErrorCount);

        System.out.println("百度识别状态集：  " + bdstringBuilder.toString());
        System.out.println("阿里识别状态集：  " + alstringBuilder.toString());
        System.out.println("腾讯识别状态集：  " + txstringBuilder.toString());
        System.out.println("全能识别状态集：  " + qnstringBuilder.toString());


            bufferedReader.close();
            //bufferedWriter.close();
    }
    public static List<String>  AligningStr(String str1, String str2){
        int i = 0;
        a : for (int j = 0; j < str1.length(); j++) {
            int startIndex = j;
            for (int k = 0; k < 10; k++) {
                if (str2.charAt(j) == str1.charAt(j)){
                    continue a;
                }
                if (str1.charAt(j) == ' '){
                    break;
                }
                if ((j + k) > str2.length()){
                    break;
                }
                if (str1.charAt(j) == str2.charAt(j + k)){
                    for (int l = 0; l < k+1; l++) {
                        if (k == 0){
                            break ;
                        }
                        StringBuilder sb = new StringBuilder(str1);
                        sb.insert(j," ");
                        str1 = sb.toString();
                    }
                    continue a;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(str2);
            stringBuilder.insert(startIndex," ");
            str2 = stringBuilder.toString();
            j++;

        }
        List<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        return  list;
    }
}
