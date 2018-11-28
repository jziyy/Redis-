package com.work.ioutil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AddLineText {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader =new BufferedReader(new FileReader("F:\\项目\\springboot\\src\\main\\resources\\static\\batqOCR.txt"));
        BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("F:\\项目\\springboot\\src\\main\\resources\\static\\newbatqOCR.txt"));
        boolean b = true;
        while(bufferedReader.readLine()!=null){
            if (b == true) {
                for (int i = 0; i < 4; i++) {
                    String buff = bufferedReader.readLine();
                    bufferedWriter.write(buff);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
                bufferedWriter.newLine();
                bufferedWriter.flush();
                b=!b;
            }
            else{
                for (int i = 0; i < 4; i++) {
                    String buff = "yy" + bufferedReader.readLine();
                    bufferedWriter.write(buff);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
                bufferedWriter.newLine();
                bufferedWriter.flush();
                b=!b;
            }
        }
    }
}
