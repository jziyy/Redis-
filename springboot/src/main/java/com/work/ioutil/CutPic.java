package com.work.ioutil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CutPic {
    public static void main(String[] args) {
        List list = new ArrayList();
        String bolder = "C:\\Users\\Administrator\\Desktop\\新建文件夹 (3)";
        File file = new File("E:\\work\\labelImg\\JPEGImages");
        File [] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            for (int j = 0; j < files.length; j++) {
                String string = files[i].getName();
                String string1 = files[j].getName();

                if ( (!string.equals(string1)) &&string.substring(0,string.length() - 4).equals(string1.substring(0,string1.length() - 4))){
                    cut(files[i], new File(bolder + "\\" + files[i].getName()));
                    cut(files[j], new File(bolder + "\\" + files[i].getName()));
                }
            }
        }
    }

    public static void  cut(File file1, File file2) {
        file1.deleteOnExit();
        try {
            //在D盘创建文件2
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        cutFile(file1, file2);
    }
    public static void cutFile(File file1, File file2){
        FileOutputStream fileOutputStream = null;
        InputStream inputStream = null;
        byte[] bytes = new byte[1024];
        int temp = 0;
        try {
            inputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream(file2);
            while((temp = inputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes, 0, temp);
                fileOutputStream.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
