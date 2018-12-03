package com.work.ioutil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class TxtContentSort {
    public static void main(String[] args) throws Exception {
        String path = "F:\\项目\\springboot\\src\\main\\resources\\static\\newbatqOCR.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\项目\\springboot\\src\\main\\resources\\static\\newbatqOCRsum.txt"));

        String str1;
        String str2;
        String str3;
        Map<Integer,List<String>> contents = new HashMap<>();

        while ((str1=bufferedReader.readLine())!=null) {
            List<String> list = new ArrayList<>();
           str2 = bufferedReader.readLine();
            System.out.println(str2);
           str2 = str2.replaceAll(" ","");
           str3 =str2.split("\\.") [0];
           int key = Integer.parseInt(str3);
            list.add(bufferedReader.readLine());
            list.add(bufferedReader.readLine());
            list.add(bufferedReader.readLine());
            list.add(bufferedReader.readLine());
            contents.put(key,list);
            System.out.println(key);

        }
        Set set = contents.keySet();
        List<Integer> list1 = new ArrayList(set);
        Collections.sort(list1);
        for (int i = 0; i < list1.size(); i++) {

            int key = list1.get(i);
            bufferedWriter.write(key + ".jpg");
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.flush();
            int ceshisize = contents.get(key).size();
            for (int j = 0; j < contents.get(key).size(); j++) {
                bufferedWriter.write(contents.get(key).get(j));
                bufferedWriter.flush();
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }



            bufferedReader.close();
    }
}
