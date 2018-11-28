package com.ocr.test;

import java.util.UUID;

public class Demo {
    public static void main(String[] args) {
        ImageIOer imageIOer = new ImageIOer();
        String name = UUID.randomUUID().toString().replaceAll("-","") ;
        imageIOer.myWrite(imageIOer.myRead("C:\\Users\\Administrator\\Desktop\\ocr_picture\\9f9df212eb3b433894053abbe617d89e.jpg"),"C:\\Users\\Administrator\\Desktop\\ocr优化图片\\" + name);
        //C:\Users\Administrator\Desktop\ocr优化图片
    //    System.out.println(General.getmessage(General.getMessage("C:\\Users\\Administrator\\Desktop\\ocr_picture\\9f9df212eb3b433894053abbe617d89e.jpg")));
    }
}
