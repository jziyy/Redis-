package com.work.picture_find;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindCount {
    public static void main(String[] args) {
        File file =new File("E:\\work\\表格梳理\\2\\mouse\\result_images");
        File [] files =file.listFiles();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Map<String,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < 10 ; i++) {
            map.put(decimalFormat.format(0.7+(0.01*i)),0);

        }
        List<String> list =new ArrayList<>(map.keySet());
        for (int i = 0; i < files.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (("r_" + list.get(j)).equals(files [i].getName().substring(0,6))){
                    map.put(list.get(j),map.get(list.get(j))+1);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < map.size(); i++) {
            sum += map.get(list.get(i));
        }
        map.put("0.80",files.length -sum);
        List<String> list1 = new ArrayList<>(map.keySet());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i) + " :  " + map.get(list1.get(i)));
        }
        System.out.println("总数是：" + files.length);
    }
}
