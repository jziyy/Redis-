package com.work.ioutil;

import java.io.File;

public class ChangeName {
    public static void main(String[] args) {
       String path = "E:\\work\\OCR\\demo1";
       changeName(path,"a");
    }
    public static void changeName(String filePath,String placeHolder){
        File file =new File(filePath);
        File[] files = file.listFiles();
        for (int i = 0; i <files.length ; i++) {
            files[i].renameTo(new File(files[i].getParent() + "//" + placeHolder + i + ".jpg"));
        }
    }
}
