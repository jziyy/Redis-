package com.work.ioutil;

import java.io.File;

public class GetRemainFile {
    public static void main(String[] args) {
        File file =new File("C:\\Users\\Administrator\\Documents\\CoCall4\\16212@test\\recvfile\\金娟\\20181129中午拍摄城乡仓储");
        File [] files =file.listFiles();
        String regex ="11|12|15|25|28|32|33|36|37|53|54|57|61|65|66|73|76|79|83|88";
        for (int i = 0; i <files.length; i++) {
            if (!files [i].getName().split("\\.")[0].matches(regex)){
               continue;
            }
            FindSameName.copyFile(files[i].getAbsolutePath(),"E:\\work\\OCR\\aaa1");
        }
    }
}
