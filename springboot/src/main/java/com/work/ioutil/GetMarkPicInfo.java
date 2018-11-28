package com.work.ioutil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class GetMarkPicInfo {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader =new BufferedReader(new FileReader("F:\\项目\\springboot\\src\\main\\resources\\static\\newbatqOCR.txt"));
        BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("F:\\项目\\springboot\\src\\main\\resources\\static\\batqOCR.txt"));
        String s ="";
        while((s=bufferedReader.readLine())!=null) {
            if (s.startsWith("yy") || s.replaceAll(" ","").equals("")){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }


        }
    }
}
