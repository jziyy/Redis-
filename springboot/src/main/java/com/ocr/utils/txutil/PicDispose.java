package com.ocr.utils.txutil;

import net.coobird.thumbnailator.Thumbnails;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;

public class PicDispose {
    public static String picDispose(String picPath){
        String newFilePath = picPath;
        double maxWidth =4096;
        double maxHeight =4096;
        double scale = 1;
        File file = new File(picPath);
        try {
            BufferedImage image = ImageIO.read(new FileInputStream(file));
            double width = image.getWidth();
            double height = image.getHeight();
            if (width >= maxWidth){
                double temp =maxWidth/width;
                scale = temp*0.9;
            }

            if (height >= maxHeight){
                double temp1 = maxHeight/height;
                if (scale > temp1*0.9){
                    scale = temp1*0.9;
                }
            }

            long len =file.length()/1024;

            newFilePath = "C:\\Users\\Administrator\\Desktop\\新建文件夹 (5)\\" + file.getName();

            Thumbnails.of(picPath).scale(scale).toFile(newFilePath);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return  newFilePath;
    }

}
