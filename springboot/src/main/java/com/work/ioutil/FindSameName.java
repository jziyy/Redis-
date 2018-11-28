package com.work.ioutil;

import java.io.*;

/**
 * 挑出两个文件夹中相同名称的文件并提取出来
 */
public class FindSameName {
    public static void main(String[] args) {
        findSameFile("C:\\Users\\Administrator\\Desktop\\OCR\\新建文件夹 - 副本","C:\\Users\\Administrator\\Desktop\\OCR\\新建文件夹 (3)","C:\\Users\\Administrator\\Desktop\\OCR\\测试");


    }
    public static void findSameFile(String path1,String path2,String resultpath){
        File file =new File(path1);
        File file1 = new File(path2);
        File [] files = file.listFiles();
        File [] files1 = file1.listFiles();
        for (int i = 0; i < files.length; i++) {
            for (int j = 0; j < files1.length; j++) {
                if (files[i].getName().equals(files1[j].getName())){
                    copyFile(files[i].getAbsolutePath(),resultpath );
                }
            }
        }
    }
    public static void copyFile(String path,String resultPath){
        InputStream inputStream = null;
        OutputStream outputStream =null;
        try {
            File file = new File(path);
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(new File(resultPath + "\\"+file.getName()));
            byte [] buff = new byte[1024];
            int len =0;
            while ((len =inputStream.read(buff))!=-1){
                 outputStream.write(buff,0,len);
            }
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
