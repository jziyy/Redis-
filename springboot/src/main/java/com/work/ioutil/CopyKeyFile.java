package com.work.ioutil;

import java.io.File;

public class CopyKeyFile {
    public static void main(String[] args) {
        String newPath = "E:\\work\\OCR\\优化图片";
        File file  =new File("E:\\work\\OCR\\测试原图和优化图片");
        File [] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().contains("q")){
                FindSameName.copyFile(files[i].getAbsolutePath(),newPath);
            }
        }
    }

}
