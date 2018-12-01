package com.work.ocr.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchErrorInfoFromTxt {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\项目\\springboot\\src\\main\\resources\\static\\newbatqyouhuaOCR.txt"));

        String str1;
        while ((str1=bufferedReader.readLine())!=null) {
          if (!str1.matches(".*(txOcr|alOcr|bdocr).*")){
              if (str1.startsWith("qnOcr")){
                  continue;
              }
              System.out.println(str1);
          }
        }




        bufferedReader.close();
    }
}
