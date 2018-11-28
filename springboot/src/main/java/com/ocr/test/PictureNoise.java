package com.ocr.test;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;
import java.io.File;
import java.util.Random;

public class PictureNoise {
    private static final double rate = 0.1;
    private static final double fa = 0;
    private static final double fb = 1.0;
    private static final double fc = 2.1;

    public void generateAPicture() {
        try {
            int width = 640;
            int height = 480;
            // 创建BufferedImage对象
            Font font = new Font("微软雅黑", Font.BOLD, 160);
            BufferedImage image = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_RGB);
            // 获取Graphics2D
            Graphics2D g2d = image.createGraphics();
            // 画图
            g2d.setBackground(new Color(255, 255, 255));
            g2d.setPaint(new Color(0, 0, 0));
            g2d.clearRect(0, 0, width, height);
            g2d.setFont(font);
            g2d.drawString("Java", 140, 200);
            g2d.drawString("Python", 40, 400);
            // 释放对象
            g2d.dispose();
            // 保存文件
            ImageIO.write(image, "bmp", new File("C:\\Users\\Administrator\\Desktop\\ocr优化图片\\picture.bmp"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // generate a picture with noise
    public Image getNoise(Image sourceImage) {
        BufferedImage bi = new BufferedImage(sourceImage.getWidth(null),
                sourceImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D biContext = bi.createGraphics();

        // get a BufferedImage object from an Image object
        biContext.drawImage(sourceImage, 0, 0, null);
        biContext.dispose();

        // create an array of int type to store rgb values of each pixel
        int[] rgbs = new int[bi.getWidth() * bi.getHeight()];

        bi.getRGB(0, 0, bi.getWidth(), bi.getHeight(), rgbs, 0, bi.getWidth());

        Random rd = new Random();
        int index = 0;
        for (int i = 0; i < bi.getHeight(); i++) {
            for (int j = 0; j < bi.getWidth(); j++, index++) {
                if (rd.nextDouble() < rate)
                    rgbs[index] = (rgbs[index] & 0xff000000)
                            | (~rgbs[index] & 0x00ffffff);
            }
        }

        // create a new Image object
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image image = kit.createImage(new MemoryImageSource(bi.getWidth(), bi
                .getHeight(), rgbs, 0, bi.getWidth()));

        return image;
    }

    public Image reduceNoise(Image sourceImage, double fa, double fb, double fc) {
        BufferedImage bi = new BufferedImage(sourceImage.getWidth(null),
                sourceImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D biContext = bi.createGraphics();

        // get a BufferedImage object from an Image object
        biContext.drawImage(sourceImage, 0, 0, null);
        biContext.dispose();

        // create an array of int type to store rgb values of each pixel
        int[] rgbs = new int[bi.getWidth() * bi.getHeight()];

        bi.getRGB(0, 0, bi.getWidth(), bi.getHeight(), rgbs, 0, bi.getWidth());

        int height = bi.getHeight(), width = bi.getWidth();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                double dd;
                int d1, d2, d3;

                d1 = 2;
                if ((rgbs[i * width + j] & 0x00ffffff) == 0)
                    d1 = -2;
                d2 = 0;
                int rc[][] = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
                for (int k = 0; k < 4; k++) {
                    if (isValid(i + rc[k][0], j + rc[k][1], height, width)) {
                        if ((rgbs[(i + rc[k][0]) * width + j + rc[k][1]] & 0x00ffffff) == (rgbs[i
                                * width + j] & 0x00ffffff))
                            d2 += -2;
                        else
                            d2 += 2;
                    }
                }
                d2 *= 2;
                d3 = -2;

                dd = fa * d1 - fb * d2 - fc * d3;
                if (dd < 0)
                    rgbs[i * width + j] = (rgbs[i * width + j] & 0xff000000)
                            | (~rgbs[i * width + j] & 0x00ffffff);
            }
        }

        // create a new Image object
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image image = kit.createImage(new MemoryImageSource(bi.getWidth(), bi
                .getHeight(), rgbs, 0, bi.getWidth()));

        return image;
    }

    private boolean isValid(int row, int col, int height, int width) {
        return (row >= 0 && row < height && col >= 0 && col < width);
    }

    public static void main(String[] args) {
        PictureNoise pictureNoise = new PictureNoise();
        ImageIOer imageIOer = new ImageIOer();

        pictureNoise.generateAPicture();

        Image sourceImage = imageIOer.myRead("C:\\Users\\Administrator\\Desktop\\ocr_picture\\9f9df212eb3b433894053abbe617d89e.bmp");
        Image noiseImage = pictureNoise.getNoise(sourceImage);

        Image noNoiseImage = pictureNoise.reduceNoise(noiseImage, fa, fb, fc);

        imageIOer.myWrite(noiseImage, "C:\\Users\\Administrator\\Desktop\\ocr优化图片\\picture_with_noise");
        imageIOer.myWrite(noNoiseImage, "C:\\Users\\Administrator\\Desktop\\ocr优化图片\\picture_noise_processed");
    }

}
