package com.work.ioutil;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 国际化字段处理
 */
public class GJH {
    public static void main(String[] args) throws IOException {
        File file =new File("C:\\Users\\Administrator\\Desktop\\新建文件夹 (3)");
        File fileMR = new File(file.getAbsolutePath() + "\\" + "默认.txt");
        File fileZW = new File(file.getAbsolutePath() + "\\" + "zh.txt");
        File file1 =new File(file.getAbsolutePath() + "\\" + "newfile.txt");
        BufferedReader bufferedReaderMR = new BufferedReader(new FileReader(fileMR));
        BufferedReader bufferedReaderZW = new BufferedReader(new FileReader(fileZW));
        //文件
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
        List<String> zsum = new ArrayList<>();
        List<String> sum = new ArrayList<>();
        List<String> defiency = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            String buff = bufferedReaderMR.readLine();
            if (buff == null ){
                break;
            }
            if (buff.replaceAll(" ","").equals("")){
                continue;
            }
            if (buff.contains("=")) {
                sum.add(buff);
            }
        }


        for (int i = 0; i < 1000000; i++) {
            String buff = bufferedReaderZW.readLine();
            if (buff == null ){
                break;
            }
            if (buff.replaceAll(" ","").equals("")){
                continue;
            }
            if (buff.contains("=")) {
                zsum.add(buff);
            }
        }
        Map<String,String> map =new HashMap();
        for (int i = 0; i < sum.size(); i++) {
            String [] aaa = sum.get(i).split("=");
            map.put(aaa [0].trim(),aaa[1].trim());
        }

        List<String> zlist = new ArrayList<>();
        zsum.forEach(s -> {zlist.add(s.split("=")[0].trim());});



        zlist.forEach(s -> {
            if (map.containsKey(s)){
                map.remove(s);
            }


        });

        List<String> list = new ArrayList<>(map.keySet());
        list.forEach(s ->{
            try {
                bufferedWriter.write(s +"="+ map.get(s));
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });



    bufferedReaderMR.close();
    bufferedWriter.close();
    bufferedReaderZW.close();



    }
    private static String unicodeToCn(String unicode) {
        String[] strs = unicode.split("\\\\u");
        String returnStr = "";
        // 由于unicode字符串以 \ u 开头，因此分割出的第一个字符是""。
        for (int i = 1; i < strs.length; i++) {
            returnStr += (char) Integer.valueOf(strs[i], 16).intValue();
        }
        return returnStr;
    }
}
