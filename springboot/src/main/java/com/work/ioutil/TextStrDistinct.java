package com.work.ioutil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 去除重复的行内容
 */
public class TextStrDistinct {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\去重.txt");
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String temp = null;
        while ((temp =bufferedReader.readLine())!=null){
            list.add(temp);
        }
        List<String> list1 =new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && i != j){
                    list1.remove(list.get(i));
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).contains(list.get(j)) && i != j){
                    list1.remove(list.get(j));
                }
            }
        }
        for (String s:
             list1) {
            System.out.println(s);
        }
    }
}
