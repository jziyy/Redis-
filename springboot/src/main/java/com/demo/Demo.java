package com.demo;


import java.util.*;

public class Demo {

    public static void main(String[] args) {
            String s ="每100克g营养素参考值%能2520千焦kJ30%蛋25.3克g42%脂肪45.6克g76%碳水化合物23.7克g8%钠257毫克mg13%";
            System.out.println(FuzzyMatching(s));
        }
    public static String FuzzyMatching(String str) {
        List<String> list = getNutritionMatch();
        List<String> list1 = getNeedNutritionList();
        str = str.replace("(", "");
        str = str.replace(")", "");

        b : for(int i = 0; i < str.length() ;i++) {
            char c = str.charAt(i);
            for(int j=0;j<list.size();j++ ) {
                if (list.get(j).equals("") || list.get(j).equals(null)) {
                    continue;
                }
                //判断是否包含规则字符list.get(j)
                if (list.get(j).contains(c+"")) {
                    //符合条件字符串长度
                    int strLength =list1.get(j).length();
                    //使用replace
                    //判断截取字符串的索引是否超过str的长度或者小于0
                    int a = 0;
                    int b = 0;
                    if (i-strLength<0) {
                        a = 0;
                    }else {
                        a = i-strLength;
                    }
                    if (i + strLength >= str.length()) {
                        b = str.length();
                        if (a > b) {
                            continue;
                        }
                    } else {
                        b = i+strLength;
                    }
                    //截取得的stra
                    String stra =str.substring(a, b);

                    for (int k = 0; k < list1.size(); k++) {
                        for(int aaa = 0; aaa < list1.size() ; aaa++) {
                            if (stra.contains(list1.get(aaa))) {
                                continue b;
                            }
                        }
                        //stra.contains(list.get(k))
                        boolean state = false;
                        String s = list.get(k);
                        for (int l = 0; l < s.length(); l++) {
                            if (stra.contains(String.valueOf(s.charAt(l)))){
                                state =true;
                            };
                        }
                        if (true) {
                            //for (int k2 = 0; k2 < stra.length(); k2++) {
                            int k2_middle = stra.indexOf(c + "");
                            int k2_left = k2_middle;
                            int k2_right = k2_middle ;
                            for (int l = k2_middle; l >= 0; l--) {
                                if (!list1.toString().contains(stra.charAt(l) + "")) {
                                    if (k2_left == 0) {
                                        break;
                                    }
                                    k2_left = l + 1;
                                    break ;
                                }
                                k2_left = l;
                            }
                            for (int l = k2_middle; l < stra.length(); l++) {
                                if (!list1.toString().contains(stra.charAt(l) + "")) {
                                    k2_right = l;
                                    break ;
                                }
                            }

                            //为字符串添加长度
                            String straDemo = stra + "jziyy";

                            if (k2_left >=k2_right) {
                                k2_right = k2_left + 1;
                            }
                            String straReplace = straDemo.substring(k2_left, k2_right );

                            String strReplace = stra.replaceAll(straReplace, list1.get(j));

                            str=str.replaceFirst(stra, strReplace);

                            continue b ;

                        }
                    }

                }





            }
        }
        return str;


    }
    public static List<String> getNutritionMatch(){
            List<String> list = new ArrayList<>();
        list.add("能量");
        list.add("蛋白质");
        list.add("固醇");
        list.add("碳水化合");
        list.add("膳食纤");
        list.add("A");
        list.add("D");
        list.add("E");
        list.add("K");
        return list;
    }
    public static List<String> getNeedNutritionList() {
        List<String> list = new ArrayList<String>();
        list.add("能量");
        list.add("蛋白质");
        list.add("胆固醇");
        list.add("碳水化合物");
        list.add("膳食纤维");
        list.add("维生素A");
        list.add("维生素D");
        list.add("维生素E");
        list.add("维生素K");
        return list;

    }
    }
