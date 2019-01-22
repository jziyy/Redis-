package com.demo;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo2 {
    public static   void main(String[] args) {
       Map<String,Object> map = new HashMap<>();
       List<String> list = new ArrayList<>();
       Map<String,List<String>> map1 =new HashMap<>();
       list.add("asdlgolo23g");
       list.add("asdasd2312g%");
       map1.put("蛋白质",list);
       map.put("营养成分表",map1);
        System.out.println(NumericalOptimizationOfNutritionTable(map));

    }
    public static Map<String, Object> NumericalOptimizationOfNutritionTable(Map<String, Object> map) {
        Map<String,Object> resultmap = new HashMap<>();
        Map<String, List<String>> nutritionMap = (Map<String, List<String>>) map.get("营养成分表");
        for (Map.Entry entry : nutritionMap.entrySet()) {
            List<String> list = (List<String>) entry.getValue();
            for (int i = 0; i < 2; i++) {
                if (StringUtils.isNotEmpty(String.valueOf(list.get(i)))) {
                    list.set(i, list.get(i).replace("o", "0").replace("O", "0"));
                }
                if (StringUtils.isNotEmpty(String.valueOf(list.get(i))) && isNotContainManyLetter(list.get(i)) ){
                    String string =list.get(i);
                    if (list.get(i).length() >=2){
                        list.set(i,string.replace(string.substring(0,string.length() -1),
                                string.substring(0,string.length()-1)
                                        .replace("l","1")
                                        .replace("g","9")));
                    }

                }
            }
            nutritionMap.put(entry.getKey().toString(),list);

        }
        map.put("营养成分表",nutritionMap);
        return map;
    }

    //判断是否包含多个字母
    public static boolean isNotContainManyLetter(String s){
        int state = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >=97 && s.charAt(i) <= 122)){
                state ++;
            }
            if (state >= 4){
                return false;
            }
        }

        return true;
    }
}
