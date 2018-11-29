package com.work.ioutil;

import java.io.File;
import java.util.regex.Pattern;

/**
 * 将文件夹中包含关键字的文件提取出来
 */
public class CopyKeyFile {
    public static void main(String[] args) {
        String newPath = "E:\\work\\OCR\\demo1\\demo1\\aaa\\a\\a";
        String intePath = "E:\\work\\OCR\\测试原图和优化图片";
        copyKeyFile(intePath,newPath,".*q.*");

    }

    /**
     * 将文件夹中包含关键字的文件提取到指定的目录下，当目录地址不存在时自动创建目录
     * @param initPath  包含文件的地址
     * @param newPath   需要被复制到的地址
     * @param key       关键字
     */
    public static void copyKeyFile(String initPath,String newPath,String key){

        File file  =new File(initPath);
        File file1 =new File(newPath);
        if (!file1.exists()){
            file1.mkdirs();
            System.out.println(file1.getAbsolutePath());
        }
        File [] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (Pattern.matches(key,files[i].getName())){
                FindSameName.copyFile(files[i].getAbsolutePath(),newPath);
            }
        }
    }


}
