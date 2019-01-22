package com.work.ioutil;

import java.io.File;

public class CreatTenDir {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\新建文件夹 (2)");
        for (int i = 0; i < 10; i++) {
            File file1 = new File(file.getAbsolutePath() + "//" + i);
            file1.mkdir();
        }
    }
}
