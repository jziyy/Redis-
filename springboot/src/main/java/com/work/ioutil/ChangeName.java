package com.work.ioutil;

import java.io.File;

public class ChangeName {
    public static void main(String[] args) {
       String path = "C:\\Users\\Administrator\\Documents\\CoCall4\\16212@test\\recvfile\\杨澜\\邵金智";
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
